package ArvoreBinaria;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		ArvoreBinaria a = new ArvoreBinaria(); // cria a �rvore bin�ria

		// Declara as vari�veis utilizadas na main
		Scanner ler = new Scanner(System.in);
		int nQtdNum, cont;
		String[] vetor= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T"};

		// Obtem a quantidade do vetor
		System.out.println("Quantos n�meros deseja informar?*(Limitado a 20)");
		nQtdNum = ler.nextInt();
		
		//Limita a 20 o n�mero de inser��es
		if(nQtdNum > 20) {
			nQtdNum = 20;
		}
		
		int nTot[] = new int[nQtdNum];

		// Solicita o preenchimento do vetor ao usu�rio
		for (cont = 0; cont < nTot.length; cont++) {
			System.out.println("Informe o n�mero da posi��o " + Integer.toString(cont + 1) + " do �rvore bin�ria.");
			//nTot[cont] = ler.nextInt();
			a.insere(ler.nextInt(), vetor[cont]);
		}
		
		//Conta e Imprime os N�s a esquerda
		a.countNoEsq();
		
		//Imprime os Id's com recuo de margem
		a.ImpId();
		
		ler.close();
	}
}