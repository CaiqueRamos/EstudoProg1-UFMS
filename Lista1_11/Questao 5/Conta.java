public class Conta
{
	private double saldo;
	private String cpf;
	private String titular;
	private double chequeEspecial;
	private double deposito;
	private double retirada;
	private double juros;

	public Conta(double saldo, String cpf, String titular, double chequeEspecial)
	{
		this.saldo = saldo;
		this.cpf = cpf;
		this.titular = titular;
		this.chequeEspecial = chequeEspecial;
	}
	public void setDeposito(double deposito)
	{
		this.deposito = deposito + saldo;
		System.out.println("valor depositado " + deposito);
	}
	public void setRetirada(double retirada)
	{
		if (retirada < (chequeEspecial + saldo))
		{
			this.retirada = retirada - saldo;
			System.out.println("Valor retirado : "+ retirada);
		}
		else
		{
			System.out.println("Valor da retirada excede seu limite.");
		}
	}
	public void jurosMensais(double juros)
	{
		if (saldo < saldo+chequeEspecial)
		{
			this.juros = saldo*0.2;
			System.out.println("valor do juros e "+juros);
		}
	}
	public void resumoConta()
	{
		System.out.println("titular "+titular);
		System.out.println("saldo da conta "+ saldo);
	}
}












