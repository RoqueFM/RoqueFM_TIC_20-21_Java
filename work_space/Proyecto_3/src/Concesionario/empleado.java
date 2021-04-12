package Concesionario;

public class empleado {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int anios;
	private float puesto;
	private float genero;
	private String Puesto;
	private String puesto0[]= {"Director","Subdirector","Secretario","Subsecretario","Limpiador"};
	private String puesto1[]= {"Directora","Subdirectora","Secretaria","Subsecretaria","Limpiadora"};
	private double nomina;
	//genero=0 --> hombre; genero=1 --> mujer
	public empleado(String nombre, String apellido1, String apellido2, int anios, float puesto, float genero) {
		this.nombre = nombre;		//Nombre
		this.apellido1 = apellido1;	//Primer apellido
		this.apellido2 = apellido2;	//Segundo apellido
		this.anios = anios;			//Edad
		this.puesto = puesto;		//Puesto (para la matriz)
		this.genero=genero;			//Genero (0 o 1 (o más))
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public float getAnios() {
		return anios;
	}
	public void setAnios(int anios) {
		this.anios = anios;
	}
	public float getPuesto() {
		return puesto;
	}
	public void setPuesto(float puesto) {
		this.puesto = puesto;
	}
	public float getGenero() {
		return genero;
	}
	public void setGenero(float genero) {
		this.genero = genero;
	}
	public String getNombrepuesto() {
		if(genero==0) {
			Puesto=puesto0[(int) puesto];
		}else if(genero==1){
			Puesto=puesto1[(int)puesto];
		}else if(genero==2) {
			Puesto="Genero no binario: "+puesto0[(int) puesto];
		}
		return Puesto;
	}
	public double getNomina() {
	//Esta funcion intenta acercarse a la realidad, no tomarla como ninguna discriminación :)
		nomina=(1/(getPuesto()+1)*3000+100);
		return nomina;
	}
	public String getTodo() {
		String todo;
		todo=nombre+" "+apellido1+" "+apellido2+"; "+anios+" años, "+getNombrepuesto()+" nomina: "+getNomina()+"€";
		System.out.println(todo);
		return todo;
	}
}