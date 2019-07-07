package id.ac.mercubuana.joko_ss.moviecatalogue;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private String[] dataTitle;
    private String[] dataDate;
    private String[] dataGenre;
    private String[] dataRating;
    private String[] dataOverview;
    private TypedArray dataPoster;
    private MoviesAdapter adapter;
    private ArrayList<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Movie Catalogue");
        adapter = new MoviesAdapter(this);
        ListView listView = findViewById(R.id.lv_movies);
        listView.setAdapter(adapter);

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent detailMovieIntent = new Intent(MainActivity.this, MovieDetail.class);
                detailMovieIntent.putExtra(MovieDetail.EXTRA_MOVIE, movies.get(i));
                startActivity(detailMovieIntent);
            }
        });

    }

    private void addItem(){
        movies = new ArrayList<>();
        for(int i = 0; i < dataTitle.length; i++){
            Movie movie = new Movie();
            movie.setPoster(dataPoster.getResourceId(i, -1));
            movie.setTitle(dataTitle[i]);
            movie.setDate(dataDate[i]);
            movie.setGenre(dataGenre[i]);
            movie.setRating(dataRating[i]);
            movie.setOverview(dataOverview[i]);
            movies.add(movie);

        }
        adapter.setMovies(movies);

    }

    private void prepare(){
        dataTitle = getResources().getStringArray(R.array.data_title);
        dataDate = getResources().getStringArray(R.array.data_date);
        dataPoster = getResources().obtainTypedArray(R.array.data_poster);
        dataGenre = getResources().getStringArray(R.array.data_genre);
        dataRating = getResources().getStringArray(R.array.data_rating);
        dataOverview = getResources().getStringArray(R.array.data_overview);
    }


}
