package com.loiane.curso.aula15e;
/*	21. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
		○ Álcool:
		a. Até 20 litros, desconto de 3% por litro
		b. Acima de 20 litros, desconto de 5% por litro
	

		○ Gasolina:
		a. Até 20 litros, desconto de 4% por litro
		b. Acima de 20 litros, desconto de 6% por litro.
Escreva um  algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A- álcool, G- gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 e o preço do litro do álcool é R$ 1,90.

 * 
 */
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
