package com.example.myeongsic.myrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView view = (RecyclerView) findViewById(R.id.recyclerview);
        MyRecyclerAdapter myRecyclerAdapter = new MyRecyclerAdapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,3);

        view.setAdapter(myRecyclerAdapter);
        view.setLayoutManager(layoutManager);
    }
}
