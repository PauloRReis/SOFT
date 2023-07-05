package org.udesc.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotaTest {
    @Test
    void instanciarVeiculoInvalido() {
        assertThrows(Exception.class, () -> new Rota(1, "Rota A", "Terminal Central", "Terminal Central", 18F));
        assertThrows(Exception.class, () -> new Rota(1, "Rota A", "Terminal Central", "Terminal Norte", 0F));
    }

    @Test
    void adicionarVeiculoComSucesso() {
        Rota rota;
        try {
            rota = new Rota(1, "Rota A", "Terminal Central", "Terminal Norte", 18F);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        var onibus = new CategoriaTransporte(1, "Ônibus");
        var veiculo = new Veiculo(1, "ABC Motors", "Modelo X", 2022, 50, onibus);

        assertTrue(rota.adicionarVeiculo(veiculo));
    }

    @Test
    void adicionarVeiculoSemSucesso() {
        Rota rota;
        try {
            rota = new Rota(1, "Rota A", "Terminal Central", "Terminal Norte", 18F);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        var onibus = new CategoriaTransporte(1, "Ônibus");
        var veiculo = new Veiculo(1, "ABC Motors", "Modelo X", 2022, 50, onibus);

        rota.adicionarVeiculo(veiculo);
        assertFalse(rota.adicionarVeiculo(veiculo));
    }
}