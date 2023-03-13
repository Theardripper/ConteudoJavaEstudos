package atividades;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenhait: ");
		double tempf = teclado.nextDouble();
		double tempc = (tempf - 32) / 1.8;
		
		System.out.println("A temperatura de Fahrenhait em Celsius e: " + tempc);
		teclado.close();
		
		
	}

}
