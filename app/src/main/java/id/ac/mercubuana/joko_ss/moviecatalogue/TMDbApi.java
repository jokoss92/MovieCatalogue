package id.ac.mercubuana.joko_ss.moviecatalogue;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TMDbApi {

    @GET("movie/popular")
    Call<MovieResponse> getPopularMovies(
      @Query("api_key") String apiKey,
      @Query("language") String language,
      @Query("page") int page
    );

    @GET("genre/movie/list")
    Call<GenresResponse> getGenres(
      @Query("api_key") String apiKey,
      @Query("language") String language
    );
}