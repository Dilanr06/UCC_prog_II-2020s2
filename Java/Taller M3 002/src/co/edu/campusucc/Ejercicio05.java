package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio05 {

	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {
	
		
		int numero;
		int mayor = 0;
		int x = 0;
		int i;
		
		System.out.println ( " Programa que lee un numero y determina el mayor de los digitos");
		System.out.println ( " Ingrese el numero que desee");
		numero = entrada.nextInt();
		
		for ( i = 1; i <= numero; i++ ) {
			
			if (numero > mayor) {
				mayor = numero % 10;
				x++;
				
			}
			else if ( numero == mayor);
				x = x + 1;
	
		}
		 	System.out.println (" El digito mayor del numero ingresado es: " + mayor);
		 	
	}
}
