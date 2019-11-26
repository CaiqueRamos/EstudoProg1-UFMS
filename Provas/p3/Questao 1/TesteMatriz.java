import java.util.Scanner;
public class TesteMatriz
{
	public static void main(String []args)
	{
		Scanner teclado = new Scanner(System.in);
		int linhas = teclado.nextInt();
		int colunas = teclado.nextInt();
		Matriz m = new Matriz(linhas, colunas);

		m.leMatriz();
		m.imprimeMatriz();
		m.imprimeTransposta();
		m.valoresPares();
	}
}