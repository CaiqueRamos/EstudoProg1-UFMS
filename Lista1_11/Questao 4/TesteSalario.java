import java.util.Scanner;
public class TesteSalario
{
	public static void main(String []args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("**********************************************");
		System.out.println("*****Calculadora de salario e descontos ******");
		System.out.println("*****Digite o salario com casas decimais******");
		System.out.println("**************ex: 1200.00*********************");
		System.out.println("**********Qual seu salario bruto?*************");
		
		float salBruto = teclado.nextFloat();
		Salario s = new Salario(salBruto);

		
		System.out.println("Oque voce deseja saber referente a seu salario: ");
		System.out.println("digite 1. Caso queira ver valor a ser cobrado do inss");
		System.out.println("digite 2. Caso queria ver valor a ser cobrado do imposto de renda");
		System.out.println("digite 3. Caso queria ver valor do salario Liquido");

		int opcao = teclado.nextInt();
		if(opcao == 1)
		{
			s.inss();
		}
		if(opcao == 2)
		{
			s.impostoRenda();
		}
		if(opcao == 3)
		{
			s.salLiquido();
		}	
	}
}