import java.util.Scanner;
public class TesteRetangulo
{
	public static void main(String []args)
	{
		Scanner teclado = new Scanner(System.in);
		Retangulo retang = new Retangulo(5, 5);
		System.out.println("valor do perimetro e: " + retang.perimetro());
		System.out.println("valor da area e: "  + retang.area());
		
		int comprimento = teclado.nextInt();
		retang.setComprimento(comprimento);
		
		int largura = teclado.nextInt();
		retang.setLargura(largura);
		
		System.out.println("valor novo do comprimento e "+retang.getComprimento());
		System.out.println("valor novo do comprimento e "+retang.getLargura());
	}
}