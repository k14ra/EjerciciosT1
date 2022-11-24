package edu.kiara.daw.tema1ejercicios;

import java.util.Scanner;

public class ej5PesoLuna {
	public final static float GTierra = 9.8f;
	public final static float GLuna = 1.62f;
	
	public static void main(String[] args) {
		
		//float pesoTierra, pesoLuna;SS
		
		
		Scanner sc = new Scanner(System.in);
		//float peso1 = sc.nextFloat();
		System.out.println("Cuanto pesas? ");
		
		float pesoTierra = Float.valueOf(sc.next());
		float pesoLuna = pesoTierra * GLuna  / GTierra;

		
		System.out.println("Su peso en la tierra es: " + pesoTierra 
				+ " y su peso en la luna es: " + pesoLuna);
		
		sc.close();
	}
}
