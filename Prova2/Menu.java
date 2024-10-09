package Prova2;
/*
# Construção da Aplicação

Deverá ser criado um arquivo principal para gerenciamento das informações dos objetos,
 este arquivo deverá ser estruturado com um menu com as seguintes opções:
* 1 - Cadastrar Professor
* 2 - Cadastrar Curso
* 3 - Cadastrar Aluno
* 4 - Listar Professores
* 5 - Listar Cursos
* 6 - Listar Alunos
*/

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opt = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Opções: ");
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Cadastrar Curso");
            System.out.println("3 - Cadastrar Aluno");
            System.out.println("4 - Listar Professores");
            System.out.println("5 - Listar Cursos");
            System.out.println("6 - Listar Alunos");
            System.out.println("7 - Sair");

            try {
                opt = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Opção inválida");
                scanner.nextLine();
                continue;
            }

            String Nome, Departamento, Nome2, Dt_nasc, CPF, Nome3;
            int IdProfessor = 0, IdCurso = 0, Carga_hora, IdAluno;

            switch (opt) {
                case 1:
                try {
                    // CADASTRAR PROFESSOR
                    System.out.println("Digite o id do professor: ");
                     IdProfessor = scanner.nextInt();
                    System.out.println("Digite o nome: ");
                     Nome = scanner.next();
                    System.out.println("Digite o departamento: ");
                     Departamento = scanner.next();
                    new Professor(IdProfessor, Nome, Departamento, IdCurso);
                } catch (Exception e) {
                    System.out.println("Erro ao cadastrar professor");
                }
                    break;

                case 2:
                try{
                    // CADASTRAR CURSO
                    System.out.println("Digite o id do curso: ");
                     IdCurso = scanner.nextInt();
                    System.out.println("Digite o nome: ");
                     Nome2 = scanner.next();
                    System.out.println("Digite a carga horaria: ");
                     Carga_hora = scanner.nextInt();
                    System.out.println("Digite o id do professor deste curso: ");
                     IdProfessor = scanner.nextInt();
                    Professor.verificaId(IdProfessor);
                    Professor.buscaProfessor(IdProfessor);
                    new Curso(IdCurso, Nome2, Carga_hora, IdProfessor);
                } catch (Exception e) {
                    System.out.println("Erro ao cadastrar curso");
                }
                    break;

                case 3:
                try{
                    // CADASTRAR ALUNO
                    System.out.println("Digite o id do Aluno: ");
                     IdAluno = scanner.nextInt();
                    System.out.println("Digite o nome do aluno: ");
                     Nome3 = scanner.next();
                    System.out.println("Digite a data de nascimento do aluno: ");
                     Dt_nasc = scanner.next();
                    System.out.println("Digite o CPF do aluno: ");
                     CPF = scanner.next();
                    System.out.println("Digite qual é o id do curso que este aluno está inscrito: ");
                     IdCurso = scanner.nextInt();
                    Curso.verificaId(IdCurso);
                    Curso.buscaCurso(IdCurso);
                    new Aluno(IdAluno, Nome3, Dt_nasc, CPF, IdCurso);
                } catch (Exception e) {
                    System.out.println("Erro ao cadastrar aluno");
                }
                    break;

                case 4:
                    // LISTAR PROFESSOR
                    System.out.println("Listar professor");
                    if (Professor.professores.isEmpty()){
                        System.out.println("nenhum professor cadastrado");
                        return;
                    }
                    for (Professor professor : Professor.professores){
                        System.out.println("Id: " + professor.IdProfessor + " - Nome: " + professor.Nome + " - Departamrnto: " 
                        + professor.Departamento + " - Curso: " + Professor.CursosLecionados(professor.IdProfessor) + " - Qtd de alunos: " + Curso.contarAlunosPorCurso(professor.IdProfessor));
                    }
                    break;

                case 5:
                    // LISTAR CURSOS
                    System.out.println("Listar cursos");
                    if (Curso.cursos.isEmpty()){
                        System.out.println("nenhum curso cadastrado");
                        return;
                    }
                    for(Curso curso : Curso.cursos){
                        System.out.println("Cursos: " + curso.Nome2 + " - Id: " + curso.IdCurso + " - Carga horaria: " + curso.Carga_hora + " - Professor: " + Curso.professoresCurso(curso.IdProfessor) + " - Qtd alunos: " + Curso.contarAlunosPorCurso(curso.IdCurso));
                    }
                    break;

                case 6:
                    // LISTAR ALUNOS
                    System.out.println("Listar alunos");
                    if (Aluno.alunos.isEmpty()){
                        System.out.println("nenhum aluno cadastrado");
                        return;
                    }
                    for(Aluno aluno : Aluno.alunos){
                        System.out.println("Nome aluno: " + aluno.Nome3 + " - Id: " + aluno.IdAluno + " - Data de nascimento: " + aluno.Dt_nasc + " - CPF: " + aluno.CPF + " - Curso: " + Curso.buscaCurso(aluno.IdCurso).Nome2);
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
            }

        } while (opt != 7);

        scanner.close();
    }
}
