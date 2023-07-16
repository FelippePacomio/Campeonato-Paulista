package campeonato;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Time {

    private String nome;
    private ImageIcon emblema;
    private Icon escudo;
    private String vencedor;
    
    public Time(){
    
    }

    public Time(String nome, ImageIcon emblema) {
        this.nome = nome;
        this.emblema = emblema;
    }

    public Time(String nome, ImageIcon emblema, String vencedor) {
        this.nome = nome;
        this.emblema = emblema;
        this.vencedor = vencedor;
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

    /**
     * @return the vencedor
     */
    public String getVencedor() {
        return vencedor;
    }

    /**
     * @param vencedor the vencedor to set
     */
    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

    /**
     * @return the escudo
     */
    public Icon getEscudo() {
        return escudo;
    }

    /**
     * @param escudo the escudo to set
     */
    public void setEscudo(Icon escudo) {
        this.escudo = escudo;
    }

}
