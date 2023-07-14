package campeonato;

import java.util.Random;

public class Placar {

    private int placarVisitante;
    private int placarCasa;

    public Placar() {
        placarAleatorio();
    }

    private void placarAleatorio() {
        Random random = new Random();
        placarVisitante = random.nextInt(6);
        placarCasa = random.nextInt(6);
    }

    public int getPlacarVisitante() {
        return placarVisitante;
    }

    public void setPlacarVisitante(int placarVisitante) {
        this.placarVisitante = placarVisitante;
    }

    public int getPlacarCasa() {
        return placarCasa;
    }

    public void setPlacarCasa(int placarCasa) {
        this.placarCasa = placarCasa;
    }
}
