package edu.kiara.daw.tema1;

import java.util.Scanner;

public class añoenCeroCero {

	// probando si un año acaba en 0 y en 00
	/*
	 * como puedo saber los ultimos dos digitos??? se me ocurre hacer algo asi:
	 * UltimoDigito = num%10; PenultimoDigito = num%100;
	 * 
	 * basicamente si anio%100 == 0 el numero acaba en cero
	 * 
	 * 
	 * 
	 * if(anio%10==0){ sout "El año acaba en 0" if(anio%10==0 && anio%100==0){ sout
	 * "El año acaba en 00"
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anio = 0;

		System.out.println("dime un año y te digo si acaba en 0 o 00");
		anio = sc.nextInt();
		sc.close();
			
		if (anio % 10 == 0 && anio % 100!= 0) {
			System.out.println("año acaba en 0");
		}

		if (anio % 10 == 0 && anio % 100 == 0) {
			System.out.println("año acaba en 00");
		}

	}

}
