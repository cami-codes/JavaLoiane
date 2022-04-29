package com.loiane.curso.aula15e;
import java.util.Scanner;
// 	1. Faça um programa que peça dois números e imprima o maior deles.

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo número:");
		int num2 = scan.nextInt();
		if (num1 >= num2) {
			System.out.println(num1 + " é maior que " + num2);
			
		} else if (num1 <= num2) {
			System.out.println(num2 + " é maior que " + num1);
			
		}

	}

}
