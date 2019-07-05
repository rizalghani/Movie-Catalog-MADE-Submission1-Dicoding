package com.dicoding.moviecatalog.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dicoding.moviecatalog.R;
import com.dicoding.moviecatalog.model.Movie;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class MovieViewHolder extends RecyclerView.ViewHolder {
    private ImageView imgBanner;
    private TextView txtMovieName;
    private TextView txtRating;
    private TextView txtGenres;
    private TextView txtDesc;

    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);

        imgBanner = itemView.findViewById(R.id.img_banner);
        txtMovieName = itemView.findViewById(R.id.txt_movie_name);
        txtRating = itemView.findViewById(R.id.txt_rating);
        txtGenres = itemView.findViewById(R.id.txt_genres);
        txtDesc = itemView.findViewById(R.id.txt_desc);
    }

    public void setMovieData(Movie movie){
        Picasso.get().load(movie.getBanner()).into(imgBanner);
        txtMovieName.setText(movie.getName());
        txtRating.setText(String.valueOf(movie.getRating()));
        txtGenres.setText(movie.getGenres());
    }
}
