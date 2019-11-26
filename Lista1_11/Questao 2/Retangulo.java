public class Retangulo
{
	private int numColunas;
	private int numLinhas;

	public void criarRetangulo(int numColunas, int numLinhas)
	{
		this.numColunas = numColunas;
		this.numLinhas = numLinhas;
	}
	public void preencherRetangulo()
	{
		for (int i=0;i<numColunas;i++ )
		{
			for (int j=0;j<numLinhas;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
}