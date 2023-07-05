package org.udesc.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void adicionarFuncionarioComSucesso() {
        var onibus = new CategoriaTransporte(1, "Ônibus");
        var veiculo = new Veiculo(1, "ABC Motors", "Modelo X", 2022, 50, onibus);
        var funcionario = new Funcionario(1, "Gabriel Silva");

        assertTrue(veiculo.adicionarFuncionario(funcionario));
    }

    @Test
    void adicionarFuncionarioSemSucesso() {
        var onibus = new CategoriaTransporte(1, "Ônibus");
        var veiculo = new Veiculo(1, "ABC Motors", "Modelo X", 2022, 50, onibus);
        var funcionario = new Funcionario(1, "Gabriel Silva");

        veiculo.adicionarFuncionario(funcionario);
        assertFalse(veiculo.adicionarFuncionario(funcionario));
    }

    @Test
    void adicionarPassageiroComSucesso() {
        var onibus = new CategoriaTransporte(1, "Ônibus");
        var veiculo = new Veiculo(1, "ABC Motors", "Modelo X", 2022, 50, onibus);
        var passageiro = new Passageiro(1, "Maria Santos", "maria@example.com", "9876543210");

        assertTrue(veiculo.adicionarPassageiro(passageiro));
    }

    @Test
    void adicionarPassageiroSemSucesso() {
        var onibus = new CategoriaTransporte(1, "Ônibus");
        var veiculo = new Veiculo(1, "ABC Motors", "Modelo X", 2022, 50, onibus);
        var passageiro = new Passageiro(1, "Maria Santos", "maria@example.com", "9876543210");

        veiculo.adicionarPassageiro(passageiro);
        assertFalse(veiculo.adicionarPassageiro(passageiro));
    }
}