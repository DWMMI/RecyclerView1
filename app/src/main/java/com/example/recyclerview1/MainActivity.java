package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView miRecyclerView;
RecyclerView.LayoutManager miLayoutManager;
MiAdaptadorPajaros miAdapter;
Datos d = new Datos();
ArrayList<ItemLista> datos = d.lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Asegúrate de tener esta línea antes de inicializar tus vistas
        miRecyclerView = (RecyclerView) findViewById(R.id.miRecyclerView);
        miLayoutManager = new LinearLayoutManager(this);
        miRecyclerView.setLayoutManager(miLayoutManager);

        miAdapter = new MiAdaptadorPajaros(datos);
        miAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Seleccionada la opción " + miRecyclerView.getChildAdapterPosition(v);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();;
            }
        });
        miRecyclerView.setAdapter(miAdapter);
    }

}