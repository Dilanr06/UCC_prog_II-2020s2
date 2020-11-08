package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio10 {
	static Scanner entrada = new Scanner (System.in);
	public static void main (String []args ) {
		
		String nombre;
		int codigo;
		float valor_de_la_hora;
		float numero_de_horas_trabajadas;
		float salariofinal;
		float salario;
		
		System.out.println("Programa para determinar el valor a pagar");
		System.out.println("Ingrese el nombre del trabajador");
		nombre = entrada.next();
		System.out.println("Ingrese el codigo del trabajador");
		codigo = entrada.nextInt();
		System.out.println("Ingrese el valor de la hora");
		valor_de_la_hora = entrada.nextFloat();
		System.out.println("Ingrese el numero de horas trabajadas");
		numero_de_horas_trabajadas = entrada.nextFloat();
		System.out.println("Ingrese el valor a pagar:");
		salario = entrada.nextFloat();
		
		
		
		if (numero_de_horas_trabajadas >= 48)
		{
			valor_de_la_hora = (valor_de_la_hora *numero_de_horas_trabajadas) * 20 / 100;
			
		}else {
			valor_de_la_hora = (numero_de_horas_trabajadas * valor_de_la_hora);
		}
		
		salariofinal = valor_de_la_hora + salario;
		
		System.out.println("El valor de la horas trabajadas es: " +valor_de_la_hora);
		System.out.println("El empleado: "  +nombre+"de codigo"   +codigo+"   laboro"    +valor_de_la_hora+"   "+numero_de_horas_trabajadas+"");
		System.out.println("El salario final a cancelar es: " +salariofinal+"");
		
	}
}
