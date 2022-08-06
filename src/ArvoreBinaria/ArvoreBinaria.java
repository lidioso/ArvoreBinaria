package ArvoreBinaria;

//Implementa��o da classe �rvore bin�ria, com construtor e o m�todo insere()
public class ArvoreBinaria {
	private No raiz;

	public ArvoreBinaria() // construtor da classe Arvore Binaria
	{
		this.raiz = null; // inicia a �rvore vazia
	}

	public void insere(long id, Object elemento) // m�todo para inser��o de elemento
	{
		No novoNo = new No(id, elemento, null, null);

		if (raiz == null) {
			raiz = novoNo;
		} else {
			No atual = raiz;
			No pai;
			while (true) {
				pai = atual;
				if (id < atual.getId()) { // vai inserir � esquerda
					atual = atual.getEsq();
					if (atual == null) { // pode inserir � esquerda
						pai.setEsq(novoNo);
						return;
					} // se n�o � nulo, vai tentar o pr�ximo filho
				} else { // vai inserir � direita
					atual = atual.getDir();
					if (atual == null) { // pode inserir � direita
						pai.setDir(novoNo);
						return;
					}
				}
			}
		}
	} // final m�todo insere

	//M�todo para contar n�s � esquerda e imprimir a quantidade
	public void countNoEsq()
	{
		Count A = new Count();
		countNoEsq(this.raiz, "", A);
		imprimeQtdNos(A);		
	}
	
	private void countNoEsq(No atual, String cStep, Count A)
	{		
		int nNoStep = 0;
			
		if(cStep == "Left" && atual != null) {
			nNoStep = A.getX() + 1;
			A.setX(nNoStep);
		}
		
		if (atual != null) {
			countNoEsq(atual.getEsq(), "Left", A);
			countNoEsq(atual.getDir(), "Right", A);
		}
	}
	
	
	public void imprimeQtdNos(Count A) // impress�o dos elementos da �rvore
	{
		System.out.println("O n�mero de n�s a esquerda �: " + A.getX());
	} // final do m�todo para impress�o
	
	//M�todo para imprimir os Id's
	public void ImpId()
	{
		ImpId(this.raiz, "", 0);		
	}
	
	//M�todo para imprimir os Id's
	private void ImpId(No Atual, String Step, int Margem)
	{
				
		int tam = 1;
		String space = "";
		
		for (tam = 1; tam <= Margem; tam++) {
			space+="   ";
		}
		
		if(tam == 1) {
			space = "";
		}
		
		if(Step.isEmpty() && Atual != null) {
			System.out.println(Atual.getId());			
		}
		
		if(Step == "Left" && Atual != null) {
			System.out.println(space + Atual.getId());	
		}
		
		if(Atual == null) {
			System.out.println(space + "-");	
		}
		
		if(Step == "Right" && Atual != null) {
			System.out.println(space + Atual.getId());	
		}
		
		if (Atual != null) {
			ImpId(Atual.getEsq(), "Left", tam);
			ImpId(Atual.getDir(), "Right", tam);
		}		
	}
	
	
} // Final da classe ArvoreBinaria