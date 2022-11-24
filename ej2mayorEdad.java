package edu.kiara.daw.tema1ejercicios;

import java.util.Scanner;

public class ej2mayorEdad {

	//programa que me diga si soy o no mayor de edad...
	final int mayorEdad = 18;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//constante para la edad
		final int MAYOR_EDAD = 18;
		
		//def de variables
		int edad = 25;
		boolean mayorEdad;  //por defecto es false
		
		
		System.out.println("Dime tu edad y te diré si eres mayor de edad: ");
		edad = sc.nextInt();
		sc.close();
		
		mayorEdad = edad >= MAYOR_EDAD;
		System.out.println("Es mayor de edad?: " + mayorEdad);
		
		
		/*
		String resul = edad >= 18 ? "SI" : "NO";
		System.out.println(resul);
		*/

		
		/*
		 * 		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int numero = 0;
		
		
		do {
			System.out.println("Dime tu edad y te diré si eres mayor de edad: ");
			numero = sc.nextInt();
			
			if(numero<0) {
				System.out.println("introduce un numero válido, vuelvelo a intentar");
			}
			
			if (numero<18 && numero > 0) {
				System.out.println("eres MENOR de edad");
			}else if(numero > 0){
				System.out.println("eres MAYOR de edad");
			}
			cont++;
		}while(numero>0 && cont < 5);
		 * */
	}
	
}
