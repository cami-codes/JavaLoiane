package com.loiane.curso.aula13e;
/* 	2. Fa�a um programa que pe�a um n�mero e ent�o mostre a mensagem "O n�mero informado foi 
 * [numero].
 */

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = scan.nextInt();
		System.out.println("O n�mero informado foi: " + numero);
	}

}
