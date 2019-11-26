public class Aluno
{
	private String nome;
	private int rga;
	private String curso;

	public Aluno(String nome, int rga, String curso)
	{
		this.nome = nome;
		this.rga = rga;
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
		System.out.println("Nome: "+getNome());
		System.out.println("Rga: "+getRga());
		System.out.println("Curso: "+getCurso());
	}
}