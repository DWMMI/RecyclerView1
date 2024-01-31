package com.example.recyclerview1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MiAdaptadorPajaros extends
        RecyclerView.Adapter<MiAdaptadorPajaros.MiViewHolderPajaros> implements
        View.OnClickListener {
    private ArrayList<ItemLista> datos;
    private View.OnClickListener listener;

    public static class MiViewHolderPajaros extends RecyclerView.ViewHolder {
        private ImageView imagen;
        private TextView textoSup;
        private TextView textoInf;

        public MiViewHolderPajaros(View view) {
            super(view);
            imagen = (ImageView) view.findViewById(R.id.imageView);
            textoSup = (TextView) view.findViewById(R.id.textView);
            textoInf = (TextView) view.findViewById(R.id.textView2);
        }

        public void bindListaItem(ItemLista item) {
            imagen.setImageResource(item.getImagen());
            textoSup.setText(item.getTextoSup());
            textoInf.setText(item.getTextoInf());
        }
    }

    public MiAdaptadorPajaros(ArrayList<ItemLista> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public MiViewHolderPajaros onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        v.setOnClickListener(this);
        MiViewHolderPajaros vh = new MiViewHolderPajaros(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MiAdaptadorPajaros.MiViewHolderPajaros holder, int position) {
        holder.bindListaItem(datos.get(position));
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        if (listener != null) {
            listener.onClick(v);
        }
    }
}


