package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio12 {
	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {
		
		int a = 0;
		int b = 0;
		
		//a representa metros que ascendio*
		//b representa metros que descendio*
		
		System.out.println ("Problema del muro de altura");
		System.out.println ("Ingrese el numero de metros que asciende");
		a = entrada.nextInt();
		System.out.println("Ingrese el numero de metros que desciende");
		b = entrada.nextInt();
		
		a = a - b;
		
		while (a <= 10) {
			
			System.out.println("Los metros ascendidos por dia es de: " +a);
			
			a = a + a;
		}
		
		
	}
}
