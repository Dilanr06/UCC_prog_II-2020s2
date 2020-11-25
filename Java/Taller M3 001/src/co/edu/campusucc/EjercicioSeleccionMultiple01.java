package co.edu.campusucc;

import java.util.Scanner;

public class EjercicioSeleccionMultiple01 {
	static Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {
		
		String nombre = "";
		String plan = "";
		int semestre = 0;
		int economia = 10;
		int ciencias = 10;
		int administracion = 10;
		
		System.out.println("Programa para cobro de carnet estudiantil");
		System.out.println("Ingrese el nombre del estudiante");
		nombre = entrada.next();
		System.out.println("Ingrese el semestre, entre 1 y 10");
		semestre = entrada.nextInt();
		System.out.println("Ingrese el plan del cual esta inscripto, entre economia, administracion y ciencias");
		plan = entrada.next();
		
		
		switch (economia) {
		
		case 1: 
			System.out.println("El valor del carnet es: 1500");
			break;
		case 2: System.out.println("El valor del carnet es: 1500");
			break;
		case 3: System.out.println("El valor del carnet es; 1500");
			break;
		case 4: System.out.println("El valor del carnet es: 2220");
			break;
		case 5: System.out.println("El valor del carnet es: 2220");
			break;
		case 6: System.out.println("El valor del carnet es: 2220");
		 	break;
		case 7: System.out.println("El valor del carnet es: 2220");
		 	break;
		case 8: System.out.println("El valor del carnet es: 3000");
		 	break;
		case 9: System.out.println("El valor del carnet es: 3000");
		 	break;
		case 10: System.out.println("El valor del carnet es: 3000");
			break;
		 
		default:
			System.out.println (" El valor del carnet es: " +economia);
			break;
	    }
		
		switch (ciencias) {
		

		case 1: System.out.println("El valor del carnet es: 1800");
			break;
		case 2: System.out.println("El valor del carnet es: 1800");
			break;
		case 3: System.out.println("El valor del carnet es; 1800");
			break;
		case 4: System.out.println("El valor del carnet es: 5000");
			break;
		case 5: System.out.println("El valor del carnet es: 5000");
			break;
		case 6: System.out.println("El valor del carnet es: 5000");
		 	break;
		case 7: System.out.println("El valor del carnet es: 5000");
		 	break;
		case 8: System.out.println("El valor del carnet es: 7000");
		 	break;
		case 9: System.out.println("El valor del carnet es: 7000");
		 	break;
		case 10: System.out.println("El valor del carnet es: 7000");
			break;
		 
		 	default:
		 		break;
			
		}
		
		switch (administracion) {
		
		case 1: System.out.println("El valor del carnet es: 3000");
				break;
		case 2: System.out.println("El valor del carnet es: 3000");
				break;
		case 3: System.out.println("El valor del carnet es; 3000");
				break;
		case 4: System.out.println("El valor del carnet es: 5000");
				break;
		case 5: System.out.println("El valor del carnet es: 5000");
				break;
		case 6: System.out.println("El valor del carnet es: 5000");
				break;
		case 7: System.out.println("El valor del carnet es: 5000");
				break;
		case 8: System.out.println("El valor del carnet es: 7000");
				break;
		case 9: System.out.println("El valor del carnet es: 7000");
				break;
		case 10: System.out.println("El valor del carnet es: 7000");
				break;
 
				default:
					break;
					
		}			
					
	}					
					
}				