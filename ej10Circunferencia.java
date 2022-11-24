package edu.kiara.daw.tema1ejercicios;

import java.util.Scanner;

public class ej10Circunferencia {
	static final double PI = 3.1415;
	
	public static void main(String[] args) {
		/*
		 * Crea un programa que pida cuál es el radio de una circunferencia y nos
		 * calcule cuál es la longitud y el área.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("dime el radio de una circunferencia para saber su longitud y área: ");
		
		int radio = sc.nextInt();
		
		//double longitud = 2 * Math.PI * radio
		//double area = Math.PI * Math.pow(radio, 2);
		
		double longitud = 2*PI*radio;
		double area = PI*(radio*radio);
		
		System.out.println("La longitud es: " + longitud + "\nEl area es: " + area);
	}
}
