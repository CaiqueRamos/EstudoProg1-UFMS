public class Retangulo
{
	private int comprimento;
	private int largura;

	public Retangulo(int comprimento, int largura)
	{
		this.comprimento = comprimento;
		this.largura = largura;
	}
	public int perimetro()
	{
		int perimetro = ((2*comprimento)+(2*largura));
		return perimetro;

	}
	public int area()
	{
		int area = (comprimento*largura);
		return area;
	}
	public void setComprimento(int comprimento)
	{	
		if(comprimento>0 && comprimento<20)
		{
		this.comprimento = comprimento;
		}
		else
		{
			System.out.println("valor nao permitido");
		}
	}
	public void setLargura(int largura)
	{
		if(largura>0 && largura<20)
		{
		this.largura= largura;
		}
		else
		{
			System.out.println("valor nao permitido");
		}
	}
	public int getComprimento()
	{
		return this.comprimento;
	}
	public int getLargura()
	{
		return this.largura;
	}
}
