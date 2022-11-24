package edu.kiara.daw.tema1ejercicios;

import java.util.Scanner;

public class ej4AñoBisiesto {


	/*
	 * Crea un programa que compruebe si un año es bisiesto. 
	 * “Año bisiesto es el divisible entre 4, salvo que sea año secular - último de cada siglo,
	 * terminado en «00»-, en cuyo caso también ha de ser divisible entre 400.”
	 */
	public static void main(String[] args) {
		
		int anio = 0;
		boolean isBisiesto = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime un año y te digo si es bisiesto o no");
		anio = sc.nextInt();
		sc.close();
		
		//cndiciones:
		//año divisible entre 4 y a su vez no div entre 100
		//año divisible entre 100 y a su vez no div entre 400
		//ejemplo: 2000 SI ES -- 1900, 1901 NO ES
		
		isBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0);
		
		
		System.out.println(isBisiesto ? "Es bisiesto" : "no es bisiesto");
		
	}
	
	
	
	
	
	
	
	/*
	Scanner sc = new Scanner(System.in);
	int anio = 0;

	System.out.println("dime un año y te digo si es bisiesto o no");
	anio = sc.nextInt();
	
	if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
		System.out.println("el año es bisiesto");
	}else {
		System.out.println("el año NO es bisiesto");
	}
	*/
	
}
