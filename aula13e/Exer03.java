package com.loiane.curso.aula13e;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero que voc� deseja somar: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int num2 = scan.nextInt();
		int resultado = (num1 + num2);
		System.out.println("O resultado �: "+ resultado);
	}

}
