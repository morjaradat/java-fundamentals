package review;

public class ReviewNode {
    private final String body;
    private final String author;
    private final double star;
    private ReviewNode next;

    public ReviewNode(String body, String author, double star) {
        this.body = body;
        this.author = author;
        this.star = star;
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
