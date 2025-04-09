package com.example.revisaopdm_um;

import android.os.Bundle;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.revisaopdm_um.models.Animal;
import com.example.revisaopdm_um.models.Cachorro;
import com.example.revisaopdm_um.models.Gato;
import com.example.revisaopdm_um.models.Vaca;
import com.example.revisaopdm_um.models.Zoologico;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //cria-se um objeto do tipo Zoologico para
        Zoologico zoo = new Zoologico();

        //cria-se um novo animal do tipo gato
        Animal gatoUm = new Gato("sushi", 9, 5.0);

        //adiciona-se o animal gatoUm ao Zoologico zoo.
        zoo.adicionarAnimal(gatoUm);

        //cria-se um novo animal do tipo vaca
        Animal vacaUm = new Vaca("mimosa", 10, 500.0);

        //adiciona-se o animal vacaUm ao Zoologico zoo.
        zoo.adicionarAnimal(vacaUm);

        //cria-se um novo animal do tipo cachorro
        Animal cachorroUm = new Cachorro("dogo", 3, 10.0);

        //adiciona-se o animal cachorroUm ao Zoologico zoo.
        zoo.adicionarAnimal(cachorroUm);

        //faz zoo.fazerBarulho() funcionar
        zoo.fazerBarulho();

        //faz zoo.animalCacar() funcionar
        zoo.animalCacar();


        //utiliza o contador dos animais
        System.out.println("Há "+ Animal.contador +" animais neste zoológico.");

    }
}