package Restaurant;

import Restaurant.Restaurant;
import review.ReviewList;

public class App {
    public static void main(String[] args) {
//        ReviewList mc =new ReviewList();

        Restaurant falafel = new Restaurant("falafel",5,"free");

        ReviewClass comment = new ReviewClass("its the best11111", "1231564", 5);

        falafel.addReview("its the best","me1",3);
        System.out.println(falafel.reviewToString());
        System.out.println(
             "Name : "+ falafel.getName() +" | "+ " star : "+ falafel.getStars() +" | "+ "price "+ falafel.getPrice() +" | Review " + falafel.getBody()+ " " +falafel.getAuthor()+" " +falafel.getStar()
        );
    }
}
