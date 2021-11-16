package org.generation.italy;

import java.util.Scanner;


public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("inserisci i km da percorrere ");
		double kmDaPercorrere = scanner.nextDouble();
		System.out.print("inserisci la tua età ");
		int eta = scanner.nextInt();
		
		
		double prezzoBase = (kmDaPercorrere * 0.21);
		if ( eta < 18) {
			double prezzoFinal = prezzoBase * 0.8;
			//System.out.println(prezzoFinal);//
		}else if (eta > 65) {
			double prezzoFinal = prezzoBase * 0.6;
			//System.out.println(prezzoFinal);//
			
		} else System.out.println(prezzoBase);
	}

}
