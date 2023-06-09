package es.mdef.gesinalog_API.REST.incidencia;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import com.luque.librerias.utilidades.Incidencia;

import es.mdef.gesinalog_API.REST.instalacion.InstalacionController;
import es.mdef.gesinalog_API.entidades.IncidenciaConId;
import es.mdef.gesinalog_API.entidades.InstalacionConId;

@Component
public class IncidenciaListaAssembler<T extends Incidencia> implements RepresentationModelAssembler<T, IncidenciaListaModel> {

	@Override
	public IncidenciaListaModel toModel(T entity) {
		
		IncidenciaListaModel model = new IncidenciaListaModel();
		model.setDescripcion(entity.getDescripcion());
		model.setEstadoIncidencia(entity.getEstadoIncidencia());
		model.setFechaAlta(entity.getFechaAlta());
		model.setFechaInicio(entity.getFechaInicio());
		model.setTipoIncidencia(entity.getTipoIncidencia());
		model.setUrgencia(entity.getUrgencia());
		model.add(
				linkTo(methodOn(IncidenciaController.class).one(((IncidenciaConId)entity).getId())).withSelfRel(),
				linkTo(methodOn(InstalacionController.class).one(((InstalacionConId)entity.getInstalacion()).getId())).withRel("instalacion")
				);
		return model;
	}

	
	public CollectionModel<IncidenciaListaModel> toCollection(List<T> lista){
		CollectionModel<IncidenciaListaModel> collection = CollectionModel.of(lista.stream().map(this::toModel).
				collect(Collectors.toList()));
				collection.add(
						linkTo(methodOn(IncidenciaController.class).all()).withRel("incidencias")
						);

		return collection;
		
	}
}
