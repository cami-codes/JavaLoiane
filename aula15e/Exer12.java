package com.loiane.curso.aula15e;
/*	12. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são
 *  do Imposto de Renda que depende do  salário bruto (conforme a tela abaixo) e 3% 
 *  para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado 
 *  (é a empresa que deposita). O salário Líquido corresponde ao Salário Bruto menos os 
 *  descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de 
 *  horas trabalhadas no mês.
		○ Desconto do Imposto de Renda:
		○ Salário Bruto até 900 (inclusive) - isento
		○ Salário Bruto até 1500 (inclusive) - desconto de 5%
		○ Salário Bruto até 2500 (inclusive) - desconto de 10%
		○ Salário Bruto acima de 2500 - desconto de 20%. 
Imprima na tela  as informações, dispostas conforme o exemplo abaixo. 
No exemplo o valor da hora é 5 e a quantidade de horas trabalhadas é 220.
		○ Salário Bruto: (5 * 220)               : R$ 1100,00
		○ (-) IR (5%)                                      : R$ 55,00
		○ (-) INSS (10%)                               : R$ 110,00
		○ FGTS (11%)                                   : R$ 121,00
		○ Total de descontos                     : R$ 165,00
		○ Salário líquido                             : R$ 935,00

 * 
 */
import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês?");
		double qtdHoras = scan.nextDouble();
		
		double salarioBruto = valorHora * qtdHoras;
		
		int percentualIR = 0;
		
		if (salarioBruto <= 900) {
			percentualIR = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		} else if (salarioBruto > 2500) {
			percentualIR = 20;
		}

		double ir = (salarioBruto / 100) * percentualIR;
		double inss  = (salarioBruto / 100) * 10;
		double fgts  = (salarioBruto / 100) * 11;
		double totalDescontos  = ir = inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário bruto: (" + valorHora + " * " + qtdHoras + "): " + salarioBruto);
		System.out.println("(-) IR (" +percentualIR + "%:" + ir);
		System.out.println("(-) INSS ( 10%):" + inss);
		System.out.println("FGTS ( 11%):" + fgts);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Salário líquido: " + salarioLiquido);
	}

}
