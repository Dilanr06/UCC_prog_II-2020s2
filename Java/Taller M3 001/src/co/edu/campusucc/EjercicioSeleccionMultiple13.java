package co.edu.campusucc;

import java.util.Scanner;

public class EjercicioSeleccionMultiple13 {
	static Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {
		
		double factura = 0;
		double cargo = 0;
		int diagnostico = 0; 
		String tipo;
		
		System.out.println(" Programa que permite conocer la factura");
		System.out.println(" ingrese el tipo de vehiculo");
		tipo = entrada.next();
		System.out.println("Ingrese el cargo del tipo de vehiculo anteriormente ingresado");
		cargo = entrada.nextDouble();
		System.out.println (" Ingrese el diagnostico que desee realizarle al vehiculo");
		diagnostico = entrada.nextInt();
		
		switch (diagnostico) {
		
		case 1: 
			factura = cargo + 3500;
			break;
		case 2: 
			factura = cargo + 2800;
			break;
		case 3:
			factura = cargo + 1950;
			break;
		case 4:
			factura = cargo + 2750;
			break;
		case 5:
			factura = cargo + 3000;
			break;
		case 6:
			factura = cargo + 1600;
			break;
		
			default:
				System.out.println (" El diagnostico seleccionado no esta disponible");
				break;
		}
		
		System.out.println (" El valor de la factura es: " +factura);
		System.out.println (" El tipo de vehiculo es: " + tipo);
		System.out.println (" El diagnostico realizado al vehiculo fue: " + diagnostico);
	}
}
