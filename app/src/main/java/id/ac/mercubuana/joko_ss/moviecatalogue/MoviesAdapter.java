package id.ac.mercubuana.joko_ss.moviecatalogue;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;

import java.util.ArrayList;


public class MoviesAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Movie> movies;

    public MoviesAdapter(Context context) {
        this.context = context;
        movies = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int i) {
        return movies.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       if(view == null){
           view = LayoutInflater.from(context).inflate(R.layout.item_movie, viewGroup, false);
       }

        ViewHolder viewHolder = new ViewHolder(view);
        Movie movie = (Movie) getItem(i);
        viewHolder.bind(movie);
        return view;
    }

    private class ViewHolder{
        private TextView txtTitle;
        private TextView txtOverview;
        private TextView txtRating;
        private TextView txtGenre;
        private TextView txtDate;
        private ImageView imgPoster;

        ViewHolder(View view){
            txtTitle = view.findViewById(R.id.tv_title);
            txtOverview = view.findViewById(R.id.tv_overview);
            txtRating = view.findViewById(R.id.tv_rating);
            txtGenre = view.findViewById(R.id.tv_genre);
            txtDate = view.findViewById(R.id.tv_date);
            imgPoster = view.findViewById(R.id.iv_poster);
        }

        void bind(Movie movie){
            txtTitle.setText(movie.getTitle());
            txtOverview.setText(movie.getOverview());
            txtRating.setText(movie.getRating());
            txtGenre.setText(movie.getGenre());
            txtDate.setText(movie.getDate());
            imgPoster.setImageResource(movie.getPoster());
        }
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }
}
