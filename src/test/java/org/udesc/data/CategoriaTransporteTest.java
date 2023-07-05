package org.udesc.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoriaTransporteTest {

    @Test
    void adicionarRotaComSucesso() {
        var onibus = new CategoriaTransporte(1, "Ônibus");
        Rota rota;
        try {
            rota = new Rota(1, "Rota A", "Terminal Central", "Terminal Norte", 18F);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        assertTrue(onibus.adicionarRota(rota));
    }

    @Test
    void adicionarRotaSemSucesso() {
        var onibus = new CategoriaTransporte(1, "Ônibus");
        Rota rota;
        try {
            rota = new Rota(1, "Rota A", "Terminal Central", "Terminal Norte", 18F);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        onibus.adicionarRota(rota);
        assertFalse(onibus.adicionarRota(rota));
    }
}