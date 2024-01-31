package com.example.recyclerview1;

import java.util.ArrayList;

public class Datos {
    ArrayList<ItemLista> lista;

    public Datos() {
        lista = new ArrayList<ItemLista>();
        lista.add(new ItemLista(R.drawable.abejaruco, "Texto superior 1", "Texto inferior 1"));
        lista.add(new ItemLista(R.drawable.abubillacomun, "Texto superior 2", "Texto inferior 2"));
        lista.add(new ItemLista(R.drawable.acentoralpino, "Texto superior 3", "Texto inferior 3"));
        lista.add(new ItemLista(R.drawable.acentorcomun1, "Texto superior 4", "Texto inferior 4"));
        lista.add(new ItemLista(R.drawable.agachadizacomun, "Texto superior 5", "Texto inferior 5"));
        lista.add(new ItemLista(R.drawable.agujacolipinta, "Texto superior 6", "Texto inferior 6"));
    }
}