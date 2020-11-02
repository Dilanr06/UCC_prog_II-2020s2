package co.edu.campusucc;
import java.util.Scanner;

public class Ejercicio2 {
	
	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {
		
		float suma, resta, multiplicacion, promedio;
		float numero1, numero2;
		
		System.out.println("Programa para calcular la suma, resta, producto y promedio");
		System.out.println("Ingrese el primer numero");
		numero1 = entrada.nextFloat();
		System.out.println("Ingrese el segundo numero");
		numero2 = entrada.nextFloat();
		
		
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		multiplicacion = numero1 * numero2;
		promedio = (numero1 + numero2) / 2;
		
		System.out.println("El resultado de la suma es:"+suma);
		System.out.println("El resultado de la resta es:"+resta);
		System.out.println("El resultado de la multiplicacion es:"+multiplicacion);
		System.out.println("El resultado del promedio es:"+promedio);
		
		
	}
}
