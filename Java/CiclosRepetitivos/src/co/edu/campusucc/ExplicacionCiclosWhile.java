package co.edu.campusucc;

import java.util.Random;

public class ExplicacionCiclosWhile {
	public static void main(String[] args) {
		
		boolean condicion = true;
		int contador = 0;
		int acumulador = 0;
		
		while (condicion) {
			
			contador = contador +1;
			Random random = new Random();
			int intRandom = random.nextInt(50);
			
			acumulador = acumulador + intRandom;
			
			condicion = true;
			if (intRandom < 30 && intRandom > 25) condicion = false;
			
			System.out.println (" Estoy dentro del ciclo MIENTRAS: random=" +intRandom + " Condicion de salida del ciclo >>>" + condicion);
			
		}
		
	}
	
}	
	