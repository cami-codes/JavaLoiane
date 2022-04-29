package com.loiane.curso.aula15e;
/*	16. Fa�a um programa que calcule as ra�zes de uma equa��o do segundo grau, na forma ax2 +bx+c. O programa dever� pedir os valores de a, b e c e fazer as consist�ncias, informando ao usu�rio nas seguintes situa��es:
		a. Se o usu�rio informar o valor de A igual a zero, a equa��o n�o � do segundo grau e o programa n�o deve fazer pedir os demais valores, sendo encerrado;
		b. Se o delta calculado for negativo, a equa��o n�o possui ra�zes reais. Informe ao usu�rio e encerre o programa;
		c. Se o delta calculado for igual a zero a equa��o possui apenas uma raiz real; Informe-a ao usu�rio;
		d. Se o delta for positivo, a equa��o possui duas ra�zes reais; informe-as ao usu�rio;

 * 
 */
import java.util.Scanner;

public class Exer16 {
	// equação de 2 grau
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o valor de a:");
		int a = scan.nextInt();
		if (a == 0) {
			System.out.println("N�o � equa��o de segundo grau");
		} else {
			System.out.println("Entre com o valor de b:");
			int b = scan.nextInt();
			
			System.out.println("Entre com o valor de c:");
			int c = scan.nextInt();
			
			double delta = (b*b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("Delta negativo.");
			} else {
				
				System.out.println("delta: " +delta);
				double x1 = ((-b) + Math.sqrt (delta)) / (2*a);
				double x2 = ((-b) - Math.sqrt (delta)) / (2*a);
				
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
				
			}
		}
		
	}

}
