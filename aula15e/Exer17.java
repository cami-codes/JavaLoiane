package com.loiane.curso.aula15e;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o ano");
		int ano = input.nextInt();
		
		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
			System.out.println(ano + " � um ano Bissexto!");
		} else {
			System.out.println(ano + " n�o � um ano bissexto");
		}

	}

}
