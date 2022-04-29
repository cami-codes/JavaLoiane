package com.loiane.curso.aula15e;
/*	11. As organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e
 *  lhe contrataram para desenvolver o programa que calculará os reajustes.
		○ Faça um programa que receba o salário de um colaborador e o reajuste segundo o 
		seguinte critério, baseado no salário atual:
		○ Salários até R$ 280,00 (incluindo) : aumento de 20%
		○ Salários entre  R$ 280,00 e R$ 700,00 : aumento de 15%
		○ Salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
		○ Salários de R$ 1500,00 em diante : aumento de 5%. 
Após o aumento ser realizado, informe na tela:
		○ O salário antes do reajuste;
		○ O percentual de aumento aplicado;
		○ O valor do aumento;
		○ O novo salário, após o aumento.

 * 
 */


import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu salário:");
		double salAtual = scan.nextDouble();
		
		int percentual = 0;
		if (salAtual <= 280) {
			percentual = 20;
		} else if (salAtual > 280 && salAtual <= 700) {
			percentual = 15;
		} else if (salAtual > 700 && salAtual <= 1500) {
			percentual = 10;
		} else if (salAtual > 1500) {
			percentual = 5;
		}
		
		double aumento = (salAtual / 100) * percentual;
		double salAjustado = salAtual + aumento;
		
		System.out.println("Salário: " + salAtual);
		System.out.println("Percentual: " + percentual);
		System.out.println("Aumento: " + aumento);
		System.out.println("Salário ajustado: " + salAjustado);
	}

}
