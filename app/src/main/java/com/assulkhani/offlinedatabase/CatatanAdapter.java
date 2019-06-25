package com.assulkhani.offlinedatabase;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CatatanAdapter extends RecyclerView.Adapter<CatatanAdapter.MyViewHolder> {
    private Context context;
    private List<CatatanModel> data = new ArrayList<>();

    public CatatanAdapter(Context context, List<CatatanModel> data) {
        this.context = context;
        this.data = data;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View itemView = LayoutInflater.from(context).inflate(R.layout.item_catatan, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.tvJudul.setText(data.get(i).getJudul());
        myViewHolder.tvJumlah.setText(data.get(i).getJumlah());
        myViewHolder.tvTanggal.setText(data.get(i).getTanggal());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul, tvJumlah, tvTanggal;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvJudul = itemView.findViewById(R.id.tvJudul);
            tvJumlah = itemView.findViewById(R.id.tvJumlah);
            tvTanggal = itemView.findViewById(R.id.tvTanggal);
        }
    }
}
