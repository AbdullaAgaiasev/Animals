package com.example.animals;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvAnimals;

    public AnimalsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvAnimals = itemView.findViewById(R.id.tv_animals);
    }

    public void bind(String animals){
        tvAnimals.setText(animals);
    }


}
