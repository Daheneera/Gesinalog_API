package es.mdef.gesinalog_API.entidades;

import java.time.LocalDate;
import java.util.List;

import com.luque.librerias.utilidades.IncidenciaImpl;

import jakarta.persistence.OneToMany;



public class IncidenciaConId extends IncidenciaImpl{

	
	
	private Long id;
	private String descripcion;
	private Estado estadoIncidencia;
	private LocalDate fechaAlta;
	private LocalDate fechaInicio;
	private InstalacionConId instalacion;
	private Tipo tipoIncidencia;
	private Prelacion urgencia;
	private List<Valoracion> valoraciones;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Estado getEstadoIncidencia() {
		return estadoIncidencia;
	}
	public void setEstadoIncidencia(Estado estadoIncidencia) {
		this.estadoIncidencia = estadoIncidencia;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public InstalacionConId getInstalacion() {
		return instalacion;
	}
	public void setInstalacion(InstalacionConId instalacion) {
		this.instalacion = instalacion;
	}
	public Tipo getTipoIncidencia() {
		return tipoIncidencia;
	}
	public void setTipoIncidencia(Tipo tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}
	public Prelacion getUrgencia() {
		return urgencia;
	}
	public void setUrgencia(Prelacion urgencia) {
		this.urgencia = urgencia;
	}
	public List<Valoracion> getValoraciones() {
		return valoraciones;
	}
	public void setValoraciones(List<Valoracion> valoraciones) {
		this.valoraciones = valoraciones;
	}
	@Override
	public String toString() {
		return "IncidenciaConId [id=" + id + ", descripcion=" + descripcion + ", estadoIncidencia=" + estadoIncidencia
				+ ", fechaAlta=" + fechaAlta + ", fechaInicio=" + fechaInicio + ", instalacion=" + instalacion
				+ ", tipoIncidencia=" + tipoIncidencia + ", urgencia=" + urgencia + ", valoraciones=" + valoraciones
				+ "]";
	}



		
		
}
