package com.dicoding.moviecatalog;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.dicoding.moviecatalog.model.Movie;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    private ImageView imgBanner;
    private TextView txtMovieName;
    private TextView txtDesc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //casting view
        imgBanner = findViewById(R.id.img_banner);
        txtMovieName = findViewById(R.id.txt_movie_name);
        txtDesc = findViewById(R.id.txt_desc);

        Movie movie = getIntent().getParcelableExtra("MOVIE_DETAIL");

        Picasso.get().load(movie.getBanner()).into(imgBanner);
        txtMovieName.setText(movie.getName());
        txtDesc.setText(movie.getDesc());
    }
}
