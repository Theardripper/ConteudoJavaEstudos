package atividades;

import java.util.Scanner;

public class Desafio6 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o dia da semana");
		
		String dia = teclado.next();
		
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("numero 1");
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("numero 2");	
		} else if (dia.equalsIgnoreCase("terca")) {
			System.out.println("numero 3");
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("numero 4");
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("numero 5");
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("numero 6");
		} 
	  
		else if (dia.equalsIgnoreCase("sabado")) {
			System.out.println("numero 7");
		}
		
	
		
		teclado.close();
	}

}
