package Prova2;

import java.util.ArrayList;

public class Professor {

    int IdProfessor;
    String Nome;
    String Departamento;
    int IdCurso;

    Curso curso;
    static ArrayList<Professor> professores = new ArrayList<>();

    public Professor(int IdProfessor, String Nome, String Departamento, Curso curso) {
        this.IdProfessor = IdProfessor;
        this.Nome = Nome;
        this.Departamento = Departamento;
        this.curso = curso;
        professores.add(this);
    }

    public Professor(int IdProfessor, String Nome, String Departamento, int IdCurso) {
        this.IdProfessor = IdProfessor;
        this.Nome = Nome;
        this.Departamento = Departamento;
        this.IdCurso = IdCurso;

        professores.add(this);
    }

    static void verificaId(int IdProfessor) throws Exception {
        for (Professor professor : professores) {
            if (professor.IdProfessor == IdProfessor) {
                return;
            }
        }
        throw new Exception("Professor não encontrado");
    }

    static Professor buscaProfessor(int IdProfessor) {
        for (Professor professor : professores) {
            if (professor.IdProfessor == IdProfessor) {
                return professor;
            }
        }
        return null;
    }

    static String cursoProfessores(int IdProfessor) {
        String cursos = "";
        for (Curso curso : Curso.cursos) {
            if (curso.IdProfessor == IdProfessor) {
                cursos += curso.Nome2 + "\n";
            }
        }
        return cursos;
    }
}
