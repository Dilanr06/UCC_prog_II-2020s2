package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio06 {
	
	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {
		
		int numero; 
		int i;
		int y = 0;
		
		System.out.println (" Programa que determina si un numero es primo");
		System.out.println ( " Ingrese el numero que desee");
		numero = entrada.nextInt();
		
		for ( i = 1; i <= numero; i++ ) {
			
			if ( numero % i == 0) {
			y++;
			
			}
			
		}
		if (y != 2){
			
			System.out.println (" El numero ingresado no es primo " + numero);
			
		}else  {
			
			System.out.println (" El numero ingresado es primo " + numero);
		}
	}
}
