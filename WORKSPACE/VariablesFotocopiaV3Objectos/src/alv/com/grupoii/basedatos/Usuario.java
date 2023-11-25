package alv.com.grupoii.basedatos;

import java.util.Date;

public class Usuario {
	
	private long id;
	private String nombres;
	private String apellidos;
	private Date cumpleanios;
	
	public Usuario() {
		
	}
	public Usuario(long idValue) {
		this.id= idValue;
	}
	/**
	 * Constructor de clase que permite ingresar los valores de "id" 
	 * y los "nombres" del usuari 
	 * @param idValue Identificador del registro de usuario
	 * @param nombresValue Nombres del registro de usuario
	 */
	public Usuario(long idValue, String nombresValue) {
		this.id= idValue;
		this.nombres= nombresValue;
	}
	
	public Usuario(long idValue, String nombresValue, String apellidosValue) {
		this.id= idValue;
		this.nombres= nombresValue;
		this.apellidos= apellidosValue;
	}
	
	public Usuario(long idValue, String nombresValue, Date cumpleaniosValue) {
		this.id= idValue;
		this.nombres= nombresValue;
		this.cumpleanios= cumpleaniosValue;
	}
	
	public Usuario(long idValue, String nombresValue, String apellidosValue, Date cumpleaniosValue) {
		this.id= idValue;
		this.nombres= nombresValue;
		this.apellidos= apellidosValue;
		this.cumpleanios= cumpleaniosValue;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Date getCumpleanios() {
		return cumpleanios;
	}
	public void setCumpleanios(Date cumpleanios) {
		this.cumpleanios = cumpleanios;
	}
	
	
	
}
