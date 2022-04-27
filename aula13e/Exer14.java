package com.loiane.curso.aula13e;
/* 	14. Faça um programa que peça o tamanho de um arquivo para download (em MB) e a 
 * velocidade de um link de internet (em Mbps), calcule e informe o tempo aproximado de 
 * download do arquivo usando este link (em minutos).
 */

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o tamanho do arquivo que deseja baixar: ");
		double tamArquivo = scan.nextDouble();
		
		System.out.println("Entre com a velocidade da internet: ");
		double velInternet = scan.nextDouble();
		
		double tempo = tamArquivo / velInternet;
		
		System.out.println("Tempo de download: " + tempo);

	}

}
