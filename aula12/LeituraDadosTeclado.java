package com.loiane.curso.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: "+ nomeCompleto);

		System.out.println("Seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome);*/
		
		/*System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade �: "+ idade);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura �: " + altura);*/
		
		System.out.println("Digite o seu primeiro nome, idade, altura e se tem bicho de estima��o: ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		float altura = scan.nextFloat();
		boolean temPets = scan.nextBoolean();
		
		System.out.println("Voc� digitou os seguintes valores: ");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Tem pets? " + temPets);
	}


}
