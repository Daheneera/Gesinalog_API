package es.mdef.gesinalog_API.REST.instalacion;



import java.util.List;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import com.luque.librerias.utilidades.InstalacionImpl.Tipo;









@Relation(itemRelation = "instalacion")
public class InstalacionModel extends RepresentationModel<InstalacionModel> {


		
	private String nombre;
	private Boolean a_c;
	private Tipo tipoInstalacion;
	private List<String> mobiliario;
	private Boolean telefono;
	private Boolean tv;
	private Integer numCamas;
	private Integer aforo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean getA_c() {
		return a_c;
	}
	public void setA_c(Boolean a_c) {
		this.a_c = a_c;
	}
	public Tipo getTipoInstalacion() {
		return tipoInstalacion;
	}
	public void setTipoInstalacion(Tipo tipoInstalación) {
		this.tipoInstalacion = tipoInstalación;
	}
	public List<String> getMobiliario() {
		return mobiliario;
	}
	public void setMobiliario(List<String> mobiliario) {
		this.mobiliario = mobiliario;
	}
	public Boolean getTelefono() {
		return telefono;
	}
	public void setTelefono(Boolean telefono) {
		this.telefono = telefono;
	}
	public Boolean getTv() {
		return tv;
	}
	public void setTv(Boolean tv) {
		this.tv = tv;
	}
	public Integer getNumCamas() {
		return numCamas;
	}
	public void setNumCamas(Integer numCamas) {
		this.numCamas = numCamas;
	}
	public Integer getAforo() {
		return aforo;
	}
	public void setAforo(Integer aforo) {
		this.aforo = aforo;
	}
	@Override
	public String toString() {
		return "InstalacionModel [nombre=" + nombre + ", a_c=" + a_c + ", tipoInstalación=" + tipoInstalacion
				+ ", mobiliario=" + mobiliario + ", telefono=" + telefono + ", tv=" + tv + ", numCamas=" + numCamas
				+ ", aforo=" + aforo + "]";
	}
	
	
}
