package com.loiane.curso.aula15e;
/*	20. Fa�a um programa que fa�a 5 perguntas pra uma pessoa sobre um crime. As perguntas s�o:
		a. "Telefonou para a v�tima?"
		b. "Esteve no local do crime?"
		c. "Mora perto da v�tima?"
		d. "Devia para a v�tima?"
		e. "J� trabalhou com a v�tima?"
O programa deve no final emitir uma classifica��o sobre a participa��o da pessoa no crime. Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "Suspeita", entre 3 e 4 como "C�mplice" e 5 como "Assassino". Caso contr�rio, ele ser� classificado como "Inocente"

 * 
 */
import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Telefonou para a v�tima?");
		String resp1 = scan.next();
		
		System.out.println("Esteve no local do crime?");
		String resp2 = scan.next();
		
		System.out.println("Mora perto da v�tima?");
		String resp3 = scan.next();
		
		System.out.println("Devia para a v�tima?");
		String resp4 = scan.next();
		
		System.out.println("J� trabalhou com a v�tima?");
		String resp5 = scan.next();
		
		int cont = 0;
		
		if (resp1.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if (resp2.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if (resp3.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if (resp4.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if (resp5.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if (cont == 0) {
			System.out.println("Inocente");
		} else if (cont == 2) {
			System.out.println("Suspeita");
		} else if (cont == 3 || cont == 4 ) {
			System.out.println("C�mplice");
		} else if (cont == 5) {
			System.out.println("Assassino");
		}
	}

}
