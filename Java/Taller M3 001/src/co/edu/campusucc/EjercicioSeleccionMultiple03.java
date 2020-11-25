package co.edu.campusucc;


import java.util.Scanner;

public class EjercicioSeleccionMultiple03 {
	static Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {
		
		
		float cantidad, valor_factura, producto1, producto2, producto3;
		int codigo;
		
		
		System.out.println(" Programa para elaborar facturas de la empresa Pilitos");
		System.out.println("Ingrese el codigo del producto que desea llevar, sabiendo que hay producto 1.A, 2.B, 3.C");
		codigo = entrada.nextInt();
		System.out.println ("Ingrese la cantidad de unidades");
		cantidad = entrada.nextFloat();
		
		if ( cantidad <= 501)
		{
			switch ( codigo) {
			case 1: producto1 = 500;
			valor_factura = producto1 * 7 / 100;
			System.out.println (" El valor de la factura es: " + valor_factura);
			break;
			
			case 2: producto2 = 800;
			valor_factura = producto2 * 8 / 100;
			System.out.println(" El valor de la factura es: " + valor_factura);
			break;
			
			
			case 3: producto3 = 1000;
			valor_factura = producto3 * 5 /100;
			System.out.println("El valor de la factura es: " + valor_factura);
			break;
			
			default:
				System.out.println ( " El codigo ingresado no es correcto");
				break;
			}
			
		}
			 else if (cantidad >= 500)
			 {
				switch (codigo) {
				case 1: producto1 = 1000;
				valor_factura = producto1 * 9 / 100;
				System.out.println (" El valor de la factura es: " + valor_factura);
				break;
				
				
				case 2: producto2 = 1400;
				valor_factura = producto2* 11 / 100;
				System.out.println(" El valor de la factura es: " + valor_factura);
				break;
				
				case 3: producto3 = 1600;
				valor_factura = producto3 + (10 / 100);
				System.out.println(" El valor de la factura es: " + valor_factura);
				break;
				
				default:
					System.out.println("El codigo ingresado no es correcto");
					break;
			
				
					
				}
				 
				 
			 }
		
	   }
	
}
