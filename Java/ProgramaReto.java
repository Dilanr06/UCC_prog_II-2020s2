public class ProgramaReto {
  public static void main(String[] args) {
	System.out.println("+----------------------------------------+");
	System.out.println("+Author: Dilan Felipe Rodriguez Quintana +");
    System.out.println("+Programa Reto: Conversion de un decimal +");
	System.out.println("+         Fecha: 24-10-2020              +");
    System.out.println("+----------------------------------------+");
	
	int numero = Integer.parseInt(args[0]);
	
	System.out.println("argumento 1 = "+args[0]);

	
	if ("H".compareToIgnoreCase(args[0])){
       //convierten a Hexadecimal
    
	}else if ("B".compareToIgnoreCase(args[0])){
       //convierten a Binario
	   
    }else {
       //Mensaje indicando que no existe esa opcion para convertir el numero
    }
  }	
}

