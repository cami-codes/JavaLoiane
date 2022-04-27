package com.loiane.curso.aula13e;
/* 	2. Faça um programa que peça um número e então mostre a mensagem "O número informado foi 
 * [numero].
 */

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		System.out.println("O número informado foi: " + numero);
	}

}
