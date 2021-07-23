package inheritance2;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Review implements ToStringInterface ,AddTheaterReview{
    private String name;
    private ArrayList<String> movies;

    public Theater(String name, ArrayList<String> movies) {
        this.name = name;
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMovies() {
        return this.movies;
    }

    public void addNewMovie(String data) {
        movies.add(data);
    }

    public void removeMovie(String data){
        movies.remove(movies.indexOf(data));
    }

//    @Override
//    public String toString() {
//        return "Theater{" +
//                ", name='" + name + '\'' +
//                ", movies=" + movies + '\'' +
//                "newReview=" + newReview.toString() +
//                '}';
//    }


    @Override
    public String toString() {
        return "Theater => " +
                " name='" + name + '\n' +
                "newReview=" + newReview.toString() + '\n' +
                "movies=" + movies + '\n'
                ;
    }

    @Override
    public void addReview(String movieName, String body, String author, int star) {
        boolean addNewReview = newReview.addNewMovieReview(movieName,body,author,star);
//        System.out.println(addNewReview);
        if (addNewReview){
//           System.out.println("star");
//           System.out.println("---------");
            setReviewStar(star);
        }
    }
}
