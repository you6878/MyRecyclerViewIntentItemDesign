package com.example.myeongsic.myrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        RecyclerView view = (RecyclerView) findViewById(R.id.detail_recyclerview);

        MyDetailRecyclerAdapter myDetailRecyclerAdapter = new MyDetailRecyclerAdapter();
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 1);

        layoutManager.scrollToPosition(getIntent().getIntExtra("SelectImagePosition", 0));

        view.setAdapter(myDetailRecyclerAdapter);
        view.setLayoutManager(layoutManager);


    }
}
