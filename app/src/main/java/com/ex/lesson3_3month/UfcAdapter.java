package com.ex.lesson3_3month;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UfcAdapter extends RecyclerView.Adapter<UfcViewHolder> {
    private ArrayList<String> UfcList;

    public UfcAdapter(ArrayList<String> ufcList) {
        UfcList = ufcList;



    }

    @NonNull
    @Override
    public UfcViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UfcViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ufc, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UfcViewHolder holder, int position) {
        holder.onBind(UfcList.get(position));


    }

    @Override
    public int getItemCount() {
        return UfcList.size();

    }
}
