package gatuno;

import problema1.AIFFSuperPlayer;

public class FormatoAIFF implements FormatoAudio {

    AIFFSuperPlayer gatuno;
    boolean parado = true;

    @Override
    public void abrir(String arquivo) {
        gatuno = new AIFFSuperPlayer(arquivo);
        gatuno.setCursor(0);
    }

    @Override
    public void reproduzir() {
        gatuno.play();
        parado = true;
    }

    @Override
    public void pausar() {
        gatuno.pause();
        parado = false;
    }

    @Override
    public void parar() {
        gatuno.stop();
        gatuno.setCursor(0);
        parado = false;

    }

    @Override
    public void avancar(int tempo) {
        if (parado) {
            int tempoAtual = gatuno.pause();
            gatuno.setCursor(tempoAtual + tempo);

        } else {

            int tempoAtual = gatuno.pause();
            gatuno.setCursor(tempoAtual + tempo);
            gatuno.play();
        }
    }

    @Override
    public void retornar(int tempo) {
        if (parado) {
            int tempoAtual = gatuno.pause();
            gatuno.setCursor(tempoAtual - tempo);

        } else {

            int tempoAtual = gatuno.pause();
            gatuno.setCursor(tempoAtual - tempo);
            gatuno.play();
        }
    }

    @Override
    public void liberar() {
        gatuno.release();
        parado=true;
    }

}
