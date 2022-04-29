package com.loiane.curso.aula15e;
/*	13. Faça um programa que leia um número e exiba o dia correspondente da semana. 
 * (1- Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
 */
import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um dia da semana (1-7):");
		
		int diaSemana = scan.nextInt();
		
		if (diaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaSemana == 2) {
			System.out.println("Segunda");
		} else if (diaSemana == 3) {
			System.out.println("TerÃ§a-feira");
		} else if (diaSemana == 4) {
			System.out.println("Quarta-feira");
		} else if (diaSemana == 5) {
			System.out.println("Quinta-feira");
		} else if (diaSemana == 6) {
			System.out.println("Sexta-feira");
		} else if (diaSemana == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Dia inválido");
		}
		
	}

}
