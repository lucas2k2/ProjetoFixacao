package br.com.objetos;

public class Increment {

	public static void main(String[] args) {
		
		//demonstra o operador de pos-incremento 
		int c = 5;
		System.out.printf("c before postincrement: %d%n", c); //imprime 5
		System.out.printf(" postincrementing : %d%n", c++); //impime 5
		System.out.printf("c after postincrement: %d%n", c); //impime 6
		
		System.out.println(); //pula uma linha 
		
		//demonstra on operador de pre incremento 
		c = 5;
		System.out.printf("c before postincrement: %d%n", c); //imprime 5
		System.out.printf(" postincrementing : %d%n", ++c); //impime 5
		System.out.printf("c after postincrement: %d%n", c); //impime 6
	}
}//fim da classe Increment 
