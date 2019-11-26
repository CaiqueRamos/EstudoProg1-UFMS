import java.util.Scanner;
public class Matriz
{
	public static void main(String []args)
	{
		Scanner teclado = new Scanner(System.in);
		
		//valores de linha e coluna da matriz
		System.out.println("Digite um valor referente a linha e coluna respectivamente: ");
		int m = teclado.nextInt();
		int n = teclado.nextInt();
		int a[][] = new int[m][n];
		int aux = 0;

		//le todos elementos de uma matriz
		System.out.println("Digite todos os valores da matriz");
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
				{
					a[i][j] = teclado.nextInt();
				}	
		}
		
		System.out.println("Escolha uma linha para efetuar uma acao \nlembrando que a primeira linha e a zero: ");
		int efetuarAcao = teclado.nextInt();

		System.out.println("Digite 1 para somar os valores dessa linha \nDigite 2 para multiplicar os valores dessa linha: ");
		int opcao = teclado.nextInt();

		//efetua a escolha entre somar ou multiplicar 
		if(opcao == 1)
		{
			for (int i=0;i<a.length;i++)
			{
				for (int j=0;j<a.length;j++)
					{
						if (i == efetuarAcao)
							{
								aux += a[i][j];
							}	
						}
			}System.out.println("A soma da linha "+efetuarAcao+" = "+aux);
		}
		else if(opcao == 2)
		{
			for (int i=0;i<a.length;i++)
			{
				for (int j=0;j<a.length;j++)
					{
						if (i == efetuarAcao)
							{
								//aux recebe i e j que é multiplicado pelo i e a proxima posicao do j
								aux = a[i][j]*a[i][++j];
							}
					}
			}
			System.out.println("A multiplicacao da linha "+efetuarAcao+" = "+aux);
		}
		
		//verifica colunas e linhas nulas
		//auxiliares para contagem de linhas e colunas nulas
		int lnulo = 0;
		int cnulo = 0;
		for (int i=0;i<a.length;i++)
			{
				int nulo = 0;
				for (int j=0;j<a.length;j++)
					{
						if(a[i][j] == 0)
						{
							nulo++;
						}
					}
					if(nulo == m)
					{
						lnulo++;
					}
			}
			System.out.println("Possui "+lnulo+" linha(s) nulas");
			for (int i=0;i<a.length;i++)
			{
				int nulo = 0;
				for (int j=0;j<a.length;j++)
					{
						if(a[j][i] == 0)
						{
							nulo++;
						}
					}
					if(nulo == n)
					{
						cnulo++;
					}
			}
			System.out.println("Possui "+cnulo+" coluna(s) nulas");
	}
}
