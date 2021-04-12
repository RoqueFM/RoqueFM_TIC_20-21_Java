package Concesionario;
import java.util.Scanner;
public class ManejaConcesionario {
	//		CONSTRUCTORES:
//COCHE=> String marca, String modelo, float puertas, String color, float caballos, +RENOVABLE--> string energia
//EMPLEADO=> String nombre, String apellido1, String apellido2, float anios, float puesto, float genero
	/*String puesto0[]= {"Director","Subdirector","Secretario","Subsecretario","Limpiador"};
	String puesto1[]= {"Directora","Subdirectora","Secretaria","Subsecretaria","Limpiadora"};*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int opcion;
		//			INICIO PROGRAMA
		System.out.println("Bienvenido al concesionario :)");
		
		//			MENU
		opcion=menu();
		System.out.println("\nRecibido, opcion: "+opcion);
		
		//			EMPLEADOS
		if(opcion==1){
		empleado empleado0=new empleado("Juan", "García", "Martínez",43,2,0);
		System.out.println("Empleado0: "+ empleado0.getNombre()+" "+empleado0.getApellido1()+" "+empleado0.getApellido2()+"; "+empleado0.getAnios()+" años,"+empleado0.getNombrepuesto());
		//Input
		empleado empleado1=new empleado("David","López","González",37,1,0);
		empleado empleado2=new empleado("María", "Domínguez", "Romero",25, 3, 1);
		empleado empleado3=new empleado("Hugo","Ramos","Domínguez",48,4,0);
		empleado empleado4=new empleado("Lucas","Rodríguez","Gracia",38,3,0);
		empleado empleado5=new empleado("Sofía","Sánchez","Pérez",43,1,1);
		empleado empleado6=new empleado("Lucía","Gómez","Martín",29,4,1);
		empleado empleado7=new empleado("Mateo","Jiménez","Ruiz",53,2,0);
		empleado empleado8=new empleado("Martín","Hernández","Díaz",41,2,0);
		empleado empleado9=new empleado("Marta","Moreno","Muñoz",36,4,1);
		empleado empleado10=new empleado("David","Álvarez","Torres",47,2,0);
		//Output
		empleado1.getTodo();empleado2.getTodo();empleado3.getTodo();empleado4.getTodo();empleado5.getTodo();empleado6.getTodo();empleado7.getTodo();empleado8.getTodo();empleado9.getTodo();empleado10.getTodo();
		/*}else if(opcion==3){
		//Segundo input empleados
		int i;
		String nombres[] = null;
		String apellidos1[] = null;
		String apellidos2[];
		float anios[];
		float puesto[];
		float genero[];
		for(i=1;i<=10;i++) {
			System.out.println("Inserte nombre de empleado"+i+": ");
			nombres[i]=reader.next();
		}
		for(i=1;i<=10;i++) {
			System.out.println("Inserte apellido de "+nombres[i]+": ");
			apellidos1[i]=reader.next();
		}*/
		}else if(opcion==12){
		//			COCHES
		//Introduccion Coches
		System.out.println("\nLista de coches: ");
		//Coches normales
		System.out.println("* Lista de coches no renovables: ");
		coche coche0=new coche("Renault", "Scenic", 5, "Blanco", 120);
		System.out.println("0. "+coche0.getMarca()+" "+coche0.getModelo()+"; "+coche0.getPuertas()+" puertas, "+coche0.getColor()+", "+coche0.getCaballos()+" caballos");
		//19 Coches:
		//Input coches no renovables
		coche coche1=new coche("Mercedes", "Clase G", 5, "Negro", 250);
		coche coche2=new coche("Opel", "Corsa", 5, "Azul", 120);
		coche coche3=new coche("Citroen", "Berlingo", 5, "Azul", 110);
		coche coche4=new coche("Peugeot", "307sw", 5, "Granate", 110);
		coche coche5=new coche("BMW", "X1", 5, "Blanco", 150);
		coche coche6=new coche("Opel", "Crossland", 5, "Naranja", 120);
		coche coche7=new coche("Renault", "4L", 3, "Turquesa", 70);
		coche coche8=new coche("Mercedes", "Kompressor", 3, "Gris", 220);
		coche coche9=new coche("Citroen", "DS", 3, "Grey", 100);
		coche coche10=new coche("Ford", "Kuga", 5, "Azul", 120);
		coche coche11=new coche("Toyota", "Land Cruiser", 5, "Verde", 220);
		coche coche12=new coche("Mercedes", "ALG", 3, "Negro", 300);
		coche coche13=new coche("Lamborghini", "Aventador", 3, "Naranja", 350);
		coche coche14=new coche("Mercedes", "CS250", 5, "Rojo", 190);
		coche coche15=new coche("Volkswagen", "Golf", 3, "Negro", 130);
		coche coche16=new coche("Dacia", "Duster", 5, "Amarillo", 150);
		coche coche17=new coche("Ford", "Fiesta", 5, "Narajna", 120);
		coche coche18=new coche("Mercedes", "Clase A", 5, "Gris", 180);
		coche coche19=new coche("Volkswagen", "Bentley", 3, "Blanco", 75);
		//Output coches no renovables
		coche1.getTodo();coche2.getTodo();coche3.getTodo();coche4.getTodo();coche5.getTodo();coche6.getTodo();coche7.getTodo();coche8.getTodo();coche9.getTodo();coche10.getTodo();coche11.getTodo();coche12.getTodo();coche13.getTodo();coche14.getTodo();coche15.getTodo();coche16.getTodo();coche17.getTodo();coche18.getTodo();coche19.getTodo();
		
		}else if(opcion==22){
		
		//Coches renovables
		System.out.println("\n* Lista de coches renovables: ");
		//Coche_r1
		cocheRenovable coche_r1=new cocheRenovable("Toyota", "Auris", 5, "Negro", 120, "Gas Natural");
		coche_r1.getTodor();
		//Input Coches renovables
		cocheRenovable coche_r2=new cocheRenovable("Toyota", "Prius", 3, "Blanco", 120, "Híbrido");
		cocheRenovable coche_r3=new cocheRenovable("Dacia", "Duster", 5, "Amarillo", 120, "Eléctrico");
		cocheRenovable coche_r4=new cocheRenovable("Volkswagen", "Up!", 3, "Gris", 100, "Eléctrico");
		cocheRenovable coche_r5=new cocheRenovable("Mini", "Voyager", 5, "Naranja", 120, "Híbrido enchufable");
		cocheRenovable coche_r6=new cocheRenovable("Opel", "Corsa", 5, "Azul", 120, "Gas Natural");
		cocheRenovable coche_r7=new cocheRenovable("Peugeot", "5007", 5, "Gris", 130, "Híbrido");
		//Output Coches ronvables
		coche_r2.getTodor();coche_r3.getTodor();coche_r4.getTodor();coche_r5.getTodor();coche_r6.getTodor();coche_r7.getTodor();
		}else if(opcion==5) {
		//Precio prueba
		/*System.out.println("Precio coche1: "+coche1.getPrecio()+" euros.");
		System.out.println(coche_r1.getTodo());*/
		
		//			INVERSIONES
		System.out.println("\nInversiones:");
		inversion inversion0=new inversion("Abrillantador", 150, false);
		inversion0.getTodo();
		//Input inversiones
		inversion inversion1=new inversion("Concesión Toyota", 3000000, true);
		inversion inversion2=new inversion("Concesión Citroën", 1000000, true);
		inversion inversion3=new inversion("Tanda llegada Mercedes", 500000, false);
		inversion inversion4=new inversion("Alumbrado", 200, false);
		inversion inversion5=new inversion("Ertes", 70000, false);
		//Output inversiones
		inversion1.getTodo();inversion2.getTodo();inversion3.getTodo();inversion4.getTodo();inversion5.getTodo();
		}
		
		
		//			FINAL PROGRAMA
		System.out.println("\n********************************");
	}

	private static int menu() {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int opcion;
		System.out.println("\n********************************");
		System.out.println("*             MENU             *");
		System.out.println("********************************");
		System.out.println("*  1..........Sacar empleados  *");
		System.out.println("*  2.............Sacar coches  *");
		System.out.println("*  3..........Meter empleados  *");
		System.out.println("*  4.............Meter coches  *");
		System.out.println("*  5........Sacar inversiones  *");
		System.out.println("********************************");
		System.out.println("* Funciones 3 y 4 no disponibles*");
		opcion = reader.nextInt();
		if(opcion==2||opcion==4) {
			System.out.println("********************************");
			System.out.println("* 10......Coches no renovables *");
			System.out.println("* 20.........Coches renovables *");
			System.out.println("********************************");
			opcion =opcion+ reader.nextInt();
		}
		System.out.println("*  Opcion: "+opcion);
		return opcion;
	}

}
