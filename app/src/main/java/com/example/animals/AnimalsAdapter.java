package com.example.animals;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalsAdapter extends RecyclerView.Adapter<AnimalsViewHolder> {

    private ArrayList<String> animalsList;

    public AnimalsAdapter(ArrayList<String> animalsList) {
        this.animalsList = animalsList;
    }

    @NonNull
    @Override
    public AnimalsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimalsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animals, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull AnimalsViewHolder viewHolder, int position) {
        viewHolder.bind(animalsList.get(position));

    }

    @Override
    public int getItemCount() {
        return animalsList.size();
    }
}
