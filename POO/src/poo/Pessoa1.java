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
public class Pessoa1 extends AtributosPessoa {

    public Pessoa1(String nome) {
        super(nome);
    }

    @Override
    public void ComecoConversa(AtributosPessoa atributosPessoa) {
        System.out.println(this.getNome() + ": Oi " + atributosPessoa.getNome() + "...");
    }

    @Override
    public void FalaNumeroP1(AtributosPessoa atributosPessoa) {
        System.out.println(this.getNome() + ": Meu número é: " + atributosPessoa.getNumero1() + ", e o seu?");
    }
}
