public class Salario 
{
	private double salBruto;
	private double inss = 10;
	private double salLiquido;
	
	
	public Salario(double salBruto)
	{
		this.salBruto = salBruto;
	}
	public double inss()
	{
	this.inss = this.salBruto * 0.10;
		if (inss > 150 )
		{
			System.out.println("Valor a ser descontado e 150 de inss");
			return 150;
		}
		else if(inss < 150)
		{
			System.out.println(" valor a ser descontado e "+ inss+ " de inss");
			return inss;
		}
		return 0;
	}
	public double impostoRenda()
	{
		if (salBruto < 1057.50)
		{
			System.out.println("nao sera cobrado imposto de renda");
			return 0;
		}
		else if(salBruto > 1057.50 && salBruto < 2115.00)
		{
			this.salBruto = this.salBruto * 0.15;
			System.out.println("O valor a ser cobrado de imposto de renda e "+salBruto);
			return salBruto;
		}
		else if(salBruto > 2115.00)
		{
			this.salBruto = this.salBruto *0.275;
			System.out.printf("O valor a ser cobrado sera %f.2",salBruto);
			return salBruto;
		}
		return inss;

	}
	public void salLiquido()
	{
		salLiquido =  salBruto - (impostoRenda() + inss());
		System.out.println("O valor do salario liquido e "+ salLiquido);	
	}

}
