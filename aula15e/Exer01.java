package com.loiane.curso.aula15e;
import java.util.Scanner;
// 	1. Fa�a um programa que pe�a dois n�meros e imprima o maior deles.

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero:");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo n�mero:");
		int num2 = scan.nextInt();
		if (num1 >= num2) {
			System.out.println(num1 + " � maior que " + num2);
			
		} else if (num1 <= num2) {
			System.out.println(num2 + " � maior que " + num1);
			
		}

	}

}
