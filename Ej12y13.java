package edu.kiara.daw.tema1ejercicios;

import java.util.Scanner;

public class Ej12y13 {

	public static String nombre = "Kiara Granados";
	public static String direccion = "Calle del Tomillo";
	public static int telefono = 640206022;
	
	public static void main(String[] args) {
		/*
		 * 12.Escribe un programa que muestre tu nombre por pantalla. 
		 * 13.Modifica el programa anterior para que además se muestre tu dirección y tu número de
		 * teléfono. Asegúrate de que los datos se muestran en líneas separadas.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre: " + nombre);
		System.out.println("Direccon: " + direccion);
		System.out.println("Numero de telefono: " + telefono);
		
		sc.close();

//		System.out.println("nombre: ");
		//String nombre = sc.next(); //coge la primera palabra de la frase
		//String nombre = sc.nextLine(); //coge la frase entera
		//sc.close();
		//System.out.println("su nobre es: " + nombre);

	}
}
