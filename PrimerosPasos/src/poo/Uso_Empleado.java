package poo;
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
		
		Empleado[] misEmpleados = new Empleado[3];
		
		misEmpleados[0] = new Empleado("CobosCode", 1200, 2020, 9, 16);
		misEmpleados[1] = new Empleado("Pepe", 1300, 2019, 9, 16);
		misEmpleados[2] = new Empleado("Luis", 1000, 2015, 9, 20);
		
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