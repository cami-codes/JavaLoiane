package com.loiane.curso.aula15e;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tipo da carne:");
		System.out.println("1- Filé Duplo");
		System.out.println("2- Alcatra");
		System.out.println("3- Picanha");
		int tipo = scan.nextInt();
		
		System.out.println("Informe a quantidade em kg:");
		double qtd = scan.nextDouble();
		
		double precoKg = 0;
		
		if (tipo == 1) {
			
			System.out.println(qtd + "kg - Filé Duplo");
			
			if (qtd < 5) {
				precoKg = 4.9;
			} else {
				precoKg = 5.8;
			}	
		} else if (tipo == 2) {
			
			System.out.println(qtd + "kg - Alcatra");
			
			if (qtd < 5) {
				precoKg = 5.9;
			} else {
				precoKg = 6.8;
			}
		} else if (tipo == 3) {
			
			System.out.println(qtd + "kg - Picanha");
			
			precoKg = 6.9;
		} else {
			precoKg = 7.8;
		}
		
		double total = qtd * precoKg;
		System.out.println(qtd + "kg * " +  precoKg + " = " + total);
		
		System.out.println("A compra será feita no cartão? Se sim, digite 1.");
		int cartao = scan.nextInt();
		
		if (cartao == 1) {
			double desconto = (total / 100) * 5;
			System.out.println("Desconto de: " + desconto);
			System.out.println("Valor a pagar: " + (total - desconto));
		} else {
			System.out.println("Valor a pagar: " + total);
		}
	}

}
