package com.loiane.curso.aula15e;
/*	15. Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar se os 
 * valores podem ser um triângulo. Indique, caso os lados formem um triangulo, 
 * se o mesmo é: equilátero, isósceles ou escaleno.
		○ Dicas
		○ Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que 
		o terceiro;
		○ Triângulo Equilátero: três lados iguais;
		○ Triângulo Isósceles: quaisquer dois lados iguais;
		○ Triângulo Escaleno: três lados diferentes;
 */
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
