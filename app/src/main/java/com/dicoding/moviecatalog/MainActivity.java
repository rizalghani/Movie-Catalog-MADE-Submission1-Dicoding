package com.dicoding.moviecatalog;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.dicoding.moviecatalog.adapter.MovieAdapter;
import com.dicoding.moviecatalog.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Movie> movies;
    private MovieAdapter adapter;
    private RecyclerView listMovie;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listMovie = findViewById(R.id.list_Movie);

        //1. get Function
        movieData();

        //2. layout manager.
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listMovie.setLayoutManager(linearLayoutManager);

        //3. declare adapter
        adapter = new MovieAdapter(movies);

        //4. show data
        listMovie.setAdapter(adapter);

    }

    private void movieData() {
        movies = new ArrayList<>();
        movies.add(new Movie("Bumblebee", R.drawable.poster_bumblebee, 9.0f,"Action, Adventure, Science Fiction","On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-s"));
        movies.add(new Movie("Aquaman", R.drawable.poster_aquaman, 4.5f,"Action, Adventure, Fantasy","Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne."));
        movies.add(new Movie("Bird Box", R.drawable.poster_birdbox, 5.5f, "Thriller, Drama","Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety."));
        movies.add(new Movie("Creed", R.drawable.poster_creed, 6.5f,"Drama","Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life."));
        movies.add(new Movie("Once Upon a Deadpool", R.drawable.poster_deadpool, 7f,"Comedy, Action","Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boy's life."));
        movies.add(new Movie("A Star is born", R.drawable.poster_a_star, 8.5f,"Drama, Romance, Music","Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons."));
        movies.add(new Movie("Bohemian", R.drawable.poster_bohemian, 7.5f,"Drama, Music","Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess."));
        movies.add(new Movie("How to Train Your Dragon", R.drawable.poster_dragon, 9f,"Fantasy, Adventure, Animation, Family","As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind."));
        movies.add(new Movie("Dragon Ball", R.drawable.poster_dragonball, 8.5f,"Comedy, Sci-fi, Fantasy, Animation, Action, Adventure","A retelling of Dragon Ball's origin with a different take on the meeting of Goku, Bulma, and Kame-Sen'nin. It also retells the Red Ribbon Army story; but this time they find Goku rather than Goku finding them."));
        movies.add(new Movie("Glass", R.drawable.poster_glass, 7.5f,"Thriller, Drama, Science Fiction","In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men."));
        movies.add(new Movie("Hunter Killer", R.drawable.poster_hunterkiller, 6f,"Action, Thriller","Captain Glass of the USS Arkansas discovers that a coup d'état is taking place in Russia, so he and his crew join an elite group working on the ground to prevent a war."));
        movies.add(new Movie("Mary Poppins Returns", R.drawable.poster_marrypopins, 6.5f,"Fantasy, Comedy, Family","In Depression-era London, a now-grown Jane and Michael Banks, along with Michael's three children, are visited by the enigmatic Mary Poppins following a personal loss. Through her unique magical skills, and with the aid of her friend Jack, she helps the family rediscover the joy and wonder missing in their lives."));
        movies.add(new Movie("Mortal engines", R.drawable.poster_mortalengine, 8.5f,"Adventure, Fantasy","Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever."));
        movies.add(new Movie("Robinhood", R.drawable.poster_robinhood, 8f,"Action, Drama","This is a story of a brave man who fought and won against all odds, Sarpanch Rupinder Singh Gandhi, a prolific sportsman, daring leader and true friend. This movie shows how circumstances and situations converts him into Something -else when he and his friends take decisions that end up making them Outlaws. The man who lived for other people and never worried what he was called Robinhood or a Gangser"));
        movies.add(new Movie("Spiderman", R.drawable.poster_spiderman, 6.5f,"Action, Adventure, Science Fiction, Comedy, Romance","Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to rest - Peter will have to agree to help Nick Fury uncover the mystery of creatures that cause natural disasters and destruction throughout the continent."));
        movies.add(new Movie("The Girl", R.drawable.poster_thegirl, 5f,"Action, Crime, Thriller","In Stockholm, Sweden, hacker Lisbeth Salander is hired by Frans Balder, a computer engineer, to retrieve a program that he believes it is too dangerous to exist."));
        movies.add(new Movie("Venom", R.drawable.poster_venom, 9.5f,"Science Fiction, Action","Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own."));
    }
}
