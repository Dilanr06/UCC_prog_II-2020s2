package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio13 {
	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {
		
		double unidades;
		double unidades1;
		double unidades2;
		String empleado1;
		String empleado2;
		
		
		System.out.println("Programa que permite calcular la produccion de cada empleado");
		System.out.println("Ingrese el nombre del primer empleado");
		empleado1 = entrada.next();
		System.out.println("Ingrese el nombre del segundo empleado");
		empleado2 = entrada.next();
		System.out.println("Ingrese las unidades del empleado 1");
		unidades1 = entrada.nextDouble();
		System.out.println("Ingrese las unidades del empleado 2");
		unidades2 = entrada.nextDouble();
		
		unidades = unidades1 + unidades2;
		unidades1 = unidades2 - 2/3;
		unidades2 = unidades2 + unidades1;
		
		System.out.println("La cantidad de unidades total es de: " +unidades+ "");
		System.out.println("La cantidad de produccion de empleado1 es de: " +unidades1+ "");
		System.out.println("La cantidad de produccion de empleado2 es de: " +unidades2+ "");
		

	}
}
