package Classes;

import java.util.List;

public class Passageiro{
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private List<Feedback> feedbacks;
    private List<Passagem> passagens;


    public Passageiro(int id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    //getter and setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean publicarFeedback(Feedback feedback){
        if (!this.feedbacks.contains(feedback)){
            this.feedbacks.add(feedback);
            return true;
        }
        return false;
    }

    public boolean comprarPassagem(Passagem passagem){
        if(!this.passagens.contains(passagem)){
            this.passagens.add(passagem);
            return true;
        }
        return false;
    }
}
