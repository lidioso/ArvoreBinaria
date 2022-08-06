package ArvoreBinaria;

//Implementação da classe árvore binária, com construtor e o método insere()
public class ArvoreBinaria {
	private No raiz;

	public ArvoreBinaria() // construtor da classe Arvore Binaria
	{
		this.raiz = null; // inicia a árvore vazia
	}

	public void insere(long id, Object elemento) // método para inserção de elemento
	{
		No novoNo = new No(id, elemento, null, null);

		if (raiz == null) {
			raiz = novoNo;
		} else {
			No atual = raiz;
			No pai;
			while (true) {
				pai = atual;
				if (id < atual.getId()) { // vai inserir à esquerda
					atual = atual.getEsq();
					if (atual == null) { // pode inserir à esquerda
						pai.setEsq(novoNo);
						return;
					} // se não é nulo, vai tentar o próximo filho
				} else { // vai inserir à direita
					atual = atual.getDir();
					if (atual == null) { // pode inserir à direita
						pai.setDir(novoNo);
						return;
					}
				}
			}
		}
	} // final método insere

	//Método para contar nós à esquerda e imprimir a quantidade
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
	
	
	public void imprimeQtdNos(Count A) // impressão dos elementos da árvore
	{
		System.out.println("O número de nós a esquerda é: " + A.getX());
	} // final do método para impressão
	
	//Método para imprimir os Id's
	public void ImpId()
	{
		ImpId(this.raiz, "", 0);		
	}
	
	//Método para imprimir os Id's
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