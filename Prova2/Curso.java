package Prova2;

import java.util.ArrayList;

public class Curso {
    int IdCurso;
    String Nome2;
    int Carga_hora;
    int IdProfessor;

    Professor professor;
    static ArrayList<Curso> cursos = new ArrayList<>();

    public Curso(int IdCurso, String Nome2, int Carga_hora, Professor professor) {
        this.IdCurso = IdCurso;
        this.Nome2 = Nome2;
        this.Carga_hora = Carga_hora;
        this.professor = professor;
        cursos.add(this);
    }
    public Curso(int IdCurso, String Nome2, int Carga_hora, int IdProfessor) {
        this.IdCurso = IdCurso;
        this.Nome2 = Nome2;
        this.Carga_hora = Carga_hora;
        this.IdProfessor = IdProfessor;

        cursos.add(this);
    }

    static void verificaId(int IdCurso) throws Exception {
        for (Curso curso : cursos) {
            if (curso.IdCurso == IdCurso) {
                return;
            }
        }
        throw new Exception("Curso não encontrado");
    }

    static Curso buscaCurso(int IdCurso) {
        for (Curso curso : cursos) {
            if (curso.IdCurso == IdCurso) {
                return curso;
            }
        }
        return null;
    }

    static int contarAlunosPorCurso(int IdCurso) {
        int cont = 0;
        for (Aluno aluno : Aluno.alunos) {
            if (aluno.IdCurso == IdCurso) {
                cont++;
            }
        }
        return cont;
    } 

    static String professoresCurso(int IdCurso) {
        String professores = "";
        for (Professor professor : Professor.professores) {
            if (professor.IdCurso == IdCurso) {
                professores += professor.Nome + "\n";
            }
        }
        return professores;
    }
}