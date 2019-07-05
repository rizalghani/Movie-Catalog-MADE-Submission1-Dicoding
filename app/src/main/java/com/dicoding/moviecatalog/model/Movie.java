package com.dicoding.moviecatalog.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private String name;
    private int banner;
    private float rating;
    private String genres;
    private String desc;

    public Movie(String name, int banner, float rating, String genres, String desc) {
        this.name = name;
        this.banner = banner;
        this.rating = rating;
        this.genres = genres;
        this.desc = desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBanner(int banner) {
        this.banner = banner;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setGenres(String genres) { this.genres = genres; }

    public void setDesc(String desc) { this.desc = desc; }


    public String getName() {
        return name;
    }

    public int getBanner() {
        return banner;
    }

    public float getRating() {
        return rating;
    }

    public String getGenres() { return genres; }

    public String getDesc() { return desc; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.banner);
        dest.writeFloat(this.rating);
        dest.writeString(this.genres);
        dest.writeString(this.desc);
    }

    protected Movie(Parcel in) {
        this.name = in.readString();
        this.banner = in.readInt();
        this.rating = in.readFloat();
        this.genres = in.readString();
        this.desc = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
