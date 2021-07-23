package review;

public class ReviewNode {
    private final String body;
    private final String author;
    private String movieName;
    private final double star;
    private ReviewNode next;

    public ReviewNode(String body, String author, double star) {
        this.body = body;
        this.author = author;
        this.star = star;
    }

    public ReviewNode(String movieName,String body, String author, double star) {
        this.body = body;
        this.author = author;
        this.star = star;
        this.movieName=movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public double getStar() {
        return star;
    }

    public ReviewNode getNext(){
        return next;
    }
    public void setNext(ReviewNode next){
        this.next =next;
    }
}
