public class Movie {

    private String title;
    private String genre;
    private String rating;
    private String showtimes;

    
    public Movie(String title, String genre, String rating, String showtimes) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.showtimes = showtimes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    // Method to display movie details
    public void displayMovieInfo() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Showtime: " + showtimes);
    }

}
