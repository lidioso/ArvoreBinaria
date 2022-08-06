package ArvoreBinaria;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		ArvoreBinaria a = new ArvoreBinaria(); // cria a árvore binária

		// Declara as variáveis utilizadas na main
		Scanner ler = new Scanner(System.in);
		int nQtdNum, cont;
		String[] vetor= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T"};

		// Obtem a quantidade do vetor
		System.out.println("Quantos números deseja informar?*(Limitado a 20)");
		nQtdNum = ler.nextInt();
		
		//Limita a 20 o número de inserções
		if(nQtdNum > 20) {
			nQtdNum = 20;
		}
		
		int nTot[] = new int[nQtdNum];

		// Solicita o preenchimento do vetor ao usuário
		for (cont = 0; cont < nTot.length; cont++) {
			System.out.println("Informe o número da posição " + Integer.toString(cont + 1) + " do árvore binária.");
			//nTot[cont] = ler.nextInt();
			a.insere(ler.nextInt(), vetor[cont]);
		}
		
		//Conta e Imprime os Nós a esquerda
		a.countNoEsq();
		
		//Imprime os Id's com recuo de margem
		a.ImpId();
		
		ler.close();
	}
}