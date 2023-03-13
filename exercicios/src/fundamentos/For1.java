package fundamentos;

public class For1 {
	
	public static void main(String[] args) {
		
		
		//Maneira correta de usar o For separada por três partes:
		// 1 parte = declaração de variável
		// 2 parte = A expressão, retornando True ou false
		// 3 parte = A manipulação da variável;
        for(int contador = 1; contador <= 10; contador++){
        	System.out.printf("i = %d\n", contador); 
        }
	   // Outra maneira de usar o FOR
		int x = 2;
		for(;x < 10;) {
			System.out.println("x = " + x);
			x++;
		}
		//Laço infinito
	//	for(;;) {
		//	System.out.println("Fim!");
	//	}
	}

}
