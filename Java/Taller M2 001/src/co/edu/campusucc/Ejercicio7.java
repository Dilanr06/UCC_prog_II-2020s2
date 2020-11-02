package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio7 {
	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {
		
		float paginas;
		float minutos;
		float horas;
		float cpaginas;
		float cpaginasm;
		float cpaginash;
		
		System.out.println("Programa que permite saber cuantas paginas escribe");
		System.out.println("Ingrese el numero de horas");
		horas = entrada.nextFloat();
		System.out.println("Ingrese el numero de minutos");
		minutos = entrada.nextFloat();
		System.out.println("Ingrese el numero de paginas");
		paginas = entrada.nextFloat();
		
		System.out.println("Vamos a calcular la cantidad de minutos, paginas y horas en escribir");
		
		cpaginas = paginas * 2;
		cpaginash = horas *30;
		cpaginasm = minutos / 2;
		
		System.out.println("La cantidad de paginas por " +horas+ " horas es de:" +cpaginash);
		System.out.println("La cantidad de paginas en " +minutos+ " minutos es de: " +cpaginasm);
		System.out.println("La cantidad de paginas " +paginas+ " realizadas es de: " +cpaginas);
		
	}
}
