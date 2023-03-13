package atividades;

import java.util.Scanner;

public class Atividade8 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = teclado.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		int num3 = teclado.nextInt();
		
		int somaNum = num2 + num3;
		
		if(num1 > somaNum) {
			System.out.println("O primeiro numero é maior que a "
					+ "soma dos dois ultimos numeros");
		}else {
			System.out.println("O primeiro numero não é maior que a soma"
					+ " dos dois ultimos numeros ");
		}
		
	
	
	}

}
