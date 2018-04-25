/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatuno;

/**
 *
 * @author giuliog
 */
public class FactoryFormatoAudio {

    public FormatoAudio getFormatoAudio(String arquivo) {
        if (arquivo.toUpperCase().endsWith(".WAV")) {
            return new FormatoWAV();
        } else if (arquivo.toUpperCase().endsWith(".AIFF")) {
            return new FormatoAIFF();
        } else if (arquivo.toUpperCase().endsWith(".WMA")) {
            return new FormatoWMA();
        } else if (arquivo.toUpperCase().endsWith(".MP3")) {
            return new FormatoMP3();
        } else if (arquivo.toUpperCase().endsWith(".AAC")) {
            return new FormatoAAC();
        } else {
            throw new GatunoException("Formato desconhecido");
        }
    }
}
