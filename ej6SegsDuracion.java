package edu.kiara.daw.tema1ejercicios;

import java.util.Scanner;

public class ej6SegsDuracion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * . Realiza un programa que nos pida cuantos segundos duró un concierto, y nos
		 * calcule cuántas horas, minutos y segundos son.
		 */

		int num, hor, min, seg = 0;

		System.out.println("Cuantos segundos duró el concierto? ");
		num = sc.nextInt();
		
		hor = num / 3600;
		min = (num - (3600 * hor)) / 60;
		seg = num - ((hor * 3600) + (min * 60));
		System.out.println(hor + "h " + min + "m " + seg + "s");

		sc.close();
	}
}
