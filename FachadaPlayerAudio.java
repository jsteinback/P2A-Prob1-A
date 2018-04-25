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
public class FachadaPlayerAudio {

    FactoryFormatoAudio factory = new FactoryFormatoAudio();
    FormatoAudio player;
    boolean aberto = false;

    public void reproduzirSimples(String arquivo) {
        player = factory.getFormatoAudio(arquivo);
        player.abrir(arquivo);
        player.reproduzir();
        aberto = true;
    }

    public void pararSimples() {
        if (aberto) {
            player.parar();
            player.liberar();
        }else{
            throw new GatunoException("Nenhumm arquivo selecionao");
        }
    }
}
