package com.loiane.curso.aula15e;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.println("Digite o primeiro lado do seu triângulo:");
		int lado1 = scan.nextInt();
		
		System.out.println("Digite o segundo lado:");
		int lado2 = scan.nextInt();
		
		System.out.println("Digite o terceiro e último lado:");
		int lado3 = scan.nextInt();
		
		if (((lado1 + lado2) > lado3) &&
				((lado1 +lado3) > lado2) &&
				((lado2 + lado3) > lado1)){
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Três lados iguais = triângulo equilátero!");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Três lados diferentes = triângulo escaleno!");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Dois lados iguais = triângulo isósceles!");
			}
				
		}else {
			System.out.println("Não é um triângulo");
		}
		
		
	}

}
