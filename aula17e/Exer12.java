package com.loiane.curso.aula17e;

import java.util.Scanner;
/* Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer n�mero entre 1 a 10. 
 * O usu�rio deve informar de qual n�mero ele deseja ver a tabuada.
 * 
 */
public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero para gerar a tabuada:");
		int num = scan.nextInt();
		
		System.out.println("Tabuada de " + num + ":");
		
		for (int i =1; i <=10; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
		

	}

}
