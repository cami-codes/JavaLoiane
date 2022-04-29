package com.loiane.curso.aula15e;
// 	3. Faça um programa que verifique se uma letra digitada é "F" ou "M"
// Conforme a letra escrever: F- Feminino, M- Masculino, Não binário- nao binário


import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//em string não se usa == pra comparar algo, se usa o var.equalsIgnoreCase
		
		System.out.println("Digite uma letra (F/M):");
		String letra = scan.next();
		if (letra.equalsIgnoreCase("F")){
			System.out.println("Feminino");
		}else if (letra.equalsIgnoreCase("M")){
			System.out.println("Masculino");	
		}else if (letra.equalsIgnoreCase("nao binario")){
			System.out.println("Não binário");
		} else {
			System.out.println("Inválido");
		}
		
	}

}
