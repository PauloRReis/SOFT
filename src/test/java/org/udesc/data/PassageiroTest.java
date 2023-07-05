package org.udesc.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PassageiroTest {

    @Test
    void publicarFeedbackComSucesso() {
        var passageiro = new Passageiro(1, "Maria Santos", "maria@example.com", "9876543210");
        var feedback = new Feedback(1, "2020-12-05", 4, "Motorista educado.");

        assertTrue(passageiro.publicarFeedback(feedback));
    }

    @Test
    void publicarFeedbackSemSucesso() {
        var passageiro = new Passageiro(1, "Maria Santos", "maria@example.com", "9876543210");
        var feedback = new Feedback(1, "2020-12-05", 4, "Motorista educado.");

        passageiro.publicarFeedback(feedback);
        assertFalse(passageiro.publicarFeedback(feedback));
    }

    @Test
    void comprarPassagemComSucesso() {
        var passageiro = new Passageiro(1, "Maria Santos", "maria@example.com", "9876543210");
        var passagem = new Passagem(1, 5F);

        assertTrue(passageiro.comprarPassagem(passagem));
    }

    @Test
    void comprarPassagensComSucesso() {
        var passageiro = new Passageiro(1, "Maria Santos", "maria@example.com", "9876543210");
        var passagem = new Passagem(1, 5F);
        var outraPassagem = new Passagem(2, 5F);

        passageiro.comprarPassagem(passagem);
        assertTrue(passageiro.comprarPassagem(outraPassagem));
    }

    @Test
    void comprarPassagemSemSucesso() {
        var passageiro = new Passageiro(1, "Maria Santos", "maria@example.com", "9876543210");
        var passagem = new Passagem(1, 5F);
        var outraPassagem = new Passagem(2, 5F);

        passageiro.comprarPassagem(passagem);
        assertFalse(passageiro.comprarPassagem(passagem));
    }
}