package com.example.achypur.gridviewapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nostra13.universalimageloader.core.ImageLoader;


public class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private ImageView imageView;
    private TextView textView;
    private ImageLoader imageLoader;
    private ImageModel imageModel;

    ImageViewHolder(View itemView) {
        super(itemView);
        imageLoader = ImageLoader.getInstance();
        imageView = (ImageView) itemView.findViewById(R.id.image);
        textView = (TextView) itemView.findViewById(R.id.text);
        itemView.setOnClickListener(this);
    }

    void bindData(ImageModel model) {
        this.imageModel = model;
        if (textView != null) {
            textView.setText(model.getCatName());
        }

        if (imageView != null && imageLoader.isInited()) {
            imageLoader.displayImage(model.getCatImage(), imageView);
        }
    }

    @Override
    public void onClick(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(imageModel.getCatLink()));
        view.getContext().startActivity(browserIntent);
        Toast.makeText(view.getContext(), imageModel.getCatName() + " was clicked", Toast.LENGTH_SHORT).show();
    }
}
