package co.edu.campusucc;
import java.util.Scanner;

public class Ejercicio1 {
	
	static Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {
		
		int numero ;
		
		System.out.println("Por favor ingrese el numero: ");
		numero = entrada.nextInt();
		
		System.out.println("El cubo del numero" + numero + " es: " + numero * numero * numero);
	}
}