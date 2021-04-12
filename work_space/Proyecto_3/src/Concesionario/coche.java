package Concesionario;

public class coche {
	private String marca;
	private String modelo;
	private float puertas;
	private String color;
	private float caballos;
	private double precio;
	/**
	 * @param marca
	 * @param modelo
	 * @param puertas
	 * @param color
	 * @param caballos
	 */
	public coche(String marca, String modelo, float puertas, String color, float caballos) {
		this.marca = marca;
		this.modelo = modelo;
		this.puertas = puertas;
		this.color = color;
		this.caballos = caballos;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPuertas() {
		return puertas;
	}
	public void setPuertas(float puertas) {
		this.puertas = puertas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getCaballos() {
		return caballos;
	}
	public void setCaballos(float caballos) {
		this.caballos = caballos;
	}
	public double getPrecio() {
		precio=caballos*120+(1/puertas)*10000;
		return precio;
	}
	public String getTodo() {
		String todo=marca+" "+modelo+"; "+puertas+" puertas, "+color+", "+caballos+" caballos; "+getPrecio()+" euros.";
		System.out.println(todo);
		return todo;
	}
}
