package com.example.turismocolombia3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.turismocolombia3.Modelos.Granada;

import java.util.List;

public class GranadaAdapter extends RecyclerView.Adapter<GranadaAdapter.GranadaViewHolder> {
    List<Granada> granada;

    public GranadaAdapter(List<Granada> granada){
        this.granada = granada;
    }

    @Override
    public int getItemCount() {
        return granada.size();
    }

    @Override
    public GranadaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false);
        GranadaViewHolder granadaViewHolder = new GranadaViewHolder(v);
        return granadaViewHolder;
    }

    @Override
    public void onBindViewHolder(GranadaViewHolder GranadaViewHolder, int i) {
        GranadaViewHolder.nombre_del_sitio_turistico.setText(granada.get(i).getNombre_del_sitio_turistico());
        GranadaViewHolder.ubicaci_n.setText(granada.get(i).getUbicaci_n());
        GranadaViewHolder.descripci_n.setText(granada.get(i).getDescripci_n());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class GranadaViewHolder extends RecyclerView.ViewHolder {
        TextView nombre_del_sitio_turistico;
        TextView ubicaci_n;
        TextView descripci_n;

        GranadaViewHolder(View itemView) {
            super(itemView);
            nombre_del_sitio_turistico = itemView.findViewById(R.id.nombre);
            ubicaci_n = itemView.findViewById(R.id.lugar);
            descripci_n = itemView.findViewById(R.id.detalle);
        }
    }

}
