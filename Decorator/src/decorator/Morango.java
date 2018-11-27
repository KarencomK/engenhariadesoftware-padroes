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
public class Morango  extends SorveteSabor{
    
    public Morango (Sorvete sorvete){
        super(sorvete);
    }
    
     @Override
    public int getQuantidadeBolas() {
      return 1 + this.getSorvete().getQuantidadeBolas();
    }

    @Override
    public double getPreco() {
     return 1.00 + this.getSorvete().getPreco();
    }
    
}
