package com.example.revisaopdm_um.models;

/*a classe é abstrata porque
servirá de modelo para as outras*/
public abstract class Animal implements Carnivoro{

    //criação dos atributos da classe abstrata Animais.
    public String nome;
    int idade;
    double peso;
    public static int contador = 0;

    //criação do construtor da classe Animais.
    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        contador++;
    }

    //cria-se o método emitirSom
    public void emitirSom(){}

    /*cria-se o metodo quantidadeDeAnimais para retornar o valor
    armazenado pelo contador*/
    public int quantidadeDeAnimais(){
        return contador;
    }

}
