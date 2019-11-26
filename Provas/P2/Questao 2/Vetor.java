import java.util.Scanner;
public class Vetor
{
	public static void main(String []args)
	{
		//declaração do tamanho do vetor
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int vet[] = new int[n];
		int posicao = 0;


		//valores do vetor
		for (int i=0;i<vet.length;i++ )
		{
			vet[i] = teclado.nextInt();
		}

		//menor valor do vetor
		int menor = vet[0];
		for (int i=0;i<vet.length;i++)
		{
			if (vet[i]<menor)
			{
				menor = vet[i];
				posicao = i;
			}
		}
		System.out.println("O menor valor: "+menor);
		System.out.println("E sua posicao e: "+ posicao);
		
		//valores menor que 10
		System.out.println("Valores menores que 10: ");
		for (int i=0;i<vet.length;i++) 
		{
			if(vet[i]<=10)	
			{
				System.out.println("A["+i+"] = "+vet[i]);
			}
		}

		}
	}