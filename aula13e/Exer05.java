package com.loiane.curso.aula13e;
//	5. Fa�a um programa que converta metros para cent�metros.

import java.util.Scanner;

//n�o consegui fazer sozinha
public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de metros");
		double metros = scan.nextDouble();
		
		//1m = 100 cm
		double cm = metros * 100;
		
		System.out.println(metros + " m � igual a " + cm + "cm");
		

	}

}
