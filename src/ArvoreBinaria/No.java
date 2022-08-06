package ArvoreBinaria;

public class No {

	private long id; // identificador do elemento
	private Object elemento; // armazena o elemento de cada No
	private No esq; // aponta para o filho esquerdo do n�
	private No dir; // aponta para o filho direito do n�

	public No(long id, Object elemento, No esq, No dir) // construtor classe No
	{
		this.id = id;
		this.elemento = elemento;
		this.esq = esq;
		this.dir = dir;
	}

	public void setId(long id) // m�todo para alterar o identificador do n�
	{
		this.id = id;
	}

	public long getId() // m�todo para receber o identificador do n�
	{
		return this.id;
	}

	public void setElemento(Object elemento) // m�todo para alterar o elemento
	{
		this.elemento = elemento;
	}

	public Object getElemento() // m�todo para receber o objeto contido no No
	{
		return elemento;
	}

	public void setEsq(No esq) // m�todo que altera o filho esquerdo
	{
		this.esq = esq;
	}

	public No getEsq() // m�todo que recebe o filho esquerdo do n�
	{
		return esq;
	}

	public void setDir(No dir) // m�todo que altera o filho direito
	{
		this.dir = dir;
	}

	public No getDir() // m�todo que recebe o filho direito do n�
	{
		return dir;
	}
}