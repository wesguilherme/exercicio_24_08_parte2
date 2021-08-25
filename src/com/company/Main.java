package com.company;

import com.company.model.GuardaRoupa;
import com.company.model.Roupa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GuardaRoupa guardaRoupa = new GuardaRoupa(0, new HashMap<>());
        Integer codigo = 0;

        for (int i = 0; i < 5; i++) {
            List<Roupa> roupas = new ArrayList<>();

            //Cria Objetos do tipo Pessoa
            roupas.add(new Roupa("Pool", "Calça"));
            roupas.add(new Roupa("Nike", "Blusa"));
            roupas.add(new Roupa("Vans", "Tênis"));

            guardaRoupa.guardarRoupas(roupas);

        }

        guardaRoupa.mostrarRoupas();

        List<Roupa> devolver = guardaRoupa.devolverRoupas(1);
        for (Roupa item : devolver) {
            System.out.println("Retirada de itens do guarda-roupa:" + item.getMarca() + "---" + item.getModelo());
        }
    }
}