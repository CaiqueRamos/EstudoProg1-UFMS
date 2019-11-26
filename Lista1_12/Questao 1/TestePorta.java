import java.util.Scanner;
public class TestePorta
	{
	
	public static void main(String []args)
		{
		Scanner teclado = new Scanner(System.in);
		Porta porta = new Porta();
		
		System.out.println("porta foi criada!");
		porta.abre();
		System.out.println("a porta foi aberta!");
		porta.fecha();
		System.out.println("a porta foi fechada!");
		
		System.out.println("Qual cor sera usada na porta?");
		String s = teclado.nextLine();
		porta.pintar(s);
		System.out.println("A porta foi pintada de "+s);
		
		System.out.println("Qual a dimensao x: ");
		float x = teclado.nextFloat();
		porta.setdimensaoX(x);
		System.out.println("Qual a dimensao y: ");
		float y = teclado.nextFloat();
		porta.setdimensaoy(y);
		System.out.println("Qual a dimensao z: ");
		float z = teclado.nextFloat();
		porta.setdimensaoz(z);
		
		porta.fecha();
		porta.abre();
		if(porta.estaAberta() == true)
		{
			System.out.println("A porta esta aberta!	");
		}else
		{
			System.out.println("A porta esta fechada!");
		}
	}
}
	