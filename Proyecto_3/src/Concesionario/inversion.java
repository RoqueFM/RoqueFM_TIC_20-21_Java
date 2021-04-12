package Concesionario;

public class inversion {
		private String concepto;
		private double cantidad;
		private boolean tipo;	//ingreso o gasto true--> ingreso; false--> gasto
		private float conversor;
		/**
		 * @param concepto
		 * @param cantidad
		 * @param tipo
		 */
		public inversion(String concepto, double cantidad, boolean tipo) {
			this.concepto = concepto;
			this.cantidad = cantidad;
			this.tipo = tipo;
		}
		public String getConcepto() {
			return concepto;
		}
		public void setConcepto(String concepto) {
			this.concepto = concepto;
		}
		public double getCantidad() {
			return cantidad;
		}
		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}
		public boolean isTipo() {
			return tipo;
		}
		public void setTipo(boolean tipo) {
			this.tipo = tipo;
		}
		public float getConversor() {
			return conversor;
		}
		public void setConversor(float conversor) {
			this.conversor = conversor;
		}
		public double inversion_total() {
			double inversion_total;
			if(tipo==true) {
				conversor=1;
			}else if(tipo==false) {
				conversor=(-1);
			}
			inversion_total=conversor*cantidad;
			return inversion_total;
		}
		public String getTodo() {
			String todo;
			todo=concepto+", "+inversion_total()+"€";
			System.out.println(todo);
			return todo;
		}
		public double balance() {
			double movimiento;
			movimiento=60000000+inversion_total();
			return movimiento;
		}
		
}
