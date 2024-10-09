import java.util.ArrayList;

public class Tutor {

    int id;
    String nome;
    String telefone;
    String email;

    static ArrayList<Tutor> tutores = new ArrayList<>();

    public Tutor(int id, String nome, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;

        tutores.add(this);
    }

    static void verificaId(int id) throws Exception {
        for (Tutor tutor : tutores) {
            if (tutor.id == id) {
                return;
            }
        }
        throw new Exception("Tutor não encontrado");
    }

    static Tutor buscaTutor(int id) {
        for (Tutor tutor : tutores) {
            if (tutor.id == id) {
                return tutor;
            }
        }
        return null;
    }
    
}
