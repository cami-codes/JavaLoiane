package com.loiane.curso.aula13e;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Este programa mostra a m�dia de 4 notas bimestrais.");
		System.out.println("Digite sua primeira nota: ");
		int nota1 = scan.nextInt();
		System.out.println("Digite a segunda nota: ");
		int nota2 = scan.nextInt();
		System.out.println("Digite a terceira nota: ");
		int nota3 = scan.nextInt();
		System.out.println("Digite a quarta e �ltima nota: ");
		int nota4 = scan.nextInt();
		int resultado = (nota1+nota2+nota3+nota4) / 4;
		System.out.println("A m�dia �: "+ resultado);
	}

}
