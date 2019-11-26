import java.util.Scanner;
public class RetanguloAsteriscos
{
	public static void main(String []args)
	{
		Scanner teclado = new Scanner(System.in);
		Retangulo retang = new Retangulo();

		int numColunas = teclado.nextInt();
		int numLinhas = teclado.nextInt();
		retang.criarRetangulo(numColunas, numLinhas);
		retang.preencherRetangulo();
	}
}