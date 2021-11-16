package org.generation.italy;

import java.util.Scanner;


public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("inserisci i km da percorrere ");
		double kmDaPercorrere = scanner.nextDouble();
		System.out.print("inserisci la tua età ");
		int eta = scanner.nextInt();
		double prezzoPerKilometro = 0.21;
		double scontoOver= 0.6;
		double scontoMinorenni= 0.8;
		
		
		double prezzoFinal = (kmDaPercorrere * prezzoPerKilometro);
		if ( eta < 18 && !(eta<0)) {
			prezzoFinal = prezzoFinal * scontoMinorenni;
			
		}else if (eta > 65) {
			prezzoFinal = prezzoFinal * scontoOver;
			
			
		}
		System.out.println("il prezzo del biglietto è " + prezzoFinal + "€");
		System.out.println("Età: " + eta);
		System.out.println("Kilometri: " + kmDaPercorrere);
		if (eta < 18 && eta>0 || eta > 65  ) {
			System.out.print("il tuo sconto è del ");
		}
		if (eta < 18 && eta>0) {
			System.out.print("20%");
		}
		if (eta > 65) {
			System.out.print("40%");
		}
		scanner.close();
	}

}
