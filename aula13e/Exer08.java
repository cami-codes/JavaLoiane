package com.loiane.curso.aula13e;
/*
 * 8. Fa�a um programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas
 *  no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.
 */

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
