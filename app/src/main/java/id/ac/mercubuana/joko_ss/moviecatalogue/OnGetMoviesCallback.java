package id.ac.mercubuana.joko_ss.moviecatalogue;

import java.util.List;

public interface OnGetMoviesCallback {

    void onSuccess(List<Movie> movies);

    void onError();
}
