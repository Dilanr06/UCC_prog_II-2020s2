package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio8 {
	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {
		
		int dias_trabajados;
		int valor_hora;
		float horas_trabajadas;
		float salario;
		int horas_extras=0;
		float salariofinal;
		float segurosocial;
		
		System.out.println("Programa que permite calcular el salario de un trabajador");
		System.out.println("Ingrese el numero de dias trabajados");
		dias_trabajados = entrada.nextInt();
		System.out.println("Ingrese el valor pagado por hora");
		valor_hora = entrada.nextInt();
		System.out.println("Ingrese el numero de horas laboradas");
		horas_trabajadas = entrada.nextFloat();
		
		
		if (horas_extras >= 10)
		{
			salario = (valor_hora * horas_trabajadas) * 50 / 100;
			
		}else {
			
			salario = (valor_hora * horas_trabajadas);
		}
		
			segurosocial = salario * 12/ 100;
			salariofinal = salario - segurosocial; 
		
			
			System.out.println("El valor de las horas trabajadas del empleado es de: " +salario);
			System.out.println("El descuento del seguro social es de: " +segurosocial);
			System.out.println("El salrio final del empleado es: " +salariofinal);
			
	}
}
