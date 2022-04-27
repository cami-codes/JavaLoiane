package com.loiane.curso.aula15e;

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
