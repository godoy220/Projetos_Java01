package Prova2;

import java.util.ArrayList;

public class Aluno {
    int IdAluno;
    String Nome3;
    String Dt_nasc;
    String CPF;
    int IdCurso;

    Curso curso;
    static ArrayList<Aluno> alunos = new ArrayList<>();

    public Aluno(int IdAluno, String Nome3, String Dt_nasc, String CPF, Curso curso) {
        this.IdAluno = IdAluno;
        this.Nome3 = Nome3;
        this.Dt_nasc = Dt_nasc;
        this.CPF = CPF;
        this.curso = curso;

        alunos.add(this);
    }

    public Aluno(int IdAluno, String Nome3, String Dt_nasc, String CPF, int IdCurso) {
        this.IdAluno = IdAluno;
        this.Nome3 = Nome3;
        this.Dt_nasc = Dt_nasc;
        this.CPF = CPF;
        this.IdCurso = IdCurso;

        alunos.add(this);
    }

    static void verificaid(int IdAluno) throws Exception {
        for (Aluno aluno : alunos) {
            if (aluno.IdAluno == IdAluno) {
                return;
            }
        }
        throw new Exception("Aluno não encontrado");
    }

    static Aluno buscaAluno(int IdAluno) {
        for (Aluno aluno : alunos) {
            if (aluno.IdAluno == IdAluno) {
                return aluno;
            }
        }
        return null;
    }
}
