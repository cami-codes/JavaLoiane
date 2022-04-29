package com.loiane.curso.aula17e;

// import java.util.Scanner;

public class Exer04 {
/*
 * 4. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual 
 * de crescimento de 3% e que a população B seja 200000 habitantes com uma taxa de crescimento
 *  de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a 
 *  população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de 
 *  crescimento.

 */
	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		
		int popA = 80000;
		int popB = 200000;
		int cont = 0;
		
		while(popA <= popB) {
			
			popA += (popA/100) * 3;
			popB +=	(popB/100) * 1.5;
			cont++;
		}
		
		System.out.println("População A: " +popA);
		System.out.println("População B: " +popB);
		System.out.println("Quantidade de anos:     " + cont);

	}

}
