package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio4 {
	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {
		
		String nombre;
		float salario;
		float descuento;
		float valor_a_pagar;
		
		System.out.println("Programa que permite conocer el valor a pagar, mediante el salario y el descuento del empleado");
		System.out.println ("Ingrese el nombre del empleado");
		nombre = entrada.next();
		System.out.println("Ingrese el salario del empleado");
		salario = entrada.nextFloat();
		System.out.println("Ingrese el descuento asignado al empleado");
		descuento = entrada.nextFloat();
		
		valor_a_pagar = (salario - descuento);
		
		System.out.println("El valor a pagar es:" +valor_a_pagar+ "");
		
	}
}
