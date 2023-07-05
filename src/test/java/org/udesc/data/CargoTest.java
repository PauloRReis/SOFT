package org.udesc.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoTest {

    @Test
    void adicionarFuncionarioComSucesso() {
        var cargo = new Cargo(1, "Motorista", "Responsável por dirigir o veículo", 2500F);
        var funcionario = new Funcionario(1, "Sofia Martins");
        assertTrue(cargo.adicionarFuncionario(funcionario));
    }

    @Test
    void adicionarFuncionarioSemSucesso() {
        var cargo = new Cargo(1, "Motorista", "Responsável por dirigir o veículo", 2500F);
        var funcionario = new Funcionario(1, "Sofia Martins");
        cargo.adicionarFuncionario(funcionario);
        assertFalse(cargo.adicionarFuncionario(funcionario));
    }
}