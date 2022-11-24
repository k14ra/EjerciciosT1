package edu.kiara.daw.tema1ejercicios;

import java.util.Scanner;

public class ej8NumsOrdenados {

	public static void main(String[] args) {
		
		/*Programa que introduzca 3 nums y diga
		 * si estan ordenados o no*/
		
		Scanner sc = new Scanner(System.in);
		int x, y, z;

		System.out.println("Introduce un numero: ");
		x = sc.nextInt();
		System.out.println("Introduce un numero: ");
		y = sc.nextInt();
		System.out.println("Introduce un numero: ");
		z = sc.nextInt();
	
		boolean ordenados = x <= y && y <= z || x >= y && y >= z;
		System.out.println(ordenados ? "estan ordenaos" : "no estan ordenados");
		
		/*
		String orden = x < y && y < z || x > y && y>z ? "estan ordenados" : "no estan ordenados";
		System.out.println(orden);
*/
	}
}
