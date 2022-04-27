package com.loiane.curso.aula13e;

import java.util.Scanner;

// 6. Faça um programa que peça o raio de um círculo, calcule e mostre sua área.

public class Exer06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o raio do círculo: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é: " + area);
	}

}
