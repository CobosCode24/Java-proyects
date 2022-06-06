 package Herencia;
import java.util.*;

import javax.swing.JOptionPane;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		/*
		Empleado empleado1 = new Empleado("CobosCode", 1200, 2020, 9, 16);
		Empleado empleado3 = new Empleado("Pepe", 1300, 2019, 9, 16);
		Empleado empleado2 = new Empleado("Luis", 1000, 2015, 9, 20);
		
		empleado1.subeSueldo(10);
		
		System.out.println("Nombre: " + empleado1.getNombre() + " Sueldo: " + 
		empleado1.getSueldo() + " Fecha alta: " + empleado1.getContrato());
		*/

		Jefatura jefeRRHH = new Jefatura("Pedro", 2000, 2002, 9, 12);
		
		jefeRRHH.setIncentivo(700);
		
		Empleado[] misEmpleados = new Empleado[5];
		
		misEmpleados[0] = new Empleado("CobosCode", 1200, 2020, 9, 16);
		misEmpleados[1] = new Empleado("Pepe", 1300, 2019, 9, 16);
		misEmpleados[2] = new Empleado("Luis", 1000, 2015, 9, 20);
		misEmpleados[3] = jefeRRHH; ; //Polimorfismo. Principio de sustitución.
		misEmpleados[4] = new Jefatura("Marta", 3000, 2005, 10, 25);
		
		Jefatura jefaFinanzas = (Jefatura) misEmpleados[4]; //Casting o refundición.
		jefaFinanzas.setIncentivo(3000); 
		
		/*
		for(int i=0 ; i<misEmpleados.length ; i++) {
			misEmpleados[i].subeSueldo(5);
		}
		 */
		
		for(Empleado e: misEmpleados) {
			
			e.subeSueldo(5);
			
		}
		
		/*
		for(int i=0 ; i<misEmpleados.length ; i++) {
			System.out.println("Nombre: " + misEmpleados[i].getNombre() + 
					" Sueldo: " + misEmpleados[i].getSueldo() + 
					" Fecha de alta: " + misEmpleados[i].getContrato());
		}
		*/
		
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.getNombre() + 
					" Sueldo: " + e.getSueldo() + 
					" Fecha de alta: " + e.getContrato());
		}
	}

}

class Empleado {
	
	public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
		
		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes, dia);
		altaContrato = calendario.getTime();
		
	}
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public Date getContrato() {
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
}

/*final*/ class Jefatura extends Empleado{ // final es para que nadie pueda crear una clase que herede de esta.
	
	public Jefatura(String nombre, double sueldo, int anio, int mes, int dia) {
		
		super(nombre, sueldo, anio, mes, dia);

	}

	public void setIncentivo(double inc) {
		incentivo = inc;
	}
	public double getSueldo() { // El triangulo significa que lo soobreescribe
		double sueldoJefe = super.getSueldo(); // llamo a la clase padre de getSueldo.
		
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
	
	
	
}

/*
class director extends Jefatura {
	
	public director(String nombre, double sueldo, int anio, int mes, int dia) {
		
		super(nombre, sueldo, anio, mes, dia);
		
	}
	
}
*/