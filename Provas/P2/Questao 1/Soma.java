import java.util.Scanner;
public class Soma
{
	public static void main(String []args)
	{
		Scanner teclado = new Scanner(System.in);
		
		//declaração do tamanho da matriz
		int n = teclado.nextInt();
		double aux = 0;
	
		//laço que efetua a soma de 1/n
		for (int i=1;i<=n;i++)
		{	
			System.out.print("Soma entre 1/"+i+" e igual a: "+(double)1/i+"\n");
		}

		//laço que soma os resultados de 1 até 1/n
		for (double i=1;i<=n;i++)
		{	
			aux += 1/i;
		}
		System.out.printf("valor da soma de todos valores de 1 ate 1/"+n+" e igual a: %.2f", aux);
	}
}