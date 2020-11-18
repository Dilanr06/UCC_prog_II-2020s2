package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio03 {
	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {
		
		int numero = 0;
		int numero_invertido = 0;
		int residuo;
		
		System.out.println (" Programa que determina si un numero es capicua");
		System.out.println (" Ingrese el numero");
		numero = entrada.nextInt();
		
		do{
	
		}
		while (numero < 10);
		
		residuo = numero;
		
		while ( residuo != 0) {
			
			int cifra = residuo % 10;
			numero_invertido = numero_invertido * 10 + cifra;
			residuo = residuo / 10;
			
		}if ( numero == numero_invertido){
			System.out.println (" El numero ingresado  es capicua");
			
		}else {
			System.out.println (" El numero ingresado no es capicua ");
		}
	}
}
