package desafio_01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CarrinhoDeCompras {

	public static void main(String[] args) {		

		String[] nomeDoProduto = { "Leite", "Ceral", "Arroz", "Atum", "Feij�o",   
								   "Azeite", "�leo", "Sab�o", "Sal", "A�ucar" };
		double[] precoDoProduto = { 4.57, 3.02, 9.43, 3.55, 6.55, 4.55, 7.33, 1.99, 3.82, 4.29 };
		int[] estoqueDoProduto = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		int[] carrinho = new int[10];
				
		int produtoInformado = 0, quantidadeInformada = 0, formaPagamento = 0;			
		String respostaContinuarCompra = "", novaCompra = "";
		double totalCarrinho = 0.0, descontoNoPagamento = 0.0;
		boolean continuarCompra = true;

		Scanner entradaDoConsole = new Scanner(System.in);
		DecimalFormat formatarValorBR = new DecimalFormat("#,###,##0.00");

		do {
			while (continuarCompra) {
				System.out.println("\n===================================================================");
				System.out.println("\t\t\tWIPRO STORE");
				System.out.println("===================================================================");
				System.out.println("\nC�DIGO\t\tPRODUTO\t\tQTND. PRODUTOS\t\tPRE�O UNIT.\n");
				
				for (int i = 0; i < nomeDoProduto.length; i++) {
					System.out.println((i + 1) + "\t\t" + nomeDoProduto[i] + "\t\t     " + estoqueDoProduto[i] + "\t\t\t R$  "
							+ formatarValorBR.format(precoDoProduto[i]));
				}
	
				System.out.print("\nOl�! Digite o c�digo do produto desejado: ");
				produtoInformado = entradaDoConsole.nextInt()-1;
				
				while(produtoInformado < 0 || produtoInformado >= nomeDoProduto.length 
										   || estoqueDoProduto[produtoInformado] == 0) {
					
					if(produtoInformado < 0 || produtoInformado >= nomeDoProduto.length) {
						System.out.println("Produto n�o encontrado!");
					}
					else {
						System.out.println("No momento n�o temos este produto no estoque!");
					}
					System.out.print("\nPor favor, digite o c�digo do produto desejado: ");
					produtoInformado = entradaDoConsole.nextInt()-1;
				}
				
				System.out.print("Insira a quantidade desejada do produto: ");
				quantidadeInformada = entradaDoConsole.nextInt();
				
				while(quantidadeInformada <= 0 || quantidadeInformada > estoqueDoProduto[produtoInformado]) {
					if(quantidadeInformada <= 0) {
						System.out.print("Por favor, informe uma quantidade maior que 0.\n");
					}
					else {
						System.out.print("Quantidade indispon�vel no estoque, digite novamente...\n");
					}
					System.out.print("Insira a quantidade desejada do produto: ");
					quantidadeInformada = entradaDoConsole.nextInt();
				}
										
				System.out.print("\n"+quantidadeInformada + " un. de "+ nomeDoProduto[produtoInformado]);
				System.out.print(" adicionado com sucesso no carrinho!!\n");
			
				estoqueDoProduto[produtoInformado] -= quantidadeInformada;
				carrinho[produtoInformado] += quantidadeInformada;
								
				do {
					System.out.print("\nDeseja continuar a sua compra? [S/N] ");
					respostaContinuarCompra = entradaDoConsole.next();
					
					if(respostaContinuarCompra.equalsIgnoreCase("N")) {
						continuarCompra = false;
						break;
					}
				}while(!respostaContinuarCompra.equalsIgnoreCase("S"));
			}
			
			System.out.println("\n===================================================================");
			System.out.println("\t\t\tITENS NO CARRINHO");
			System.out.println("===================================================================");
			System.out.println("Nome\t  Qtde. no carrinho\tPre�o unit.(R$)\t  Pre�o Total (R$)");
			
			for(int i = 0; i < carrinho.length;i++) {
				if(carrinho[i] > 0) {
					totalCarrinho += (precoDoProduto[i] * carrinho[i]);
					
					System.out.println(nomeDoProduto[i]  + "\t\t" + carrinho[i] + "\t\t     " 
							+ formatarValorBR.format(precoDoProduto[i]) + "\t\t "
							+ formatarValorBR.format(precoDoProduto[i] * carrinho[i]));
				}
			}
			
			System.out.println("===================================================================\n");	
			totalCarrinho = totalCarrinho+(totalCarrinho*0.09);
			
			stop: while(true) {
				
				System.out.println("O valor total da compra com imposto de 9%: R$ " + formatarValorBR.format(totalCarrinho));
				System.out.println("Op��es de Pagamento:\n");			
				System.out.println("[1] � vista em dinheiro, pix ou cart�o MASTERCARD, 20% de desconto.");
				System.out.println("[2] � vista no cart�o de cr�dito, recebe 10% de desconto.");
				System.out.println("[3] Parcelado em at� 3 vezes, pre�o normal de etiqueta sem juros.\n");
				
				System.out.print("Qual seria a forma de pagamento? ");
				formaPagamento = entradaDoConsole.nextInt();			
				
				switch (formaPagamento) {
					case 1  : descontoNoPagamento = (totalCarrinho*0.2); break stop;
					case 2  : descontoNoPagamento = (totalCarrinho*0.1); break stop;
					case 3  : break stop;
					default : 
						System.out.println("\n===================================================================");
						System.out.println("Forma de pagamento indispon�vel, digite novamente...\n");
				};
			}
			
			System.out.println("\n===================================================================");
			System.out.println("WIPRO STORE");
			System.out.println("Rua dos B�bos, n�0 - Mercadinho - LTDA");
			System.out.println("CNPJ: 01.234.567.0089-00\n");
			
			System.out.println("===================================================================");
			System.out.println("\t\t\t   NOTA FISCAL");
			System.out.println("===================================================================");
			
			System.out.println("PRODUTO\t  QTND. PRODUTO\t\tPRE�O UNIT.(R$)\t   PRE�O TOTAL (R$)");		
			for(int i = 0; i < carrinho.length;i++) {
				if(carrinho[i] > 0) {
					System.out.println(nomeDoProduto[i]  + "\t\t" + carrinho[i] + "\t\t     " + formatarValorBR.format(precoDoProduto[i]) + "\t\t "
							+ formatarValorBR.format(precoDoProduto[i] * carrinho[i]));
				}
			}
	
			System.out.println("===================================================================\n\n");
			System.out.println("VALOR TOTAL DA COMPRA COM TRIBUTOS: R$ " + formatarValorBR.format(totalCarrinho));
			if(formaPagamento == 1 || formaPagamento == 2) {
				System.out.println("DESCONTO NA COMPRA: R$ " + formatarValorBR.format(descontoNoPagamento));
				totalCarrinho -= descontoNoPagamento;
			}
			System.out.println("VALOR TOTAL A SER PAGO: R$ " + formatarValorBR.format(totalCarrinho));
			System.out.println("VALOR TRIBUT�RIO: R$ " + formatarValorBR.format(totalCarrinho*0.09));
			System.out.println("\n\n===================================================================\n\n");
			
			System.out.println("Caso deseje efetuar uma nova compra digite [S].");
			System.out.println("Para sair digite qualquer outra tecla.");
			novaCompra = entradaDoConsole.next();
			carrinho = new int[10];
			continuarCompra = true;

		}while(novaCompra.equalsIgnoreCase("S"));
		
		entradaDoConsole.close();
		System.out.println("\nObrigado por utilizar o Wipro Store!!!");
	}
}