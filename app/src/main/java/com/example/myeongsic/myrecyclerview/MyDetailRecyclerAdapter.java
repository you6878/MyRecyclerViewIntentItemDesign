package com.example.myeongsic.myrecyclerview;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by myeongsic on 2017. 4. 10..
 */

public class MyDetailRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    int images[] = {R.drawable.first, R.drawable.second, R.drawable.third, R.drawable.fourth, R.drawable.fifth, R.drawable.sixth, R.drawable.seventh, R.drawable.eighth, R.drawable.ninth, R.drawable.tenth, R.drawable.eleventh, R.drawable.twelfth};

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false);

        return new RowViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

        //((RowViewHolder)holder).imageView.setImageResource(images[position]);
        Picasso.with(((RowViewHolder)holder).itemView.getContext()) //Context 받아오기
                .load(ImageClass.imageUrls[position]) // URL 주소로 접속
                .into(((RowViewHolder)holder).imageView); // 아이템 이미지 넣기

        ((RowViewHolder)holder).itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),DetailActivity.class);
                view.getContext().startActivity(intent);
            }
        });
        ((RowViewHolder)holder).thumbUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((RowViewHolder)holder).thumbUp.
                        setBackgroundResource(R.drawable.ic_thumb_down_black_24dp);
            }
        });

    }

    @Override
    public int getItemCount() {
        return ImageClass.imageUrls.length;
    }

    private class RowViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public ImageButton thumbUp;
        public RowViewHolder(View view) {
            super(view);
            imageView = (ImageView)view.findViewById(R.id.recyclerview_item_imageview);
            thumbUp = (ImageButton)view.findViewById(R.id.thumbUp);
        }
    }
}
