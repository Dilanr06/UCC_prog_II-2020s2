package co.edu.campusucc;

import java.util.Random;

public class EjemploNumerorandomicoprimo {
	public static void main(String[] args) {
		
		int numero = 0;
		int a = 0;
		
		numero = (int)(Math.random()* 1000);
		
		System.out.println(" Generacion de un numero randomico de 1 a 1000");
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0);
			a++;
		}
		if (a != 2){
			System.out.println(" El numero randomico no es  primo >>> " +numero );
		}
		else{
			System.out.println("El numero randomico  es primo >>> " +numero );
		}
	}
}
