public class Casa
{
	private String cor;
	private boolean porta1, porta2, porta3;

	public void pintar(String s)
	{
		cor = s;

	}
	public void fecharTodasPortas()
	{	
		porta1 = false;
		porta2 = false;
		porta3 = false;
	}
	public void abrirTodasPortas()
	{	
		porta1 = true;
		porta2 = true;
		porta3 = true;
	}
	public void setPorta1()
	{
		porta1 = false;
		System.out.println("Porta1 foi fechada");

	}
	public void quantasPortasAbertas()
	{
		int aux=0;
		if(porta1 == true)
		{
			aux++;
		}
		if(porta2 == true)
		{
			aux++;
		}
		if(porta3 == true)
		{
			aux++;
		}
		System.out.println("Existe "+aux+" portas abertas");

	}

}