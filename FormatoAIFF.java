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
        parado = false;
    }

    @Override
    public void pausar() {
        gatuno.pause();
        parado = true;
    }

    @Override
    public void parar() {
        gatuno.stop();
        gatuno.setCursor(0);
        parado = true;

    }

    @Override
    public void avancar(int tempo) {
        int tempoAtual = gatuno.pause();
        gatuno.setCursor(tempoAtual + tempo);
        if (!parado) {
            gatuno.play();
        }
    }

    @Override
    public void retornar(int tempo) {
        int tempoAtual = gatuno.pause();
        gatuno.setCursor(tempoAtual - tempo);
        if (!parado) {
            gatuno.play();
        }
    }

    @Override
    public void liberar() {
        gatuno.release();
        parado = true;
    }

}
