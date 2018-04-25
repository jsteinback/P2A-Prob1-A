/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatuno;

/**
 *
 * @author gdegenhardt
 */
public interface FormatoAudio {
    public void abrir(String arquivo);
    public void reproduzir();
    public void pausar();
    public void parar();
    public void avancar(int tempo);
    public void retornar(int tempo);
    public void liberar();
    
}
