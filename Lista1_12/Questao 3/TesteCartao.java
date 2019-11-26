import java.util.Scanner;
public class TesteCartao
{
	public static void main(String []args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nome do titular: ");
		String n = teclado.next();
		Cartao c = new Cartao();
		
		System.out.print(" Cartao pertence a: :");
		c.terNome(n);


	}
}