package com.loiane.curso.aula15e;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o preço do primeiro produto:");
		double prod1 = scan.nextDouble();
		System.out.println("Entre com o preço do segundo produto:");
		double prod2 = scan.nextDouble();
		System.out.println("Entre com o preço do terceiro produto:");
		double prod3 = scan.nextDouble();
		
		if (prod1 <= prod2 && prod1 <= prod3) {
			System.out.println("O primeiro produto está mais barato, pode comprar!");
		}else if (prod2 <= prod1 && prod2 <= prod3) {
			System.out.println("O segundo produto está mais barato, pode comprar!");
		}else if (prod3 <= prod1 && prod3 <= prod2) {
			System.out.println("O terceiro produto está mais barato, pode comprar!");
		}
	}

}
