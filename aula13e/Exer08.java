package com.loiane.curso.aula13e;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite quanto voc� ganha por hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalha por m�s? ");
		double horasTrab = scan.nextDouble();
		double total = valorHora*horasTrab;
		System.out.println("Isso � quanto voc� ganha por m�s: " + total);
		

	}

}
