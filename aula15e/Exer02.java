package com.loiane.curso.aula15e;
// 	2. Fa�a um programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		int num = scan.nextInt();
		if (num >= 0) {
			System.out.println("O n�mero informado � positivo");
		}else {
			System.out.println("O n�mero informado � negativo");
		}

	}

}
