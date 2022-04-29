package com.loiane.curso.aula17e;

import java.util.Scanner;
/* Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número entre 1 a 10. 
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 * 
 */
public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número para gerar a tabuada:");
		int num = scan.nextInt();
		
		System.out.println("Tabuada de " + num + ":");
		
		for (int i =1; i <=10; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
		

	}

}
