package com.loiane.curso.aula13e;

import java.util.Scanner;

/* 	7. Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro desta 
 * área para o usuário.
 */

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do lado do quadrado ");
		double lado = scan.nextDouble();
		
		// area = lado * lado
		double area = Math.pow(lado, 2);
		
		System.out.println("A área do quadrado é: " + area);
		System.out.println("O dobro da área do quadrado é: " + (area * 2));

	}

}
