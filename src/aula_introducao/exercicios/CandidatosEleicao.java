//3. Faça um programa para receber os nomes de 4 candidatos a líder de uma turma, em seguida
//receber os votos dos alunos existentes na sala, e ao final mostrar o total de votos de cada
//candidato e ainda o candidato vencedor da eleição.

package aula_introducao.exercicios;

import java.util.Scanner;

public class CandidatosEleicao {

	public static void main(String[] args) {

		Scanner entradaDoConsole = new Scanner(System.in);
		String[] nomeDosCandidatos = new String[4];
		int[] TotalDeVotosDosCandidatos = {0,0,0,0};
		int numeroDoVoto = 0, candidatoComMaiorVoto = 0;
		boolean desejaVotar = true;
		boolean houveEmpate = false;

		for (int i = 0; i < 4; i++) {
			System.out.println("Digite o nome do " + (i + 1) + " candidato a lider de turma: ");
			nomeDosCandidatos[i] = entradaDoConsole.next();
		}

		while (desejaVotar) {

			System.out.println("\nPara votar em " + nomeDosCandidatos[0].toString() + " digite: 1");
			System.out.println("Para votar em " + nomeDosCandidatos[1].toString() + " digite: 2");
			System.out.println("Para votar em " + nomeDosCandidatos[2].toString() + " digite: 3");
			System.out.println("Para votar em " + nomeDosCandidatos[3].toString() + " digite: 4");	
			System.out.println("Para encerrar a votação digite: 0\n");
			
			numeroDoVoto = entradaDoConsole.nextInt();
			
			if(numeroDoVoto >= 1 && numeroDoVoto <= 4) {
				TotalDeVotosDosCandidatos[numeroDoVoto-1] += 1;
			}
			else if(numeroDoVoto == 0) {
				desejaVotar = false;
			}
			else {
				System.out.println("Por favor, informe um numero válido.\n");
			}			
		}	
		
		System.out.println("\nO total de votos do candidato "+ nomeDosCandidatos[0].toString() + " foi: "+ TotalDeVotosDosCandidatos[0] );
		System.out.println("O total de votos do candidato "+ nomeDosCandidatos[1].toString() + " foi: "+ TotalDeVotosDosCandidatos[1] );
		System.out.println("O total de votos do candidato "+ nomeDosCandidatos[2].toString() + " foi: "+ TotalDeVotosDosCandidatos[2] );
		System.out.println("O total de votos do candidato "+ nomeDosCandidatos[3].toString() + " foi: "+ TotalDeVotosDosCandidatos[3] );
		
		for(int i = 1; i < nomeDosCandidatos.length; i++) {
			if(TotalDeVotosDosCandidatos[i] > TotalDeVotosDosCandidatos[candidatoComMaiorVoto]) {
				candidatoComMaiorVoto = TotalDeVotosDosCandidatos[i];
				houveEmpate = false;
			}
			else if(TotalDeVotosDosCandidatos[i] == TotalDeVotosDosCandidatos[candidatoComMaiorVoto]) {
				houveEmpate = true;
			}
		}
		if(houveEmpate) {
			System.out.println("\nNão houve vencedor, votação empada!");
		}
		else {
			System.out.println("\nO candidato vencedor foi " + nomeDosCandidatos[candidatoComMaiorVoto].toString());
		}		
		entradaDoConsole.close();	
	}
}