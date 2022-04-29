package com.loiane.curso.aula15e;
// 	2. Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num = scan.nextInt();
		if (num >= 0) {
			System.out.println("O número informado é positivo");
		}else {
			System.out.println("O número informado é negativo");
		}

	}

}
