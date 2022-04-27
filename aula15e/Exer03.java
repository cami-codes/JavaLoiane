package com.loiane.curso.aula15e;


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
		}else {
			System.out.println("Sexo inválido");
		}
		
	}

}
