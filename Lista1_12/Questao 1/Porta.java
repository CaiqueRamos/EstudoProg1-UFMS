public class Porta
{
	private boolean aberta;
	private String cor;
	private double dimensaoX;
	private double dimensaoy;
	private double dimensaoz;

	public boolean abre()
	{
		aberta = true;
		return true;
	}
	
	public boolean fecha()
	{	
		aberta = false;
		return false;
	}
	public void pintar(String s)
	{
		this.cor = s;
	}
	
	public boolean estaAberta()
	{
		if (this.aberta == true){
			return true;
		}else{
			return false;
		}
	}
	
	public void setdimensaoX(double x)
	{
		x = dimensaoX;
	}
	public void setdimensaoy(double y)
	{
		y = dimensaoy;
	}
	public void setdimensaoz(double z)
	{
		z = dimensaoz;
	}
}