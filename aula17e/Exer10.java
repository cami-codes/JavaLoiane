package com.loiane.curso.aula17e;
/*  10. Fa�a um programa que receba dois n�meros inteiros e gere os n�meros inteiros que est�o 
 *  no intervalo compreendido por eles.
 */ 


import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo n�mero");
		int num2 = scan.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
			
		}
			

	}

}
