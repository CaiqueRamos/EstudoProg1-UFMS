public class Turma
{
	private Aluno []estudantes;
	private int semestre;
	private int quantidadeAluno;

	public Turma(int semestre)
	{
		this.quantidadeAluno = 0;
		this.semestre = semestre;
		this.estudantes = new Aluno[30];
	}

	public void adicionaAluno(Aluno novoAluno)
	{
		if (quantidadeAluno < 30) 
		{
			estudantes[quantidadeAluno] = novoAluno;
			quantidadeAluno++;
			System.out.println("aluno adicionado");
		}
		else
		{
			System.out.println("aluno nao add");
		}

	}
	public void removeAluno(Aluno novoAluno)
	{
		if (quantidadeAluno < 30) 
		{
			estudantes[quantidadeAluno] = novoAluno;
			quantidadeAluno-- ;
			System.out.println("aluno adicionado");
		}

	}
	public void imprimirTurma()
	{
		for(int i=0;i<quantidadeAluno;i++)
		{
			estudantes[i].imprimirAluno();
		}
	}
}