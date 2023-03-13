package atividades;

import java.util.Scanner;

public class Atividade7 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		double num = teclado.nextDouble();
		
		double quad = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		
		System.out.println("O numero ao quadrado: " + quad);
		System.out.println("O numero ao cubo: " + cubo );
		
		teclado.close();
	}

}
