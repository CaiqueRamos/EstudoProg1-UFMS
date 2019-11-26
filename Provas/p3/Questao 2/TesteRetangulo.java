import java.util.Scanner;
public class TesteRetangulo
{
	public static void main(String []args)
	{
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite os valores do comprimento: ");
		double comprimento = teclado.nextDouble();
		System.out.println("Digite os valores da largura: ");
		double largura = teclado.nextDouble();
		
		Retangulo r = new Retangulo(comprimento, largura);

		r.setComprimento(comprimento);	
		r.setLargura(largura);
	}
}