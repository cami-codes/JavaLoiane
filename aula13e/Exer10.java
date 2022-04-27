package com.loiane.curso.aula13e;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Entre com a temperatura em Celsius: ");
		double c = scanner.nextDouble();
		
		double f = (c * 1.8) + 32;
		
		System.out.println("A temperatura " + c + " C é igual a " + f + "F");

	}

}
