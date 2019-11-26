public class Turma
{
	private int semestre;
	private Aluno aluno[];
	private int vagasTurma = 0;

	public Turma(int semestre)
	{
		this.semestre = semestre;
		aluno = new Aluno[10];
	}
	public void adicionarAluno(Aluno novoAluno)
	{
		aluno[vagasTurma] = novoAluno;
		vagasTurma++;
		System.out.println("Aluno foi adicionado!.");
	}
	public void removerAluno()
	{
		if (vagasTurma > 0)
			{

				aluno[vagasTurma] = null;
				vagasTurma--;
				System.out.println("Aluno removido");	
			}
			else
			{
				System.out.println("A turma nao possui alunos");
			}
	}
}