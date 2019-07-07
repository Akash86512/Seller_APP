package com.example.myshop.Add;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myshop.Bagkg;
import com.example.myshop.Cartoonboxpices;
import com.example.myshop.Cartoonlaripices;
import com.example.myshop.Cartoonpices;
import com.example.myshop.Onlybag;
import com.example.myshop.Onlycartoon;
import com.example.myshop.R;

import java.util.ArrayList;


class itemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

    public ImageView ImgIcon;
    public TextView txttitle;

    private ItemClickListner itemClickListner;

    public itemViewHolder (@NonNull View itemView) {
        super(itemView);


        txttitle = itemView.findViewById(R.id.name);
        ImgIcon = itemView.findViewById(R.id.image);
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }

    public void setItemClickListner(ItemClickListner itemClickListner) {
        this.itemClickListner = itemClickListner;
    }

    @Override
    public void onClick(View v) {
        itemClickListner.onClick(v, getAdapterPosition(), false);

    }

    @Override
    public boolean onLongClick(View v) {
        itemClickListner.onClick(v, getAdapterPosition(), false);
        return true;
    }
}


public class itemAdapter extends RecyclerView.Adapter<itemViewHolder> {

    private ArrayList<item> items;
    private Context c;

    public itemAdapter(Context c, ArrayList<item> items) {
        this.items = items;
        this.c = c;
    }

    @NonNull
    @Override
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup Parent, int i) {
        LayoutInflater inflater = LayoutInflater.from(Parent.getContext());
        View view = inflater.inflate(R.layout.rowlayout, Parent, false);
        return new itemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewHolder holder, int position) {
        final item s = items.get(position);

        holder.txttitle.setText(s.getTitle());
       // holder.ImgIcon.setImageResource(s.getImage());

        holder.setItemClickListner(new ItemClickListner() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                Toast.makeText(c,""+position , Toast.LENGTH_LONG).show();

                if (position==0){
                    Intent i=new Intent(c, Onlycartoon.class);
                    c.startActivity(i);
                }
                if (position==1){
                    Intent i=new Intent(c, Cartoonboxpices.class);
                    c.startActivity(i);
                }
                if (position==2){
                    Intent i=new Intent(c, Cartoonpices.class);
                    c.startActivity(i);
                }
                if (position==3){
                    Intent i=new Intent(c, Cartoonlaripices.class);
                    c.startActivity(i);
                }
                if (position==4){
                    Intent i=new Intent(c, Onlybag.class);
                    c.startActivity(i);
                }
                if (position==5){
                    Intent i=new Intent(c, Bagkg.class);
                    c.startActivity(i);
                }




            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}