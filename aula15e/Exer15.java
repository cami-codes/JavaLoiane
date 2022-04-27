package com.loiane.curso.aula15e;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.println("Digite o primeiro lado do seu tri�ngulo:");
		int lado1 = scan.nextInt();
		
		System.out.println("Digite o segundo lado:");
		int lado2 = scan.nextInt();
		
		System.out.println("Digite o terceiro e �ltimo lado:");
		int lado3 = scan.nextInt();
		
		if (((lado1 + lado2) > lado3) &&
				((lado1 +lado3) > lado2) &&
				((lado2 + lado3) > lado1)){
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Tr�s lados iguais = tri�ngulo equil�tero!");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Tr�s lados diferentes = tri�ngulo escaleno!");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Dois lados iguais = tri�ngulo is�sceles!");
			}
				
		}else {
			System.out.println("N�o � um tri�ngulo");
		}
		
		
	}

}
