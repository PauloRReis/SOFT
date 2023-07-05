package org.udesc.data;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    private int id;
    private String fabricante;
    private String modelo;
    private int ano;
    private int capacidade;
    private CategoriaTransporte categoria;
    private List<Passageiro> passageiros;
    private List<Funcionario> funcionarios;

    public Veiculo(int id, String fabricante, String modelo, int ano, int capacidade, CategoriaTransporte categoria) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidade = capacidade;
        this.categoria = categoria;
        passageiros = new ArrayList<>();
        funcionarios = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean adicionarFuncionario(Funcionario funcionario){
        if(!this.funcionarios.contains(funcionario)){
            this.funcionarios.add(funcionario);
            return true;
        }
        return false;
    }

    public boolean adicionarPassageiro(Passageiro passageiro){
        if(!this.passageiros.contains(passageiro)){
            this.passageiros.add(passageiro);
            return true;
        }
        return false;
    }
}
