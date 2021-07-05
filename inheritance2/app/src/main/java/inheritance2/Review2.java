package inheritance2;

import review.ReviewList;

public class Review2  {
    private String body;
    private String author;
    private int reviewStar;

    ReviewList newReview = new ReviewList();


    public Review2( String body, String author, int reviewStar) {
        this.body=body;
        this.author=author;
        this.reviewStar=reviewStar;
         addReview(body,author,reviewStar);
    }

    public Review2() {

    }


    public void addReview(String body, String author, int star) {
       boolean addNewReview = newReview.addNewReview(body,author,star);
        System.out.println(addNewReview);
       if (addNewReview){
           System.out.println("star");
           System.out.println("---------");
           setReviewStar(star);
       }else{
           System.out.println("No star");
           System.out.println("---------");
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

    public int getReviewStar() {
        return (int) reviewStar;
    }

    public void setReviewStar(int reviewStar) {
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
