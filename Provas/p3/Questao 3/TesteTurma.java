public class TesteTurma
{
	public static void main(String []args)
	{
		Aluno a = new Aluno("caique", 123, "tads");
		Aluno a1 = new Aluno("felipe", 1223, "si");
		Turma t = new Turma(1);

		t.adicionarAluno(a);
		t.removerAluno();
		t.adicionarAluno(a1);
		a.imprimirAluno();

	}
}