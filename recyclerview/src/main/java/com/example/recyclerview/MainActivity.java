package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Resources;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    /* The views in the list are represented by view holder objects.
    These objects are instances of a class you define by extending RecyclerView.ViewHolder
    The view holder objects are managed by an adapter, which you create by extending RecyclerView.Adapter
     */
    private RecyclerView.Adapter rvAdapter;

    // responsible for measuring and positioning item views within a RecyclerView
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.list);
        Resources res = getResources();


        recyclerView.setHasFixedSize(true);

        // Set layout manager to position the items
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Create adapter passing in the sample data
        rvAdapter = new DummyContentAdapter(DummyContent.getContent());
        // Attach the adapter to the recyclerview to populate items
        recyclerView.setAdapter(rvAdapter);
    }
}