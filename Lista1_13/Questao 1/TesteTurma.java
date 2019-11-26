public class TesteTurma
{
 	public static void main(String []args)
 	{
 		Turma t = new Turma(1);
 		Aluno a = new Aluno("caique", 123, "adm");
 		Aluno b = new Aluno("Danadara", 12332, "adm");
 		Aluno c = new Aluno("rainhaDotrova", 123213, "adm");
 		Aluno d = new Aluno("GustavinLevaTora", 125413, "adm");

 		t.adicionaAluno(a);
 		t.adicionaAluno(b);
 		t.adicionaAluno(c);
 		t.adicionaAluno(d);
 		t.imprimirTurma();
 	}
}