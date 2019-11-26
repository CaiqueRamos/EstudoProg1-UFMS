import java.util.Scanner;
public class PessoaComFome
{
	public static void main(String []args)
	{
		Scanner teclado = new Scanner (System.in);
		Pessoa pes = new Pessoa();	

		System.out.println("Seu nome: ");
		String pessoa = teclado.next();
		pes.setPessoa(pessoa);
		
		System.out.println("Oque voce esta comendo: ");
		String comendo = teclado.next();
		pes.setComendo(comendo);
		
		System.out.println("Qual o valor da comida: ");
		int valorComida = teclado.nextInt();
		pes.setValorComida(valorComida);

		pes.comer();

	}

}