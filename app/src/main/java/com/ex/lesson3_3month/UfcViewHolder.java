package com.ex.lesson3_3month;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UfcViewHolder extends RecyclerView.ViewHolder {

    private TextView tvFighter;
    public UfcViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFighter = itemView.findViewById(R.id.tv_fighter);
    }
    public void onBind(String ufc){
        tvFighter.setText(ufc);

    }
}
