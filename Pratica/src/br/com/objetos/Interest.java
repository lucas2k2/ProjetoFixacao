package br.com.objetos;

public class Interest {

	public static void main(String[] args) {
		double amount; //quantia em deposito ao fim de cada ano
		double principal = 1000.0; //quantidade  inicial antes dos juros
		double rate = 0.05; //taxa de juros 
		
		//exibe cabeçalhos 
		System.out.printf("5s%20s %n" ,"Year" ,"Amount on deposit");
		
		//calcula quantidade dse deposito para cada um dos dez anos 
		for (int year = 1; year <= 10; ++year)
		{
			
			//calcula nova quantidade durante ano especificado
			amount = principal * Math.pow(1.0 + rate, year);
			
			//exibe o ano e a quantidade
			System.out.printf("%4d%,20.2f%n", year, amount );
		}

	}

}//fim da classe Interest
