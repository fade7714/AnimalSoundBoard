package com.bartoszarcab.zwierzecydzwiek;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {

    private List<Animal> animals;
    private Context context;

    public AnimalAdapter(Context context, List<Animal> animals) {
        this.context = context;
        this.animals = animals;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_animal, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Animal animal = animals.get(position);
        holder.textName.setText(animal.getName());
        holder.imageAnimal.setImageResource(animal.getImageResource());
        holder.itemView.setOnClickListener(v -> animal.makeSound(context));
    }

    @Override
    public int getItemCount() { return animals.size(); }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textName;
        ImageView imageAnimal;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textName = itemView.findViewById(R.id.textAnimalName);
            imageAnimal = itemView.findViewById(R.id.imageAnimal);
        }
    }
}