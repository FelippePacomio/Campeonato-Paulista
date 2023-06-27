package campeonato;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Time {

    private String nome;
    private ImageIcon emblema;

    public Time(String nome, ImageIcon emblema) {
        this.nome = nome;
        this.emblema = emblema;
    }

    public void lerEmblemas() throws IOException {
        BufferedImage atleticosorocaba = ImageIO.read(new File("C:\\Users\\felip\\OneDrive\\Documentos\\NetBeansProjects\\Campeonato-Paulista\\src\\escudos\\Atlético_Sorocaba-SP.png"));
        
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
