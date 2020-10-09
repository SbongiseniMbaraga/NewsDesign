package com.sbo.social;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViwHolder> {

    Context context;
    ArrayList<News_Thread> news_threads;

    public NewsAdapter(Context c, ArrayList<News_Thread> p){
        context = c;
        news_threads = p;
    }

    @NonNull
    @Override
    public NewsViwHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NewsViwHolder(LayoutInflater.from(context).inflate(R.layout.desinglayout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViwHolder holder, int position) {
        holder.NewsDetail.setText(news_threads.get(position).getDetials());
        Picasso.get().load(news_threads.get(position).getImageLink()).into(holder.NewsImage);
    }

    @Override
    public int getItemCount() {
        return news_threads.size();
    }

    class NewsViwHolder extends RecyclerView.ViewHolder{
        TextView NewsDetail;
        ImageView NewsImage;

        public NewsViwHolder(@NonNull View itemView) {
            super(itemView);

            NewsDetail = itemView.findViewById(R.id.textView2);
            NewsImage = itemView.findViewById(R.id.imageView);
        }
    }
}
