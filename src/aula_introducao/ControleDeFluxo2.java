package aula_introducao;

public class ControleDeFluxo2 {

	public static void main(String[] args) {

//		for(expressão1; expressão2; expressão3) {
//			bloco de instruções;
//		}

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		String[] nomes = {"Ana", "Joana", "Jenifer", "Maria"};
		for (String i : nomes) {
		  System.out.println(i);
		}

//		while (condição) {
//			bloco de instruções;
//		}
		
		int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}

//		do {
//			bloco de instruções;
//		}
//		while (condição);
		
		int j = 1;
		do{
			System.out.println(j);
		}while(j !=0 );
	}

}

