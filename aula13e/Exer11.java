package com.loiane.curso.aula13e;

import java.util.Scanner;

import javax.xml.stream.util.EventReaderDelegate;

public class Exer11 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero inteiro: ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com um outro n�mero inteiro: ");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com um n�mero real: ");
		double num3 = scan.nextDouble();
		
		// o produto do dobro do primeiro com metade do segundo.
		int resultado1 = (num1 * 2) * (num2 / 2);
		
		//a soma do triplo do primeiro com o terceiro.
		double resultado2 = (num1 * 3) + num3;
		
		//o terceiro elevado ao cubo.
		double resultado3 = Math.pow(num3, 3);
		
		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2: " + resultado2);
		System.out.println("Resultado 3: " + resultado3);
		

	}

}
