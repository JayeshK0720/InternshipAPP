package com.jktech.edutransit_app;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    private Context context;
    private ArrayList<book_ride_1_model> arrContacts;

    public RecyclerContactAdapter(Context context, ArrayList<book_ride_1_model> arrContacts) {
        this.context = context;
        this.arrContacts = arrContacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_join_ride, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        book_ride_1_model modal = arrContacts.get(position);
        holder.imgView.setImageResource(modal.getImg());
        holder.txtNum.setText(modal.getAddress());
        holder.txtContact.setText(modal.getName());

        // Click listener for each item
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, join_ride_2.class);
                intent.putExtra("img", modal.getImg());
                intent.putExtra("name", modal.getName());
                intent.putExtra("address", modal.getAddress());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNum, txtContact;
        ImageView imgView;
        LinearLayout linear1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNum = itemView.findViewById(R.id.txtaddress);
            txtContact = itemView.findViewById(R.id.txtname);
            imgView = itemView.findViewById(R.id.imgview);
            linear1 = itemView.findViewById(R.id.linear1);
        }
    }
}