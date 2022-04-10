//1 . Escreva um programa Java que gera um número aleatório (randômico) entre 0 e 10 
//(incluindo estes dois valores) e peça ao usuúrio para adivinhá-lo. Use um laço while para 
//registrar as tentativas feitas e, a cada tentativa, d� dicas informando se o número gerado é 
//maior ou menor que a tentativa feita. Finalmente mostre a quantidade de tentativas feitas at� 
//que o número fosse acertado.

package aula_introducao.exercicios;

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
				System.out.println("você informou o valor " + valorInformado + " mais o numero que você procura é menor.\n Informe outro número." );
			}
			else if(valorInformado < valorAleatorio) {
				System.out.println("voc� informou o valor " + valorInformado + " mais o numero que você procura é maior.\n Informe outro número.");
			}
			else {
				System.out.println("\nParabêns, você acertou após " + numeroDeTentativas + " tentativas.");	
				acertou = true;
				entradaDoConsole.close();
			}
			numeroDeTentativas++;
		}		
	}
}
