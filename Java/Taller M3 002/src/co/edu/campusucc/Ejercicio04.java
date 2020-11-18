package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio04 {
		
	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {
		
		int numero;
		int digito;
		boolean condicion = true;
		
		
		System.out.println (" Programa que lee un digite dentro de una cantidad de numeros");
		System.out.println (" Ingrese el numero de su preferencia");
		numero = entrada.nextInt();
		System.out.println (" Ingrese el digito que desee");
		digito = entrada.nextInt();
				
		
		do {
			
			condicion = true;
			if ( digito > numero) { 
				digito = numero % 10; 
				
				
			System.out.println (" El digito ingresado no esta en el numero " + numero);
			
			
			}else  {
			
				System.out.println (" El digito ingresado esta en el numero " + numero);
				
			}
			
		}while (!condicion);
		
	}
}
