package com.loiane.curso.aula15e;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite a opera��o que deseja utilizar (+ - / *) :");
		String operacao = scan.next();
		
		System.out.println("Digite o segundo n�mero:");
		int num2 = scan.nextInt();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao){
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "/": resultado = num1 / num2; break;
		case "*": resultado = num1 * num2; break;
		default:
			System.out.println("Opera��o inv�lida."); valida = false;
		
		}
		
		if (valida) {
			System.out.println("Resultado: " + resultado);
			
			if (resultado >=0) {
				System.out.println(" resultado positivo");
			} else {
				System.out.println(" resultado negativo");
			}
			
			if (resultado % 2 == 0) {
				System.out.println(" resultado par");
			} else {
				System.out.println(" resultado �mpar");
			}
			
		}
	}

}
