package co.edu.campusucc;
import java.util.Scanner;

public class Ejercicio5 {
	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {
		
		float costo;
		float pago;
		float cambio;
		
		System.out.println("Programa que conocer el cambio de un articulo pagado");
		System.out.println("Ingrese el costo del articulo");
		costo = entrada.nextFloat();
		System.out.println("Ingrese el valor a pagar");
		pago = entrada.nextFloat();
		
		System.out.println("El costo del articulo es:"+costo+", El valor pagado es: " +pago+ "");
		
		cambio = pago - costo;
	
		System.out.println("El cambio es: " +cambio);
		
	}
}
