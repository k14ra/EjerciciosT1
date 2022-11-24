package edu.kiara.daw.tema1;

import java.util.Scanner;

public class AñosBisiestos {

	public static void main(String[] args) {

		/*
		 * Crea un programa que compruebe si un año es bisiesto. 
		 * “Año bisiesto es el divisible entre 4, salvo que sea año secular - último de cada siglo,
		 * terminado en «00»-, en cuyo caso también ha de ser divisible entre 400.”
		 */
		
		Scanner sc = new Scanner(System.in);
		int anio = 0;

		System.out.println("dime un año y te digo si es bisiesto o no");
		anio = sc.nextInt();
		
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
			System.out.println("el año es bisiesto");
		}else {
			System.out.println("el año NO es bisiesto");
		}
		
		
	}
	
	/*como puedo saber los ultimos dos digitos???
	 se me ocurre hacer algo asi:
	 UltimoDigito = num%10;
	 PenultimoDigito = num%100;
	 
	 basicamente si anio%100 == 0 el numero acaba en cero
	 
	 
	 
	 if(anio%10==0){ sout "El año acaba en 0"
	 if(anio%10==0 && anio%100==0){ sout "El año acaba en 00"
	*/
	
	

}
