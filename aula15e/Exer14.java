package com.loiane.curso.aula15e;
/*	14. Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina 
 * ao longo de um semestre e calcule sua média. A atribuição de conceitos obedece à tabela 
 * abaixo:
		○ Média de Aproveitamento	Conceito
		Entre 9.0 e 10.00	A
		Entre 7.5 e 9.0	B
		Entre 6.0 e 7.5	C
		Entre 4.0 e 6.0	D
		Entre 4.0 e 0.00	E
		○ O algoritmo deve mostrar na tela as notas, a média o conceito correspondente 
		e a mensagem "APROVADO" se o conceito for A, B ou C e "REPROVADO" se D ou E.

 * 
 */
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
