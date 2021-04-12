package Concesionario;

public class cocheRenovable extends coche{
	private String energia;
	private double precio;
	/**
	 * @param marca
	 * @param modelo
	 * @param puertas
	 * @param color
	 * @param caballos
	 * @param energia
	 */
	public cocheRenovable(String marca, String modelo, float puertas, String color, float caballos, String energia) {
		super(marca, modelo, puertas, color, caballos);
		this.energia = energia;
	}
	public String getEnergia() {
		return energia;
	}
	public void setEnergia(String energia) {
		this.energia = energia;
	}
	public double getPrecio() {
		precio=getCaballos()*120+1/(getPuertas())*10000+20000;
		return precio;
	}
	public String getTodor() {
		String todor=getMarca()+" "+getModelo()+"; "+getPuertas()+" puertas, "+getColor()+", "+getCaballos()+" caballos; "+getEnergia()+" "+getPrecio()+" euros.";
		System.out.println(todor);
		return todor;
	}
}
