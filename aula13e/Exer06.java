package com.loiane.curso.aula13e;

import java.util.Scanner;

// 6. Fa�a um programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.

public class Exer06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o raio do c�rculo: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A �rea do c�rculo �: " + area);
	}

}
