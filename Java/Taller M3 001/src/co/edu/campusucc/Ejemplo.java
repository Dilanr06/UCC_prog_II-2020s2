package co.edu.campusucc;


import java.util.Scanner;

public class Ejemplo {
	static Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {
		
		String nombre = "";
		double sueldo = 0;
		int categoria;
		
		System.out.println("Ingrese el nombre del empleado");
		nombre = entrada.next();
		System.out.println("Ingrese el sueldo del empleado");
		sueldo = entrada.nextDouble();
		System.out.println("Ingrese la categoria ");
		categoria = entrada.nextInt();
		
		switch (categoria) {
		case 1:
			sueldo = sueldo * 1.15;
			break;
		case 2:
			sueldo = sueldo * 1.10;
			break;
		case 3:
			sueldo = sueldo * 1.08;
			break;
		case 4:
			sueldo = sueldo * 1.07;
			break;
			
		
			default:
			System.out.println("La categoria no existe");
			break;
		
		}	
		
		System.out.println("El sueldo a pagar es: " +sueldo);
	
	}
		
}
