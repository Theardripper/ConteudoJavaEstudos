package fundamentos;

import java.util.Scanner;

public class WhileIndertiminado {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("Sair")) {
			System.out.println("Voce diz: ");
			valor = teclado.nextLine();
		}
	
		
		
		
		teclado.close();
	}

}
