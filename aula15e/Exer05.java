package com.loiane.curso.aula15e;
/* 	5. Fa�a um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
A mensagem "Reprovado", se a m�dia alcan�ada for menor que sete;
A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.
*/

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a primeira nota:");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota:");
		double nota2 = scan.nextDouble();
		double media = (nota1 + nota2)/2;
		
		if (media == 10 ) {
			System.out.println("Aprovado com Distin��o");
		}else if (media < 7) {
			System.out.println("Reprovado");
		}else{
			System.out.println("Reprovado");
		}
	}

}
