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
public  abstract class Sorvete {
    
    private String nome;
    
    
    public abstract int getQuantidadeBolas();
    
    public abstract double getPreco();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
