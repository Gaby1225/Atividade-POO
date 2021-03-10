/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Gabrielle
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa1 pessoa1 = new Pessoa1("Person 1");
        AtributosPessoa pessoa2 = new AtributosPessoa("Person 2");
        
        pessoa1.ComecoConversa(pessoa2);
        pessoa2.ComecoConversa(pessoa1);
        pessoa1.FalaNumeroP1(pessoa2);
        pessoa2.FalaNumeroP2(pessoa2);
    }
    
}
