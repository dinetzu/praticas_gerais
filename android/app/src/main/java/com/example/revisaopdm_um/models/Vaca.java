package com.example.revisaopdm_um.models;

public class Vaca extends Animal{

    //herda atributos da classe mãe Animais.
    public Vaca(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    //sobrescreve o emitirSom da classe mãe Animais.
    @Override
    public void emitirSom(){
        System.out.println(nome + " está mugindo!");
    }
}
