package edu.kiara.daw.tema1ejercicios;

import java.util.Scanner;

public class ej9ecuacion {

	public static void main(String[] args) {

		/*
		 * programa que pida los coeficientes de una ecuación de 2º grado, y muestre sus
		 * soluciones reales. Si no existen, debe indicarlo.
		 */
		
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;

		System.out.println("------Ecuacion de Segundo Grado------\n");
		System.out.print("Ingrese el valor de a: \r");
		a = sc.nextInt();

		System.out.print("Ingrese el valor de b: \r");
		b = sc.nextInt();

		System.out.print("Ingrese el valor de c: \r");
		c = sc.nextInt();
		
		double dentroRaiz = Math.pow(b, 2) + 4*a*c;
		
		String solucionPos = (dentroRaiz < 0) ? "no tiene solucion 1" : "Primera solucion; " + (-b + Math.sqrt(dentroRaiz))/(2*a);
		String solucionNeg = (dentroRaiz < 0) ? "no tiene solucion 1" : "Primera solucion; " + (-b - Math.sqrt(dentroRaiz))/(2*a);

/*
		double positivo = ( (-(b)) + Math.sqrt(( b * b) - (4 * a * c)) )  / (2 * a);
		double negativo = ( (-(b)) - Math.sqrt(( b * b) - (4 * a * c)) )  / (2 * a);
	
		
		System.out.println("Valores reales: " + positivo + " " + negativo);
*/	
		sc.close();
	}
}
