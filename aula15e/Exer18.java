package com.loiane.curso.aula15e;
/*	18. Fa�a um programa que pe�a um n�mero inteiro e determine se ele � par ou �mpar. 
 * Dica: utilize o operador m�dulo (resto da divis�o).

 * 
 */
import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um n�mero inteiro:");
		int numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Par.");
		} else {
			System.out.println("�mpar.");
		}

	}

}
