package com.loiane.curso.aula15e;
/*	22. Uma fruteira está vendendo frutas com a seguinte tabela de preços:
		Até 5kg	Acima de 5kg
	Morango 	R$2,50 por kg	R$ 2,20 por kg
	Maçã	R$1,80 por kg	R$ 1,50 por kg
	Se o cliente comprar mais de 8kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
	 receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a 
	 quantidade (em Kg) de morangos e quantidade (em kg) de maçãs adquiridas e escreva o 
	 valor a ser pago pelo cliente.

 * 
 */
import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade (kg) de morangos:");
		double qtdMorango = scan.nextDouble();
		
		System.out.println("Informe a quantidade (kg) de maçãs:");
		double qtdMaca = scan.nextDouble();
		
		double precoKgMorango = 0;
		if (qtdMorango <= 5) {
			precoKgMorango = 2.5;
		} else {
			precoKgMorango = 2.2;
		}
		
		double precoKgMaca = 0;
		if (qtdMaca <= 5) {
			precoKgMaca = 1.8;
		} else {
			precoKgMaca = 1.5;
		}
		
		double precoTotalMorango = qtdMorango * precoKgMorango;
		double precoTotalMaca = qtdMaca * precoKgMaca;
		
		double precoParcial = precoKgMorango + precoKgMaca;
		double precoTotal = precoParcial;
		
		if ((qtdMorango + qtdMaca > 8) || precoParcial > 25){
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
		}
		
		System.out.println("Preço total: " + precoTotal);
	}

}
