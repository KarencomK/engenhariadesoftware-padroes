/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author k
 */
public class SorveteNapolitano extends Sorvete {
    
    public SorveteNapolitano (){
        this.setNome("Sorvete Napolitano");
    }

    @Override
    public int getQuantidadeBolas() {
        return 0; // o sorvete ainda  nesse momento não possui nenhuma bola
    }

    @Override
    public double getPreco() {
     return 0;  //todo o sorvete vai ter um custo inicial de 2.50
    }
}
