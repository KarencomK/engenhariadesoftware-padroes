/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *+++
 * @author k
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Sorvete sorvete = new SorveteNapolitano();
       //imprimi as imformações( sem nada)
       retornaInformacoes(sorvete);
       //montando o sorvete (adicionando os sabores)
       sorvete = new Creme(sorvete);
       sorvete = new Chocolate(sorvete);
       sorvete = new Morango(sorvete);
      
       
       retornaInformacoes(sorvete);
       
    }
    //static para não precisar ficar fazendo instanciações
    public static void retornaInformacoes(Sorvete sorvete){
        
        System.out.println(sorvete.getNome() + " Quantida de Bolas: " + 
                sorvete.getQuantidadeBolas() + " Preço: " +
                sorvete.getPreco());
    }
    
}
