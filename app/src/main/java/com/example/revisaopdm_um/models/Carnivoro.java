package com.example.revisaopdm_um.models;

//cria-se a interface carnívoro
public interface Carnivoro {
    /*cria-se o método caçar e adiciona-se default porque
    não possui nenhum modificador de acesso especificado*/
    default void cacar(){}
}
