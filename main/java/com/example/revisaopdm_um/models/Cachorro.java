package com.example.revisaopdm_um.models;

public class Cachorro extends Animal implements Carnivoro{

    //herda atributos da classe mãe Animais.
    public Cachorro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    //sobrescreve o emitirSom da classe mãe Animais.
    @Override
    public void emitirSom(){
        System.out.println(nome + " está latindo!");
    }

    //sobrescreve o caçar da interface Carnivoro.
    @Override
    public void cacar(){
        super.cacar();
        System.out.println(nome  + "está caçando ossos.");
    }
}
