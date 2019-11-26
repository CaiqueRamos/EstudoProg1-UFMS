import java.util.Scanner;
public class Matriz
{
	Scanner teclado = new Scanner(System.in);
	//linhas = m, colunas = n
	private int linhas;
	private int colunas;
	private int matriz[][];

	//construtor de linhas e colunas
	public Matriz(int linhas, int colunas)
	{
		this.linhas = linhas;
		this.colunas = colunas;
		matriz = new int[linhas][colunas];
	}

	//metodo para ler os valores das linhas
	public void leMatriz()
	{
		for (int i=0;i<linhas;i++)
		{
			for (int j=0;j<colunas;j++)
				{
					matriz[i][j] = teclado.nextInt();
				}	
		}
		System.out.println("");
	}
	//metodo para imprimir os valores das linhas
	public void imprimeMatriz()
	{
		System.out.println("Os valores da matriz sao: ");
		for (int i=0;i<linhas;i++)
		{
			for (int j=0;j<colunas;j++)
				{
					System.out.print(matriz[i][j]+" ");	
				}	
		System.out.println("");
		}
	System.out.println("");
	}

	//metodo para imprimir a transposta das linhas
	public void imprimeTransposta()
	{
		System.out.println("A transposta da matriz e: ");
		for (int i=0;i<linhas;i++)
		{
			for (int j=0;j<colunas;j++)
				{
					System.out.print(matriz[j][i]+" ");	
				}	
		System.out.println("");
		}
	}

	//varifica os valores pares
	public void valoresPares()
	{
		System.out.println("Os valores pares sao ");
		for (int i=0;i<linhas;i++)
		{
			for (int j=0;j<colunas;j++)
				{
					if (matriz[i][j]%2 == 0 && matriz[i][j]!=0)
						{
							System.out.print(matriz[i][j]+" ");
						}	
				}	
		}
	}
	int aux=0;
	int lnula=0;
	int cnula=0;
	public void verificaNulos()
	{
		//verifica linhas nulas
		for (int i=0;i<linhas;i++)
		{
			aux = 0;
			for (int j=0;j<colunas;j++)
				{
					
					if(matriz[i][j] == 0)
					{
						aux++;
					}	
				}
				if(aux == linhas)
				{
					lnula++;
				}
		}
		System.out.println("Existem "+lnula+" linhas nulas");
		for (int i=0;i<linhas;i++)
		{
			aux = 0;
			for (int j=0;j<colunas;j++)
				{
					
					if(matriz[j][i] == 0)
					{
						aux++;
					}	
				}
				if(aux == colunas)
				{
					cnula++;
				}
		}
		System.out.println("Existem "+cnula+" colunas nulas");
	}
}

