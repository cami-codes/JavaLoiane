package com.loiane.curso.aula13e;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite quanto você ganha por hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês? ");
		double horasTrab = scan.nextDouble();
		double total = valorHora*horasTrab;
		System.out.println("Isso é quanto você ganha por mês: " + total);
		

	}

}
