/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatuno;

import problema1.AACPlayer;

/**
 *
 * @author giuliog
 */
public class FormatoAAC implements FormatoAudio {

    AACPlayer gatuno;
    boolean parado = true;

    @Override
    public void abrir(String arquivo) {
        gatuno = new AACPlayer(arquivo);
        gatuno.open();
        gatuno.setLocation(0);

    }

    @Override
    public void reproduzir() {
        gatuno.play();
        parado = false;
    }

    @Override
    public void pausar() {
        if (!parado) {
            gatuno.stop();
            parado = true;
        }
    }

    @Override
    public void parar() {
        gatuno.stop();
        if (!parado) {
            gatuno.stop();
        }
    }

    @Override
    public void avancar(int tempo) {
        gatuno.setLocation(gatuno.getLocation() + tempo);
    }

    @Override
    public void retornar(int tempo) {
        gatuno.setLocation(gatuno.getLocation() - tempo);
    }

    @Override
    public void liberar() {
        gatuno = null;
    }

}
