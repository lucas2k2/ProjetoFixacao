package br.com.objetos;

public class BreakTest {

	public static void main(String[] args) {
		int count;//variavel de controle tambem utiliza da depois que loop terminar 
		 for(count = 1; count <= 10; count++) //faz o loop 10 vezes
		 {
			 if (count == 5 )
				 break; //termina o loop se a contagem for 5 
			 
			 System.out.printf("%d " , count);
		 }
		 
		 System.out.printf("%nBroke out of loop at count = %d%n", count );

	}

}//fim da classe BreakTest
