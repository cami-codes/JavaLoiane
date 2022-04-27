package com.loiane.curso.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1; //count ou cont
		int max = 10;
		
		System.out.println("Contando até: " + max);
		
		while (i <= max) {
			System.out.println("Valor de i: " + i);
			i++; // i = i + i; ou i += 1;
			
		}
		
		System.out.println(i); // valor de 11
		
		do {
			i++;
			System.out.println("Valor de i: " + i );
		} while (i < 15);
		
		System.out.println(i); 
		
	}

}
