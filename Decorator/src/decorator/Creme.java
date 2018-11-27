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
public class Creme extends SorveteSabor {

    public Creme(Sorvete sorvete) {
        super(sorvete);
    }

    @Override
    public int getQuantidadeBolas() {
        return 1 + this.getSorvete().getQuantidadeBolas();
    }
    // acrescentar 1.25 a referencia de sorvete que já esta armazenada na super classe.
    //que será enviada por meio do contrutor.

    @Override
    public double getPreco() {
        return 1.50 + this.getSorvete().getPreco();
    }

}
