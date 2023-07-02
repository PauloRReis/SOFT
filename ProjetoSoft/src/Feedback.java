package Classes;

public class Feedback {
    private int id;
    private String data;
    private int avaliacao;
    private String comentario;

    public Feedback(int id, String data, int avaliacao, String comentario) {
        this.id = id;
        this.data = data;
        this.avaliacao = avaliacao;
        this.comentario = comentario;
    }
    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
