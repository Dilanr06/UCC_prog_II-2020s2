package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio11 {
	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {
		
		int numero;
		double valor_absoluto;
		
		System.out.println ("Programa para calcular el valor absoluto de un numero");
		System.out.println ("Ingrese el numero al cual le desea hallar el valor absoluto");
		
		numero = entrada.nextInt();
		
		valor_absoluto = numero > 0? numero: -numero;
		
		System.out.println("El valor absoluto de:" +numero+" es: "+valor_absoluto);
	}
}
