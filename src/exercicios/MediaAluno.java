//2. Fa�a um programa para receber o nome de um aluno e informar 2 notas, em seguida calcular 
//a m�dia do aluno e apresentar ao final a m�dia calculada e a situa��o de Aprova��o do aluno. 
//(aprovado com m�dia >= 6).

package exercicios;

import java.util.Scanner;

public class MediaAluno {
	
	public static void main(String[] args) {

		double calculaMedia = 0.0;
		Scanner entradaDoConsole = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno:");
		String nomeAluno = entradaDoConsole.next();
		
		System.out.println("Informe a 1 nota do aluno:");
		double primeiraNotaDoAluno = entradaDoConsole.nextInt();
		
		System.out.println("Informe a 2 nota do aluno:");
		double segundaNotaDoAluno = entradaDoConsole.nextInt();
		
		calculaMedia = (primeiraNotaDoAluno + segundaNotaDoAluno)/2;
		
		if (calculaMedia >= 6) {
			System.out.println("O aluno " + nomeAluno + ", foi aprovado com m�dia "+ calculaMedia);			
		}
		else {
			System.out.println("O aluno " + nomeAluno + ", foi reprovado com m�dia "+ calculaMedia);	
		}		
		entradaDoConsole.close();		
	}
}
