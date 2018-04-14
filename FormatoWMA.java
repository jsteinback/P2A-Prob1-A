package gatuno;

import problema1.wmaPlay;

public class FormatoWMA implements FormatoAudio {

    wmaPlay reprodutor;
    private boolean parado = true;

    @Override
    public void abrir(String arquivo) {
        reprodutor = new FormatoWMA();
        reprodutor.setFile(arquivo);
        reprodutor.open();
        reprodutor.setLocation(0);
    }

    @Override
    public void reproduzir() {
        reprodutor.play();
        parado=false;
    }

    @Override
    public void pausar() {
        if (!parado) {
            reprodutor.stop();
            parado = true;
        }

    }

    @Override
    public void parar() {
        if (!parado) {
            reprodutor.stop();
            parado = true;
        }
        reprodutor.setLocation(0);
    }

    @Override
    public void avancar(int tempo) {
        if (parado) {
            reprodutor.setLocation(reprodutor.getLocation() + tempo);
        } else {
            pausar();
            reprodutor.setLocation(reprodutor.getLocation() + tempo);
            reproduzir();
        }

    }

    @Override
    public void retornar(int tempo) {
        if (parado) {
            reprodutor.setLocation(reprodutor.getLocation() - tempo);
        } else {
            pausar();
            reprodutor.setLocation(reprodutor.getLocation() - tempo);
            reproduzir();
        }
    }

    @Override
    public void liberar() {
        reprodutor = null;
        parado=true;
    }

}
