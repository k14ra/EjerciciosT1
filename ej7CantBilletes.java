package edu.kiara.daw.tema1ejercicios;

import java.util.Scanner;

public class ej7CantBilletes {

	public static void main(String[] args) {

		/**
		 * . Realiza un programa que calcule cuántos 
		 * billetes hay que darle a un cliente
		 * que quiera sacar cierta cantidad de dinero 
		 * de su banco. Siempre calcularemos
		 * la mínima cantidad de billetes.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int b500, b200, b100, b50, b20, b10, b5;
		
		System.out.println("Dime la cantidad de euros: ");
		int cant = sc.nextInt();
		
		b500 = cant / 500;
		cant = cant % 500;
		
		b200 = cant / 200;
		cant = cant % 200;
		
		b100 = cant / 100;
		cant = cant % 100;
		
		b50 = cant / 50;
		cant = cant % 50;
		
		b20 = cant / 20;
		cant = cant % 20;
		
		b10 = cant / 10;
		cant = cant % 10;
		
		b5 = cant / 5;
		cant = cant % 5;
		
		System.out.println(b500 + " billetes de 500 \n" 
							+ b200 + " billetes de 200 \n" + 
							b100 + " billetes de 100 \n" +  
							b50 + " billetes de 50 \n" + 
							b20 + " billetes de 20 \n" +
							b10 + " billetes de 10 \n" +
							b5 + " billetes de 5 \n");
		
		System.out.println("Y faltarian " + cant + "en monedas");
	
		sc.close();
	}
}
