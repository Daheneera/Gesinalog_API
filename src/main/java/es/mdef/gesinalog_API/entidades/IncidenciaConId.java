package es.mdef.gesinalog_API.entidades;

import java.util.List;

import com.luque.librerias.utilidades.Incidencia;
import com.luque.librerias.utilidades.IncidenciaImpl;




public class IncidenciaConId extends IncidenciaImpl implements Incidencia{

	
	
	private Long id;

	private List<Valoracion> valoraciones;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public List<Valoracion> getValoraciones() {
		return valoraciones;
	}
	public void setValoraciones(List<Valoracion> valoraciones) {
		this.valoraciones = valoraciones;
	}
	@Override
	public String toString() {
		return "IncidenciaConId [id=" + id + ", valoraciones=" + valoraciones + "]";
	}
	

	
	
	

	



		
		
}
