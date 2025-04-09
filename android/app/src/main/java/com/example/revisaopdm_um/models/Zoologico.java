package com.example.revisaopdm_um.models;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    //cria-se a lista da classe Animal animais.
    private List<Animal> animais;

    //cria-se o construtor de Zoologico com a lista animais.
    public Zoologico(){
        this.animais = new ArrayList<>();
    }

    //adiciona os respectivos animais à uma lista para executar os métodos.
    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }

    //faz com que todos os animais de qualquer classe emitam seus sons. (polimorfismo)
    public void fazerBarulho() {
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }

    /*faz com que apenas os animais pertencentes a classes
    que utilizam a interface carnivoro cacem.*/
    public void animalCacar(){
        for (Animal animal : animais) {
            if (animal instanceof Carnivoro){
            animal.cacar();
            }
        }
    }
}
