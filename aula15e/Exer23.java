package com.loiane.curso.aula15e;
/*	23. O Hipermercado Tabajara est� com uma promo��o de carnes que � imperd�vel, confira:
		At� 5kg	Acima de 5kg
	Fil� Duplo	R$4,90 por kg	R$ 5,80 por kg
	Alcatra	R$5,90 por kg	R$ 6,80 por kg
	Picanha	R$6,90 por kg	R$7,80 por kg
	Para atender todos os clientes, cada cliente poder� levar apenas um dos tipos de carne da promo��o, por�m n�o h� limites para a quantidade de carne por cliente. Se a compra for feita no cart�o Tabajara o cliente receber� ainda um desconto de 5% sobre o total da compra. 
Escreva um programa que pe�a o tipo e a quantidade de carne comprada pelo usu�rio e gere um cupom fiscal, contendo as informa��es da compra: tipo e quantidade de carne, pre�o total, tipo de pagamento, valor do desconto e valor a pagar.

 * 
 */
import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tipo da carne:");
		System.out.println("1- Fil� Duplo");
		System.out.println("2- Alcatra");
		System.out.println("3- Picanha");
		int tipo = scan.nextInt();
		
		System.out.println("Informe a quantidade em kg:");
		double qtd = scan.nextDouble();
		
		double precoKg = 0;
		
		if (tipo == 1) {
			
			System.out.println(qtd + "kg - Fil� Duplo");
			
			if (qtd < 5) {
				precoKg = 4.9;
			} else {
				precoKg = 5.8;
			}	
		} else if (tipo == 2) {
			
			System.out.println(qtd + "kg - Alcatra");
			
			if (qtd < 5) {
				precoKg = 5.9;
			} else {
				precoKg = 6.8;
			}
		} else if (tipo == 3) {
			
			System.out.println(qtd + "kg - Picanha");
			
			precoKg = 6.9;
		} else {
			precoKg = 7.8;
		}
		
		double total = qtd * precoKg;
		System.out.println(qtd + "kg * " +  precoKg + " = " + total);
		
		System.out.println("A compra ser� feita no cart�o? Se sim, digite 1.");
		int cartao = scan.nextInt();
		
		if (cartao == 1) {
			double desconto = (total / 100) * 5;
			System.out.println("Desconto de: " + desconto);
			System.out.println("Valor a pagar: " + (total - desconto));
		} else {
			System.out.println("Valor a pagar: " + total);
		}
	}

}
