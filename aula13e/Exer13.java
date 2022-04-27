package com.loiane.curso.aula13e;
/* 	13. Fa�a um programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas
 *  no m�s. Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o 
 *  descontados 11% para o imposto de renda, 8% pro INSS e 5% pro sindicato, fa�a um programa 
 *  que nos d�:
sal�rio bruto
a. quanto pagou ao INSS
b. quanto pagou ao sindicato
c. o sal�rio l�quido
d. calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
+ Sal�rio Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ Sindicato (5%) : R$ = Sal�rio L�quido: R$
*/

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite quanto voc� ganha por hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalha por m�s? ");
		double horasTrab = scan.nextDouble();
		
		double salarioBruto = valorHora*horasTrab;	
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double imposto = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + imposto;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Sal�rio bruto: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Imposto de Renda: " + imposto);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Sal�rio l�quido: " + salarioLiquido);
	
		
	}

}
