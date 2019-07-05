package com.dicoding.moviecatalog.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dicoding.moviecatalog.DetailActivity;
import com.dicoding.moviecatalog.R;
import com.dicoding.moviecatalog.model.Movie;
import com.dicoding.moviecatalog.viewholder.MovieViewHolder;

import org.w3c.dom.Text;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {
    private List<Movie> movie;

    public MovieAdapter(List<Movie> movie) { this.movie = movie; }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final View viewHolder = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_movie, viewGroup, false);
        final MovieViewHolder movieViewHolder = new MovieViewHolder(viewHolder);

        movieViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = viewHolder.getContext();
                int position = movieViewHolder.getAdapterPosition();

                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("MOVIE_DETAIL", movie.get(position));
                context.startActivity(intent);
            }
        });

        return movieViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder movieViewHolder, int i) {
        movieViewHolder.setMovieData(movie.get(i));
    }

    @Override
    public int getItemCount() {
        return movie.size();
    }
}
