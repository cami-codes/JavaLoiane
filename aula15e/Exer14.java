package com.loiane.curso.aula15e;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.println("Digite a primeira nota");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota");
		double nota2 = scan.nextDouble();
		double media = (nota1+nota2) / 2;
		
		if (media >= 9 && media <= 10) {
			System.out.println("Sua média é: " + media + " A- Aprovado");
		} else if (media >= 7.5 && media <= 9) {
			System.out.println("Sua média é: " + media + " B- Aprovado");
		} else if (media >= 6 && media <= 7.5) {
			System.out.println("Sua média é: " + media + " C- Aprovado");
		} else if (media >= 4 && media <= 6) {
			System.out.println("Sua média é: " + media + " D- Reprovado");
		} else if (media < 4) {
			System.out.println("Sua média é: " + media + " E- Reprovado");
		}
	}

}
