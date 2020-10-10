Proceso EjercicioTaller_04
	
	// Defino variables
	
	definir resp1, resp2, resp3, resp4 Como Entero;
	definir k Como Logico;
	
	
	Escribir "¿Benjamin Franklin invento el pararrayos [0]... Falso [1]...Verdadero?";
	Leer resp1;
	
	Escribir "¿Samuel Morse invento el telegrafo [0]... Falso [1]... Verdadero?";
	Leer resp2;
	
	Escribir "¿Perú es una pais suramericano [0]... Falso [1]... Verdadero?";
	Leer resp3;
	
	Escribir "¿5 es un numero primo [0]...Falso [1]...Verdadero?";
	Leer resp4;
	
	
	k <- (resp1 >= resp2) y (resp3 = resp4);
	
	Escribir "El valor final vale",k;
	
	
FinProceso
