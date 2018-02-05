package com.example.achypur.gridviewapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class GridViewAdapter extends RecyclerView.Adapter<ImageViewHolder> {

    private Context context;
    private List<ImageModel> data;

    public GridViewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_view_item, parent, false);
        return new ImageViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        holder.bindData(getItem(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    ImageModel getItem(final int position) {
        return data.get(position);
    }

    void setData(final List<ImageModel> data) {
        this.data = data;
    }

}
