package org.udesc.data;

import java.util.ArrayList;
import java.util.List;

public class Rota {
    private int id;
    private String nome;
    private String origem;
    private String destino;
    private Float distancia;
    private final List<Veiculo> veiculos;

    public Rota(int id, String nome, String origem, String destino, Float distancia) throws Exception {
        if (origem.equals(destino) || distancia <= 0) {
            throw new Exception();
        }
        this.id = id;
        this.nome = nome;
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.veiculos = new ArrayList<>();
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

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Float getDistancia() {
        return distancia;
    }

    public void setDistancia(Float distancia) {
        this.distancia = distancia;
    }

    public boolean adicionarVeiculo(Veiculo veiculo){
        if(!this.veiculos.contains(veiculo)){
            this.veiculos.add(veiculo);
            return true;
        }
        return false;
    }
}
