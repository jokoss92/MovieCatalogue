package id.ac.mercubuana.joko_ss.moviecatalogue;


import android.os.Parcel;
import android.os.Parcelable;


public class Movie implements Parcelable {
    private int poster;
    private String title;
    private String date;
    private String overview;
    private String genre;
    private String rating;

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public static Creator<Movie> getCREATOR() {
        return CREATOR;
    }

    public Movie(){}

    protected Movie(Parcel in) {
        poster = in.readInt();
        title = in.readString();
        date = in.readString();
        overview = in.readString();
        genre = in.readString();
        rating = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.poster);
        dest.writeString(this.title);
        dest.writeString(this.date);
        dest.writeString(this.overview);
        dest.writeString(this.genre);
        dest.writeString(this.rating);
    }
}
