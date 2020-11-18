package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio01 {

	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {
		
		
		int numero;
		int inverso = 0;
		int numero_residuo;
		
		System.out.println (" Programa que lee un numero e imprime el inverso");
		System.out.println (" Digite el numero de su preferencia");
		numero = entrada.nextInt();
		System.out.println(" El numero ingresado es: " + numero);
		
		while (numero > 0) {
	
			numero_residuo = numero % 10;
			inverso = inverso * 10 + numero_residuo;
			numero /= 10;
			
		}
		
		System.out.println (" El inverso del numero digitado es: " +inverso);
		
	}
		
}
