package com.loiane.curso.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("O valor de i �: " + i);
		}

		// System.out.println(i);
		
		for (int i=5; i > 0; i--) {
			System.out.println("O valor de i �: " + i);
		}
		
		for (int i=0, j=10; i < j ; i++, j--) {
			System.out.println("i = " + i + " e j = " + j);
		}
		
		int count = 0;
		for (; count < 10;) {
			System.out.println("valor de count: " + count);
			count += 2;
		}
			
		// mesma coisa que:
		for (int cont=0; cont < 10; cont += 2) {
			System.out.println(cont);
		}
		
		// n�o � recomend�vel usar o comando sem {
		
		int soma = 0;
		for (int i=1; i < 5; soma += i++);
		System.out.println("Soma: " + soma);
		
	}

}
