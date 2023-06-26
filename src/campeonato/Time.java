package campeonato;

public class Time {

    private String nome;
    private String emblema;

    public Time(String nome, String emblema) {
        this.nome = nome;
        this.emblema = emblema;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmblema() {
        return emblema;
    }

    public void setEmblema(String emblema) {
        this.emblema = emblema;
    }

}
