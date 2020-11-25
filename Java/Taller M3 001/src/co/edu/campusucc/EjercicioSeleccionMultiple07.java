package co.edu.campusucc;


import java.util.Scanner;

public class EjercicioSeleccionMultiple07 {
	static Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {
		
		int ruta;
		double utilidad = 0;
		int servicio = 0;
		
		System.out.println (" Programa para determinar la utilidad de la empresa");
		System.out.println (" Ingrese la ruta");
		ruta = entrada.nextInt();
		System.out.println("Ingrese el valor del servicio");
		servicio = entrada.nextInt();
		
		
		switch (ruta) {
		
		case 1: 
			utilidad = (servicio - 1.30) - 1.10;
			break;
		case 2: 
			utilidad = (servicio - 1.25) - 1.15;
			break;
		case 3: 
			utilidad = (servicio - 1.20) - 1.20;
			break;
		case 4: 
			utilidad = (servicio - 1.22) - 1.20;
			break;
			
			default:
				System.out.println(" La ruta no existe");
				break;
		}
		
		System.out.println ("La utilidad restante es: " +utilidad);
	}
		
}
