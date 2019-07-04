package id.ac.mercubuana.joko_ss.moviecatalogue;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {

    @NonNull
    @Override
    public MoviesAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesAdapter.MovieViewHolder movieViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 50;
    }

    class MovieViewHolder extends RecyclerView.ViewHolder{
        public MovieViewHolder(View itemView){
            super(itemView);
        }
    }
}
