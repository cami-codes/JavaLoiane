package com.loiane.curso.aula13e;
/* 	13. Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas
 *  no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são 
 *  descontados 11% para o imposto de renda, 8% pro INSS e 5% pro sindicato, faça um programa 
 *  que nos dê:
salário bruto
a. quanto pagou ao INSS
b. quanto pagou ao sindicato
c. o salário líquido
d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ Sindicato (5%) : R$ = Salário Líquido: R$
*/

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite quanto você ganha por hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês? ");
		double horasTrab = scan.nextDouble();
		
		double salarioBruto = valorHora*horasTrab;	
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double imposto = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + imposto;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário bruto: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Imposto de Renda: " + imposto);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Salário líquido: " + salarioLiquido);
	
		
	}

}
