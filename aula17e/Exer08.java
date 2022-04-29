package com.loiane.curso.aula17e;

import java.util.Scanner;
//		8. Faça um programa que leia 5 números e informe a soma e a média dos números.
public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int soma = 0;
		double media;
		
		for (int i = 0; i<5; i++) {
			System.out.println("Digite um número:");
			num = scan.nextInt();
			
			soma += num;
			
		}
		
		media = soma / 5;
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}

}
