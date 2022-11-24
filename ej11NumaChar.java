package edu.kiara.daw.tema1ejercicios;

import java.util.Scanner;

public class ej11NumaChar {

	public static void main(String[] args) {
		
		/*convertir un entero a un char y comprobarlo
		con la tabla ASCII.
		*/
		
		System.out.println("introduzca un numero entero");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		//convertir a char y comprobarlo
		char ascii = (char) num;
		System.out.println(ascii);
		
		
		/*
		char caracter = '@';
		int rep = (int) caracter;
		System.out.println("El valor de ASCII es: " + rep);
		*/
		//da de resultado 64, que es el valor de la tabla ascii

	}
}
