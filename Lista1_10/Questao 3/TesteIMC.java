import java.util.Scanner;
public class TesteIMC
{
	public static void main(String []args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual seu peso: ");
		double peso = teclado.nextDouble();
		System.out.println("Qual sua altura: ");
		double altura = teclado.nextDouble();

		System.out.println("Digite o numero referente ao seu desejo: ");
		
		System.out.println("1.Calcular IMC");
		System.out.println("2.Ver peso e altura");
		System.out.println("3.Mudar peso e altura");
		System.out.println("4.imprime IMC e a classificacao IMC");
		
		int n = teclado.nextInt();
		CalculoIMC imc = new CalculoIMC(peso, altura);
		imc.imc();
		if(n == 1)
		{
			imc.imprimeIMC();
		}
		if(n == 2)
		{
			System.out.println("Peso: ");
			imc.getPeso();
			System.out.println("altura: ");
			imc.getAltura();
		}
		if(n == 3)
		{
			System.out.println("Digite o novo peso: ");
			peso = teclado.nextDouble();
			imc.setPeso(peso);
			System.out.println("Digite o novo altura: ");
			altura = teclado.nextDouble();
			imc.setAltura(altura);
		}
		if(n == 4)
		{
			System.out.println("O IMC e classificacao: ");
			imc.imprimeIMC();
			imc.classificacaoIMC();

		}
		
	}
}