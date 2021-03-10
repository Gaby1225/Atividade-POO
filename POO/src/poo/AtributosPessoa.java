/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Random;

/**
 *
 * @author Gabrielle
 */
public class AtributosPessoa {

    private String nome;

    Random numeroRandom = new Random();
    private int numero1 = numeroRandom.nextInt(26);
    private int numero2 = numeroRandom.nextInt(26);

    ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero1() {
        return numero1;
    }
    
    public int getNumero2() {
        return numero2;
    }
    
    public AtributosPessoa (String nome){
        this.setNome(nome);
    }
    
    public void ComecoConversa(AtributosPessoa atributosPessoa){
        System.out.println(this.getNome() + ": Oi "  + atributosPessoa.getNome() + "...");
    }
    
    public void FalaNumeroP1(AtributosPessoa atributosPessoa){
        System.out.println(this.getNome() + ": Meu número é: "  + atributosPessoa.getNumero1() + " e o seu?");
    }
    
    public void FalaNumeroP2(AtributosPessoa atributosPessoa){
        System.out.println(this.getNome() + ": O meu é: "  + atributosPessoa.getNumero2() + " :D");
    }
}
