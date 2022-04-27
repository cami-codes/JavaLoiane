package com.loiane.curso.aula15e;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra:");
		
		String letra = scan.next();
		if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || 
			letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || 
			letra.equalsIgnoreCase("U")){ 
				System.out.println("Vogal");			
		}else {
			System.out.println("Consoante");
		}
	}

}
