package com.example.gramrecyclerviewassignment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ViewHolder>
                            implements OnModelItemClickListener{
    ArrayList<Model> items = new ArrayList<Model>();
    OnModelItemClickListener listener;

    public void addItem(Model item){
        items.add(item);
    }

    public void setItems(ArrayList<Model>items){
        this.items = items;
    }

    public Model getItem(int position){
        return items.get(position);
    }
    public Model setItem(int position, Model item){
        return items.set(position, item);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.recyclerview, viewGroup, false);
        return new ViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewholder, int position) {
        Model item = items.get(position);
        viewholder.setItem(item);
        
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onItemClick(ViewHolder holder, View view, int position) {
        if(listener != null){
            listener.onItemClick(holder, view, position);
        }
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView1;
        TextView textView2;
        TextView textView3;

        public ViewHolder(View itemView, final OnModelItemClickListener listener){
            super(itemView);

            textView1 = itemView.findViewById(R.id.outputNameTextView);
            textView2 = itemView.findViewById(R.id.outputYearTextView);
            textView3 = itemView.findViewById(R.id.outputMobileTextView);

            itemView.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view){
                    int position = getAdapterPosition();

                    if(listener != null){
                        listener.onItemClick(ViewHolder.this, view, position);
                    }
                }
            });
        }

        public void setItem(Model item) {
            textView1.setText(item.getName());
            textView2.setText(item.getYear());
            textView3.setText(item.getMobile());
        }
    }
}
