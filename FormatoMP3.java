/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatuno;

import problema1.MP3DJ;

/**
 *
 * @author giuliog
 */

public class FormatoMP3 implements FormatoAudio{
    MP3DJ gatuno;
    
    @Override
    public void abrir(String arquivo) {
        gatuno = new MP3DJ();
        gatuno.setFile(arquivo);
    }

    @Override
    public void reproduzir() {
        gatuno.play();
    }

    @Override
    public void pausar() {
        gatuno.stop();
    }

    @Override
    public void parar() {
        gatuno.stop();
        gatuno.reward(gatuno.forward(0));
    }

    @Override
    public void avancar(int tempo) {
        gatuno.forward(tempo);
    }

    @Override
    public void retornar(int tempo) {
        gatuno.reward(tempo);
    }

    @Override
    public void liberar() {
        gatuno = null;
    }
    
}
