package com.loiane.curso.aula17e;

import java.util.Scanner;

public class Exer02 {
/*
 * 2. Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha igual 
 * ao nome de usu�rio, mostrando uma mensagem de erro e voltando a pedir informa��es.
 */
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = false;
		
		do {
			
			System.out.println("Digite seu nome de usu�rio");
			String nomeUsuario = scan.next();
			
			System.out.println("Digite sua senha");
			String senha = scan.next();
			
			if (nomeUsuario.equalsIgnoreCase(senha)) {
				infoValidas = false;
				System.out.println("Senha igual ao usu�rio, por favor tente novamente.");
			} else {
				infoValidas = true;
				System.out.println("Usu�rio e senha v�lidos!");
			}
		} while (!infoValidas);

	}

}
