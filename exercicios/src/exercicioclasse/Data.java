package exercicioclasse;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	
	//criando um metodo
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

}
