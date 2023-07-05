package org.udesc.data;

public class Passagem {
    private int id;
    private Float preco;

    public Passagem(int id, Float preco) {
        this.id = id;
        this.preco = preco;
    }
    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
}
