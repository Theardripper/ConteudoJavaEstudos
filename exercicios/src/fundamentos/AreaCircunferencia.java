package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		// final = faz com que a variavel não mude, tornando ela uma constante
		double area = 3.4;
		final double pi = 3.14159;
		area = pi * area * area;
		System.out.println(area);
		
		System.out.println("Area = " + area + " m2");	}
	

}
