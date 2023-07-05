package Classes;

import java.util.List;

public class Cargo {
    private int id;
    private String nome;
    private String descricao;
    private Float salario;
    private List<Funcionario> funcionarios;

    public Cargo(int id, String nome, String descricao, Float salario) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.salario = salario;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public boolean adicionarFuncionario(Funcionario funcionario){
        if(!this.funcionarios.contains(funcionario)){
            this.funcionarios.add(funcionario);
            return true;
        }
        return false;
    }
}
