package com.loiane.curso.aula15e;
/* 	8. Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto voc� 
 * deve comprar,  sabendo que a decis�o � sempre pelo mais barato.
 */

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o pre�o do primeiro produto:");
		double prod1 = scan.nextDouble();
		System.out.println("Entre com o pre�o do segundo produto:");
		double prod2 = scan.nextDouble();
		System.out.println("Entre com o pre�o do terceiro produto:");
		double prod3 = scan.nextDouble();
		
		if (prod1 <= prod2 && prod1 <= prod3) {
			System.out.println("O primeiro produto est� mais barato, pode comprar!");
		}else if (prod2 <= prod1 && prod2 <= prod3) {
			System.out.println("O segundo produto est� mais barato, pode comprar!");
		}else if (prod3 <= prod1 && prod3 <= prod2) {
			System.out.println("O terceiro produto est� mais barato, pode comprar!");
		}
	}

}
