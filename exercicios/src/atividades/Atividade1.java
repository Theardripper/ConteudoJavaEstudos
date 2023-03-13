package atividades;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual a sua idade?");
		int idade = entrada.nextInt();
		int express = 0;
		int expresss = 0;
		int meses = 12;
		int dias = 30;
		
		
		express = idade * meses;
		System.out.println("Anos = " + idade);
				System.out.println("meses = " + express);
				
				expresss = express/dias;
				System.out.println("Dias = " + expresss);
		
		
		
	
	}

}
