package com.loiane.curso.aula17e;

import java.util.Scanner;

public class Exer02 {
/*
 * 2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual 
 * ao nome de usuário, mostrando uma mensagem de erro e voltando a pedir informações.
 */
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = false;
		
		do {
			
			System.out.println("Digite seu nome de usuário");
			String nomeUsuario = scan.next();
			
			System.out.println("Digite sua senha");
			String senha = scan.next();
			
			if (nomeUsuario.equalsIgnoreCase(senha)) {
				infoValidas = false;
				System.out.println("Senha igual ao usuário, por favor tente novamente.");
			} else {
				infoValidas = true;
				System.out.println("Usuário e senha válidos!");
			}
		} while (!infoValidas);

	}

}
