package com.loiane.curso.aula15e;
// 	7. Fa�a um programa que leia tr�s n�meros e mostre o maior  e o menor deles.

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero:");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo n�mero:");
		int num2 = scan.nextInt();
		System.out.println("Digite o terceiro n�mero:");
		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O primeiro n�mero � maior");
		}else if (num2 > num1 && num2 >= num3) {
			System.out.println("O segundo n�mero � o maior");
		}else if (num3 > num1 && num3 >= num2){
			System.out.println("O terceiro n�mero � o maior");
		}
		
		if (num1 <= num2 && num1 <= num3) {
			System.out.println("E o " + num1 + " � menor");
		}else if (num2 <= num1 && num2 <= num3) {
			System.out.println("E o " +num2 + " � menor");
		}else if (num3 <= num1 && num3 <= num2){
			System.out.println("E o " +num3 + " � menor");
		}
	}
	
	

}
