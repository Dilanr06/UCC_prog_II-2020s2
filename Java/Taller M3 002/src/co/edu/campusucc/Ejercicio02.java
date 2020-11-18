package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio02 {
	
	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {
		
		int numero; 
		int suma = 0;
		
		System.out.println (" Programa que lee un numero y determina la suma de ellos");
		System.out.println (" Ingrese el numero de su preferencia");
		numero = entrada.nextInt();
		
		while (numero > 0 ) {
			
			suma = suma + numero % 10;
			numero = numero  /= 10;
		}
		
		System.out.println (" La suma de los numero es: " + suma);
		
	}
	
}
