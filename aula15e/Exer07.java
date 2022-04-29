package com.loiane.curso.aula15e;
// 	7. Faça um programa que leia três números e mostre o maior  e o menor deles.

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo número:");
		int num2 = scan.nextInt();
		System.out.println("Digite o terceiro número:");
		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O primeiro número é maior");
		}else if (num2 > num1 && num2 >= num3) {
			System.out.println("O segundo número é o maior");
		}else if (num3 > num1 && num3 >= num2){
			System.out.println("O terceiro número é o maior");
		}
		
		if (num1 <= num2 && num1 <= num3) {
			System.out.println("E o " + num1 + " é menor");
		}else if (num2 <= num1 && num2 <= num3) {
			System.out.println("E o " +num2 + " é menor");
		}else if (num3 <= num1 && num3 <= num2){
			System.out.println("E o " +num3 + " é menor");
		}
	}
	
	

}
