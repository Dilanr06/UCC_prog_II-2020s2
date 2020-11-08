package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio6 {
	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {
		
		String nombre;
		float valor_hora;
		int horas_trabajadas;
		float salario;
		
		System.out.println("Programa que permite determinar el salario a pagar a cada empleado");
		System.out.println("Ingrese el nombre del trabajador");
		nombre = entrada.next();
		System.out.println("Ingrese el valor de la horas trabajadas");
		valor_hora = entrada.nextFloat();
		System.out.println("Ingrese el numero de horas trabajadas");
		horas_trabajadas = entrada.nextInt();
		
		salario = valor_hora * horas_trabajadas;
		
		System.out.println("El salario del empleado es: " +salario);
		
		
	}
}
