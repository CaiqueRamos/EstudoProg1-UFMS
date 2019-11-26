public class Pessoa
{
	private String pessoa;
	private String comendo;
	private int valorComida;

	public void setPessoa(String pessoa)
	{
		this.pessoa = pessoa;
	}
	public void setComendo(String comendo)
	{
		this.comendo = comendo;
	}
	public void setValorComida(int valorComida)
	{
		this.valorComida = valorComida;
	}
	
	public String getPessoa()
	{
		return pessoa;
	}
	public String getComendo()
	{
		return comendo;
	}
	public int getValorComida()
	{
		return valorComida;
	}
	public void comer()
	{
		System.out.println("Meu nome e "+ getPessoa() +" Estou comendo " + getComendo() + " que e no valor de " + getValorComida());
	}

}