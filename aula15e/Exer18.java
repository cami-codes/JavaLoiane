package com.loiane.curso.aula15e;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro:");
		int numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Par.");
		} else {
			System.out.println("Ímpar.");
		}

	}

}
