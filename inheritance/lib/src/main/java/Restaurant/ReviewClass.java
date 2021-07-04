package Restaurant;

import java.util.LinkedList;

public class ReviewClass implements Review {
    protected static String body;
    public static String author;
    public  static double Star;

//    private static final LinkedList review = new LinkedList();


    public ReviewClass(String body, String author, double star) {
        ReviewClass.body = body;
        ReviewClass.author = author;
        Star = star;
    }

    public String getBody() {
//        System.out.println(body);
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return  ReviewClass.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getStar() {
        return Star;
    }

    public void setStar(double star) {
        Star = star;
    }


    public String reviewToString() {
        return "ReviewClass{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", Star=" + Star +
                '}';
    }
    //    public void setNewStarReview(double numberOfStars) {
//        super.setNewStarReview(numberOfStars);
//    }

}
