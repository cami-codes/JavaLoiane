package com.loiane.curso.aula13e;

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
