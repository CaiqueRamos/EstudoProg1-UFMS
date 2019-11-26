public class Retangulo
{
	private double comprimento = 1;
	private double largura = 1;

	public Retangulo(double comprimento, double largura)
	{
		this.comprimento = comprimento;
		this.largura = largura;
	}
	public double getComprimento()
	{
		return comprimento;
	}
	public double getLargura()
	{
		return largura;
	}
	public void setComprimento(double comprimento)
	{
		if(comprimento>0 && comprimento<20)
		{
			this.comprimento = comprimento;
		}
		else
		{
			System.out.println("Valores do comprimento correspondem ao periodo de 0 a 20");
		}
	}
	public void setLargura(double largura)
	{
		if(largura>0 && largura<20)
		{
			this.largura = largura;
		}
		else
		{
			System.out.println("Valores da largura correspondem ao periodo de 0 a 20");
		}
	}
	
}