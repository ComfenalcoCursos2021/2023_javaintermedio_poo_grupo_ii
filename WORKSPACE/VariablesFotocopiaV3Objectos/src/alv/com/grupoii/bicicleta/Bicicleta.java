package alv.com.grupoii.bicicleta;


public class Bicicleta {
	
	private String marca;
	private int rin;
	private int cambiosDelanteros;
	private int cambiosTraseros;
	
	public Bicicleta () {}
	
	public Bicicleta(String marcaValue, int rinValue, int cambiosDelanterosValue, int cambiosTraserosValue) {
		this.marca = marcaValue;
		this.rin = rinValue;
		this.cambiosDelanteros = cambiosDelanterosValue;
		this.cambiosTraseros = cambiosTraserosValue;			
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getRin() {
		return rin;
	}
	public void setRin(int rin) {
		this.rin = rin;
	}
	public int getCambiosDelanteros() {
		return cambiosDelanteros;
	}
	public void setCambiosDelanteros(int cambiosDelanteros) {
		this.cambiosDelanteros = cambiosDelanteros;
	}
	public int getCambiosTraseros() {
		return cambiosTraseros;
	}
	public void setCambiosTraseros(int cambiosTraseros) {
		this.cambiosTraseros = cambiosTraseros;
	}
	
	
}
