package com.loiane.curso.aula13e;
/*	9. Faça um programa que peça a temperatura em graus Farenheit, 
 * transforme e mostre a temperatura em graus Celsius. C= (5 * (F-32) /9).
 */

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Entre com a temperatura em Farenheit: ");
		double f = scanner.nextDouble();
		
		double c = (5 * (f-32) /9);
		
		System.out.println("A temperatura " + f + " F é igual a " + c + "C");

	}

}
