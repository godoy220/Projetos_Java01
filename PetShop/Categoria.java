import java.util.ArrayList;

public class Categoria {

    int id;
    String descricao;

    static ArrayList<Categoria> categorias = new ArrayList<>();

    public Categoria(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;

        categorias.add(this);
    }

    static void verificaId(int id) throws Exception {
        for (Categoria categoria : categorias) {
            if (categoria.id == id) {
                return;
            }
        }
        throw new Exception("Categoria não encontrada");
    }

    static Categoria buscaCategoria(int id) {
        for (Categoria categoria : categorias) {
            if (categoria.id == id) {
                return categoria;
            }
        }
        return null;
    }
    
}
