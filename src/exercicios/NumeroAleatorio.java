//1 . Escreva um programa Java que gera um n�mero aleat�rio (rand�mico) entre 0 e 10 
//(incluindo estes dois valores) e pe�a ao usu�rio para adivinh�-lo. Use um la�o while para 
//registrar as tentativas feitas e, a cada tentativa, d� dicas informando se o n�mero gerado � 
//maior ou menor que a tentativa feita. Finalmente mostre a quantidade de tentativas feitas at� 
//que o n�mero fosse acertado.

package exercicios;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
	
	public static void main(String[] args) {
		
		boolean acertou = false;
		int valorAleatorio = 0, valorInformado = 0, numeroDeTentativas = 1;
		Random random = new Random();
		Scanner entradaDoConsole = new Scanner(System.in);		
		valorAleatorio = random.nextInt(10);		
			
		System.out.println("Informe um numero entre 0 e 10 e tente acertar o numero gerado pelo sistema:");
		
		while(!acertou) {
			valorInformado = entradaDoConsole.nextInt();
			
			if(valorInformado > valorAleatorio) {
				System.out.println("voc� informou o valor " + valorInformado + " mais o numero que voc� procura � menor.\n Informe outro numero." );
			}
			else if(valorInformado < valorAleatorio) {
				System.out.println("voc� informou o valor " + valorInformado + " mais o numero que voc� procura � maior.\n Informe outro numero.");
			}
			else {
				System.out.println("\nParab�ns, voc� acertou ap�s " + numeroDeTentativas + " tentativas.");	
				acertou = true;
				entradaDoConsole.close();
			}
			numeroDeTentativas++;
		}		
	}
}
