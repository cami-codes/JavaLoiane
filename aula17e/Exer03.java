package com.loiane.curso.aula17e;

import java.util.Scanner;

public class Exer03 {
/*
 * 	Faça um programa que leia e valide as seguintes informações:
		a. Nome: maior que 3 caracteres;
		b. Idade: entre 0 e 150;
		c. Salário: maior que zero;
		d. Sexo: 'f' ou 'm';
		e. Estado civil: 's', 'c', 'v', 'd';

 */
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		
		do {
			System.out.println("Digite um nome 	");
			nome = scan.next();
			
			if (nome.length() >=3) {
				infoValida = true;
			} else {
				System.out.println("O nome precisa ter mais de 3 caracteres, tente novamente.");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Digite uma idade ");
			idade = scan.nextInt();
			
			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("A idade precisa ser entre 0 e 150, tente novamente.");
				
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Digite seu salário ");
			salario = scan.nextDouble();
			
			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("O salário precisa ser maior que 0, tente novamente.");
				
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Digite seu sexo ('M', 'F' ou 'não-binárie') ");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("M")) {
				infoValida = true;
			} else if (sexo.equalsIgnoreCase("F")){
				infoValida = true;
			} else if (sexo.equalsIgnoreCase("não-binárie")) {
				infoValida = true;
			} else {
				System.out.println("Sexo inválido");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Digite seu estado civil ('S', 'C', 'V' ou 'D') ");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("S")) {
				infoValida = true;
			} else if (estadoCivil.equalsIgnoreCase("C")){
				infoValida = true;
			} else if (estadoCivil.equalsIgnoreCase("V")) {
				infoValida = true;
			} else if (estadoCivil.equalsIgnoreCase("D")) {
				infoValida = true;
			} else {
				System.out.println("Estado civil inválido, tente novamente.");
			}
		} while (!infoValida);
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);
	}
}