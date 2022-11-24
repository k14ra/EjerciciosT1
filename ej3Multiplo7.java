package edu.kiara.daw.tema1ejercicios;

import java.util.Scanner;

public class ej3Multiplo7 {

	final int num = 7;
	
	public static void main(String[] args) {
		//programa que diga si un numero es multiplo de 7
		
		//tendre que usar el mod --> %
		
		Scanner sc = new Scanner(System.in);
		int numTec = 0;
		
		System.out.println("dime un numero y te dire si es multiplo de 7 o no: ");
		numTec = sc.nextInt();
		
		System.out.println(numTec%7==0 ? "SI" : "NO");
		
		//String resultado = numTec % 7 == 0 ? "es multiplo" : "n es multiplo";
		
		/*
		if (numTec % 7 == 0) {
			System.out.println("es multiplo de 7");
		}else {
			System.out.println("NO es multiplo de 7");
		}
		*/
	}
	
}
