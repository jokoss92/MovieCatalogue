package id.ac.mercubuana.joko_ss.moviecatalogue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDetail extends AppCompatActivity {
    TextView tvTitle;
    TextView tvDate;
    TextView tvOverview;
    TextView tvGenre;
    TextView tvRating;
    ImageView ivPoster;

    public String txtTitle;
    public String txtDate;
    public String txtOverview;
    public String txtGenre;
    public String txtRating;
    public int intPoster;

    public static final String EXTRA_MOVIE = "extra_movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_detail);

        tvTitle = findViewById(R.id.tv_title);
        tvDate = findViewById(R.id.tv_date);
        tvOverview = findViewById(R.id.tv_overview);
        tvGenre = findViewById(R.id.tv_genre);
        tvRating = findViewById(R.id.tv_rating);
        ivPoster = findViewById(R.id.iv_poster);

        getSupportActionBar().setTitle("Detail Movie");

        Movie movie = getIntent().getParcelableExtra(EXTRA_MOVIE);
        txtTitle = movie.getTitle();
        txtDate = movie.getDate();
        txtOverview = movie.getOverview();
        txtGenre = movie.getGenre();
        txtRating = movie.getRating();
        intPoster = movie.getPoster();

        tvTitle.setText(txtTitle);
        tvDate.setText(txtDate);
        tvOverview.setText(txtOverview);
        tvGenre.setText(txtGenre);
        tvRating.setText(txtRating);
        ivPoster.setImageResource(intPoster);
    }
}
