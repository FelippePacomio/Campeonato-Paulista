package campeonato;

import javax.swing.ImageIcon;

public class Time {

    private String nome;
    private ImageIcon emblema;

    public Time(String nome, ImageIcon emblema) {
        this.nome = nome;
        this.emblema = emblema;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ImageIcon getEmblema() {
        return emblema;
    }

    public void setEmblema(ImageIcon emblema) {
        this.emblema = emblema;
    }

}
