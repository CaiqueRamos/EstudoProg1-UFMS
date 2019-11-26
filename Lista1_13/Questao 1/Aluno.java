public class Aluno
{
	private String nome;
	private int rga;
	private String curso;

	public Aluno(String nome, int rga, String curso)
	{
		
		setNome(nome);
		setRga(rga);
		setCurso(curso);
	}
	

	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public void setRga(int rga)
	{
		this.rga = rga;
	}
	public void setCurso(String curso)
	{
		this.curso = curso;
	}
	public String getNome()
	{
		return nome;
	}
	public int getRga()
	{
		return rga;
	}
	public String getCurso()
	{
		return curso;
	}

	public void imprimirAluno()
	{
		System.out.println(getNome());
		System.out.println(getRga());
		System.out.println(getCurso());

	}

}	