package edu.kiara.daw.tema1;

import java.util.Scanner;

public class MayorEdad {

	// crear programa que diga si eres mayor de edad

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
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
		
	}
}
