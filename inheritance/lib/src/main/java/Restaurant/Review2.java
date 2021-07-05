package Restaurant;

import review.ReviewList;

public class Review2  {
    private String body;
    private String author;
    private double reviewStar;

    ReviewList newReview = new ReviewList();


    public Review2( String body, String author, double star) {
         addReview(body,author,star);
    }

    public Review2() {

    }


    public void addReview(String body, String author, double star) {
       boolean addNewReview = newReview.addNewReview(body,author,star);
       if (addNewReview){
           setReviewStar(star);
       }
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getReviewStar() {
        return reviewStar;
    }

    public void setReviewStar(double reviewStar) {
        this.reviewStar = reviewStar;
    }

    public ReviewList getNewReview() {
        return newReview;
    }

    public void setNewReview(ReviewList newReview) {
        this.newReview = newReview;
    }

    @Override
    public String toString() {
        return "Review2{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", reviewStar =" + reviewStar +
                '}';
    }
}
