package com.loiane.curso.aula15e;
/* 	10. Fa�a um programa que pergunte em que turno voc� estuda. Pe�a para digitar 
 * M- Matutino, V- Vespertino ou N- Noturno. 
 * Imprima a mensagem "Bom dia!", "Boa tarde!" ou "Boa noite!" ou "Valor inv�lido", 
 * conforme o caso.
 */

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Em qual turno voc� estuda? (M- Matutino/ V - Vespertino/ N -Noturno)");
		String turno = scan.next();
		
		if (turno.equalsIgnoreCase("M")) {
			System.out.println("Bom dia!");
		}else if (turno.equalsIgnoreCase("V")){
			System.out.println("Boa tarde!");
		}else if (turno.equalsIgnoreCase("N")) {
			System.out.println("Boa noite!");
		}else {
			System.out.println("Turno inv�lido");
		}
	}

}
