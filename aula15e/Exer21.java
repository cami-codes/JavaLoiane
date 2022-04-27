package com.loiane.curso.aula15e;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o total de litros vendidos:");
		double litros = scan.nextDouble();
		
		System.out.println("Informe o tipo de combustível (G- Gasolina, A- Álcool):");
		String tipo = scan.next();
		
		double precoGas = 2.5;
		double precoAlc = 1.9;
		int percDescontos = 0;
		double total = 0;
		double totalDesc = 0;
		
		if (tipo.equalsIgnoreCase("a")) {
			
			if (litros <= 20) {
				percDescontos = 3;
			} else {
				percDescontos = 5;
			}
			
			total = litros * precoAlc;
			
		} else if (tipo.equalsIgnoreCase("g")) {
			
			if (litros <= 20) {
				percDescontos = 4;
			} else {
				percDescontos = 6;
			}
			
			total = litros * precoGas;
			
		}
		
		totalDesc = (total / 100) * percDescontos;
		
		double precoAPagar = total - totalDesc;
		
		System.out.println("Valor a ser pago:" + precoAPagar);
		System.out.println("Total de descontos: " + totalDesc);
	}

}
