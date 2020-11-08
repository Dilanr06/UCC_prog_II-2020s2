package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio9 {
	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {

			int numero = 0;
			int SumaDigitos = 0;
			
			System.out.println("Ingrese el numero que desee");
			numero = entrada.nextInt();
			
			int aux = numero;
			
			while (numero != 0) {
				SumaDigitos = SumaDigitos +(numero % 10 );
				numero = numero /10;
			}
	       
			System.out.println ("La suma de los digitos de: "+ aux + " es: " +SumaDigitos);
		
	}
}
