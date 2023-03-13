package atividades;

import java.util.Scanner;

public class Atividade9 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Velocidade da rua permitida é 30 KM/h. ");
		System.out.println("Digite a velocidade do seu automovel: ");
		double velo = teclado.nextDouble();
		
		if(velo = 40.0) {
			System.out.println("A multa é de 50 Reais ");
		} else if(velo) {
			System.out.println("A multa é de 100 Reais");
		}
		

		
		teclado.close();
	}

}
