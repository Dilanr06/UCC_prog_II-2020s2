package co.edu.campusucc;
import java.util.Scanner;

public class Ejercicio3 {
	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {
		
		float nota1, nota2, nota3;
		float porcentaje1, porcentaje2, porcentaje3, suma;
		
		System.out.println("Programa que permite calcular la nota definitiva de un estudiante");
		System.out.println("Ingrese la primer nota");
		nota1 = entrada.nextFloat();
		System.out.println("Ingrese la segunda nota");
		nota2 = entrada.nextFloat();
		System.out.println("Ingrese la tercer nota");
		nota3 = entrada.nextFloat();
		
		porcentaje1 = (nota1 *30) / 100;
		porcentaje2 = (nota2 *30) / 100;
		porcentaje3 = (nota3 *40) / 100;
		
		System.out.println("Las notas suyas son:"+nota1+","+nota2+","+nota3+"");
		
		suma = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Sus nota definitiva es:"+suma);
		
	}
}
