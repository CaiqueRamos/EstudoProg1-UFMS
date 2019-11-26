import java.util.Scanner;
public class TesteConta
{
	public static void main(String []args)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Seu saldo atual: ");
		double saldo =  teclado.nextDouble();
		
		System.out.println("seu cpf");
		String cpf = teclado.next();
		
		System.out.println("primeiro nome do titular");
		String titular = teclado.next();
		
		System.out.println("seu limite de cheque Especial");
		double chequeEspecial = teclado.nextDouble();

		Conta conta = new Conta(saldo, cpf, titular, chequeEspecial);
		System.out.println("");
		System.out.println("");
		conta.resumoConta();

	}
	
}