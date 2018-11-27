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
public abstract class SorveteSabor extends Sorvete {
   
    //referencia para o Sorvete
    private Sorvete sorvete;
    
    public SorveteSabor (Sorvete sorvete){
        this.sorvete=sorvete;
        this.setNome(sorvete.getNome());
    }

    public Sorvete getSorvete() {
        return sorvete;
    }
    
    
}
