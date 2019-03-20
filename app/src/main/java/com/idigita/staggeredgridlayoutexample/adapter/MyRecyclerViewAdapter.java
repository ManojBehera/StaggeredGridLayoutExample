package com.idigita.staggeredgridlayoutexample.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.idigita.staggeredgridlayoutexample.R;
import com.idigita.staggeredgridlayoutexample.model.ItemObjects;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<ItemObjects> itemList;
    private Context context;

    public MyRecyclerViewAdapter(Context context, List<ItemObjects> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_list, null);
        MyViewHolder rcv = new MyViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.countryName.setText(itemList.get(position).getName());
        holder.countryPhoto.setImageResource(itemList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
