package com.loiane.curso.aula15e;
// 	3. Fa�a um programa que verifique se uma letra digitada � "F" ou "M"
// Conforme a letra escrever: F- Feminino, M- Masculino, N�o bin�rio- nao bin�rio


import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//em string n�o se usa == pra comparar algo, se usa o var.equalsIgnoreCase
		
		System.out.println("Digite uma letra (F/M):");
		String letra = scan.next();
		if (letra.equalsIgnoreCase("F")){
			System.out.println("Feminino");
		}else if (letra.equalsIgnoreCase("M")){
			System.out.println("Masculino");	
		}else if (letra.equalsIgnoreCase("nao binario")){
			System.out.println("N�o bin�rio");
		} else {
			System.out.println("Inv�lido");
		}
		
	}

}
