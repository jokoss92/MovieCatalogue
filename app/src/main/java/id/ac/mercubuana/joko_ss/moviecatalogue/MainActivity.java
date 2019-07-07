package id.ac.mercubuana.joko_ss.moviecatalogue;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

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
    }


}
