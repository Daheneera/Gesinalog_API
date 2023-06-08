package es.mdef.gesinalog_API.REST.valoracion;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import es.mdef.gesinalog_API.entidades.IncidenciaConId;
import es.mdef.gesinalog_API.entidades.Usuario;

@Relation(collectionRelation = "valoraciones")
public class ValoracionListaModel extends RepresentationModel<ValoracionListaModel> {
	
	private Integer puntuacion;

	
	public Integer getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}
	@Override
	public String toString() {
		return "ValoracionListaModel [puntuacion=" + puntuacion + "]";
	}

	
	
}
