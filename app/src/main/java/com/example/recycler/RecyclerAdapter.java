package com.example.recycler;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Groups> groupList;

    public RecyclerAdapter(Context context, ArrayList<Groups> groupList){
        this.context = context;
        this.groupList = groupList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Groups group = groupList.get(position);
        holder.groupNameTV.setText(group.getName());
        holder.image.setImageResource(group.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, group.getDescription(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra("name", group.getName());
                intent.putExtra("image", group.getImage());
                intent.putExtra("description", group.getDescription());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return groupList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView groupNameTV;
        ViewHolder(View view){
            super(view);
            groupNameTV = view.findViewById(R.id.group_name);
            image = view.findViewById(R.id.imageView);
        }

    }
}
