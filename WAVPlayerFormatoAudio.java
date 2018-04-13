package gatuno;

import problema1.WAVPlayer;

public class WAVPlayerFormatoAudio implements FormatoAudio {

    WAVPlayer gatuno;
    boolean parado = true;

    @Override
    public void abrir(String arquivo) {
        gatuno = new WAVPlayer(arquivo);
        gatuno.reward(gatuno.forward(0));
    }

    @Override
    public void reproduzir() {
        gatuno.play();
        parado = false;
    }

    @Override
    public void pausar() {
        parado = true;
        gatuno.stop();
    }

    @Override
    public void parar() {
        parado = true;
        gatuno.stop();
        gatuno.reward(gatuno.forward(0));

    }

    @Override
    public void avancar(int tempo) {
        if (parado) {
            gatuno.forward(tempo * 1000);
        } else {
            gatuno.stop();
            gatuno.forward(tempo * 1000);
            gatuno.play();
        }
    }

    @Override
    public void retornar(int tempo) {
        if (parado) {
            gatuno.reward(tempo * 1000);
        } else {
            gatuno.stop();
            gatuno.reward(tempo * 1000);
            gatuno.play();
        }
    }

    @Override
    public void liberar() {
        parado = true;
        gatuno.stop();
        gatuno = null;
    }

}
