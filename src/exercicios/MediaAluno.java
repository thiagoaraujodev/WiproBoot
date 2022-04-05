//2. Faça um programa para receber o nome de um aluno e informar 2 notas, em seguida calcular 
//a média do aluno e apresentar ao final a média calculada e a situação de Aprovação do aluno. 
//(aprovado com média >= 6).

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
			System.out.println("O aluno " + nomeAluno + ", foi aprovado com média "+ calculaMedia);			
		}
		else {
			System.out.println("O aluno " + nomeAluno + ", foi reprovado com média "+ calculaMedia);	
		}		
		entradaDoConsole.close();		
	}
}
