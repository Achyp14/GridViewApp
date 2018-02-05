package com.example.achypur.gridviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.grid_view);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        List<ImageModel> list = JsonUtils.loadModelsFromFile(this);
        GridViewAdapter adapter = new GridViewAdapter(this);
        adapter.setData(list);
        mRecyclerView.setAdapter(adapter);
    }
}
