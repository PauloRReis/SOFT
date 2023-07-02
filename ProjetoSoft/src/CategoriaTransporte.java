package Classes;

import java.util.List;

public class CategoriaTransporte {
    private int id;
    private String nome;
    private List<Rota> rotas;

    public CategoriaTransporte(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Rota> getRotas() {
        return rotas;
    }

    public void setRotas(List<Rota> rotas) {
        this.rotas = rotas;
    }

    public boolean adicionarRota(Rota rota){
        if(!this.rotas.contains(rota)){
            this.rotas.add(rota);
            return true;
        }
        return false;
    }
}
