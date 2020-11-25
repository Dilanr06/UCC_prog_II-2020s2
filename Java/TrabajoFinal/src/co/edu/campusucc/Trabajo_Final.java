package co.edu.campusucc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Trabajo_Final {
	public static void main (String []args ) {
		
		int a ;
		Scanner S = new Scanner (System.in);
		
		
		do {
			System.out.println (" Programa de ejecucion de otros programas");
			System.out.println (" Programa que permite ejecutar algun programa y permite conocer un menu");
			System.out.println ("");
			System.out.println ( " Digite 1 para la ejecucion del programa Ejercicio1 ");
			System.out.println ( " Digite 2 para la ejecucion del programa Ejercicio2");
			System.out.println ( " Digite 3 para la ejecucion del programa Ejercicio3");
			System.out.println ( " Digite 4 para la ejecucion del programa Ejercicio4");
			System.out.println ( " Digite 5 para la ejecucion del programa Ejercicio5");
			System.out.println ( " Digite 6 para la ejecucion del programa Ejercicio9");
			System.out.println ( " Digite 7 para la ejecucion del programa Ejercicio10");
			System.out.println ( " Digite 8 para la ejecucion del programa Ejercicio11");
			System.out.println ( " Digite 9 para la ejecucion del programa Ejercicio13");
			System.out.println ( " Digite 10 para la ejecucion del programa EjercicioMultiple01");
			System.out.println ( " Digite 11 para la ejecucion del programa Ejercicio01");
			System.out.println ( " Digite 12 para la ejecucion del programa Ejercicio03");
			System.out.println ( " Digite 13 para la ejecucion del programa Ejercicio02");
			System.out.println ( " Digite 14 para la ejecucion del programa Ejercicio05");
			System.out.println ( " Digite 15 para la ejecucion del programa Ejercicio06");
			
			a = S.nextInt();
		
		}while (a > 15);
		
			try (Scanner scan = new Scanner(System.in)){
				
				int programaopcional;
				String comando = " ";
				
				System.out.println (" Ingrese el numero del programa que desee ejecutar");
				programaopcional = scan.nextInt();
				
			
		
		switch (programaopcional ) {
		
		case 1: 
			comando = "java co.edu.campusucc.Ejercicio1";
			break;
		
		case 2: 
			comando = "java co.edu.campusucc.Ejercicio2";
			break;
			
		case 3:
			comando = "java co.edu.campusucc.Ejercicio3";
			break;
			
		case 4: 
			comando = " java co.edu.campusucc.Ejercicio4";
			break;
			
		case 5: 
			comando = "java co.edu.campusucc.Ejercicio5";
			
		case 6:
			comando = "java co.edu.campusucc.Ejercicio9";
			break;
			
		case 7:
			comando = "java co.edu.campusucc.Ejercicio10";
			break;
			
		case 8:
			comando = "java co.edu.campusucc.Ejercicio11";
			break;
			
		case 9:
			comando = "java co.edu.campusucc.Ejercicio13";
			break;
			
		case 10:
			comando = "java co.edu.campusucc.EjercicioSeleccionMultiple01";
			break;
			
		case 11:
			comando = "java co.edu.campusucc.Ejercicio01";
			break;
			
		case 12:
			comando = "java co.edu.campusucc.Ejercicio03";
			break;
			
		case 13: 
			comando = "java co.edu.campusucc.Ejercicio02";
			break;
			
		case 14:
			comando = "java co.edu.campusucc.Ejercicio05";
			break;
			
		case 15:
			comando = "java co.edu.campusucc.Ejercicio06";
			break;
			
			default:
				System.out.println (" El programa es: " + comando);
				break;
		}
		
		Process theProcess;
		BufferedReader inStream;
		
		theProcess = Runtime.getRuntime() .exec("java co.edu.campusucc.Ejercicio1");
		theProcess = Runtime.getRuntime() .exec("Java co.edu.campusucc.Ejercicio2");
		theProcess = Runtime.getRuntime() .exec("Java co.edu.campusucc.Ejercicio3");
		theProcess = Runtime.getRuntime() .exec("Java co.edu.campusucc.Ejercicio4");
		theProcess = Runtime.getRuntime() .exec("Java co.edu.campusucc.Ejercicio5");
		theProcess = Runtime.getRuntime() .exec("Java co.edu.campusucc.Ejercicio9");
		theProcess = Runtime.getRuntime() .exec("Java co.edu.campusucc.Ejercicio10");
		theProcess = Runtime.getRuntime() .exec("Java co.edu.campusucc.Ejercicio11");
		theProcess = Runtime.getRuntime() .exec("Java co.edu.campusucc.Ejercicio13");
		theProcess = Runtime.getRuntime() .exec("Java co.edu.campusucc.EjercicioSeleccionMultiple01");
		theProcess = Runtime.getRuntime() .exec("Java co.edu.campusucc.Ejercicio01");
		theProcess = Runtime.getRuntime() .exec("Java co.edu.campusucc.Ejercicio03");
		theProcess = Runtime.getRuntime() .exec("Java co.edu.campusucc.Ejercicio02");
		theProcess = Runtime.getRuntime() .exec("Java co.edu.campusucc.Ejercicio05");
		theProcess = Runtime.getRuntime() .exec("Java co.edu.campusucc.Ejercicio06");
		
		inStream = new BufferedReader (new InputStreamReader( theProcess.getInputStream()));
		System.out.println ( inStream.read());
		
		}catch (Exception e)
			{
			
			System.out.println ("Error en el metodo exec()");
			e.printStackTrace();
			
		}	
	}
}