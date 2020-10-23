public class ProgramaArgumentos01 {
  public static void main(String[] args) {
	System.out.println("+--------------------------------------------+");
	System.out.println("+Author: Dilan Felipe Rodriguez Quintana+");
    System.out.println("Programa Argumentos 01: Suma de Enteros");
	System.out.println("+Fecha: 17-10-2020+");
	
	System.out.println("argumento 1 = "+args[0]);
	System.out.println("argumento 2 = "+args[1]);
	
	

	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
	int resultadoSuma = num1 + num2;
	
	
	System.out.println("Operacion Matematica: = "+num1+",num2 = "+num2+" ");
	System.out.println("SUMA num1 + num2 = "+resultadoSuma+" ");
	
	
	
	
	System.out.println("+---------------------------------------------+");
  }
}