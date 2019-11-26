public class CalculoIMC
{
	private double peso;
	private double altura;
	private double imc;
	public CalculoIMC(double peso, double altura)
	{
		this.peso = peso;
		this.altura = altura;
	}
	public double getPeso()
	{
		return peso;
	}
	public double getAltura()
	{
		return altura;
	}
	public void setPeso(double peso)
	{
		this.peso = peso;
	}
	public void setAltura(double altura)
	{
		this.altura = altura;
	}
	public double imc()
	{
	 	imc = peso/(altura*altura);
	 	return imc;
	}
	public void imprimeIMC()
	{
		imc = peso/(altura*altura);
		System.out.printf("Seu IMC e: %.2f\n", imc);
	}
	public void classificacaoIMC()
	{
		if (imc == 18.5) 
		{
			System.out.println("Baixo peso");
		}
		if (imc > 18.5 && imc <24.9) 
		{
			System.out.println("Normal");
		}
		if (imc >= 25 && imc < 29.9) 
		{
			System.out.println("Sobre Peso");
		}
		if (imc >= 30) 
		{
			System.out.println("Obesidade");
		}
	}
}