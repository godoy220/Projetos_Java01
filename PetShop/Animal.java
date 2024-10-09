import java.util.ArrayList;

public class Animal {
    
    int id;
    String nome;
    String raca;
    double peso;
    int idTutor;
    int idCategoria;

    Tutor tutor;
    Categoria categoria;

    static ArrayList<Animal> animais = new ArrayList<>();
    
    public Animal(int id, String nome, String raca, double peso, int idTutor, int idCategoria) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.idTutor = idTutor;
        this.idCategoria = idCategoria;

        animais.add(this);
    }

    public Animal(int id, String nome, String raca, double peso, Tutor tutor, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.tutor = tutor;
        this.categoria = categoria;

        animais.add(this);
    }

    static int contarAnimaisPorTutor(int idTutor) {
        int cont = 0;
        for (Animal animal : animais) {
            if (animal.idTutor == idTutor) {
                cont++;
            }
        }
        return cont;
    }

    static int contarAnimaisPorCategoria(int idCategoria) {
        int cont = 0;
        for (Animal animal : animais) {
            if (animal.idCategoria == idCategoria) {
                cont++;
            }
        }
        return cont;
    }
}
