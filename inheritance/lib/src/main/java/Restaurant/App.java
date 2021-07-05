package Restaurant;

import Restaurant.Restaurant;
import review.ReviewList;

public class App {
    public static void main(String[] args) {
//        ReviewList mc =new ReviewList();
//         System.out.println("hello mmm");
          Restaurant2 restaurant2 = new Restaurant2("falafel restaurant");

          restaurant2.addCategory("tomato ","5$ ");
          restaurant2.addCategory("potato ","50$ ");
          restaurant2.addCategory("falafel ","500$ ");

          restaurant2.addReview("I love the falafel","mohammad",4);
          restaurant2.addReview("I love the falafel222","mohammad33",5);
        restaurant2.addReview("I love the falafel222","mohammad33",5);

        System.out.println(restaurant2.toString());





//        System.out.println(restaurant2.toString());


//        Review2 review2 = new Review2("new comment ");


    }
}
/*
//
//        Restaurant2 review2= new Review2("testing review","2$ berger","I love it","Mohammad",4.5);
//        System.out.println(review2.toString());

//        Restaurant falafel = new Restaurant("falafel",5,"free");
//
//        ReviewClass comment = new ReviewClass("its the best11111", "1231564", 5);
//
//        ReviewClass comment2 = new ReviewClass("its the best22222", "5555", 2);
//
//        falafel.addReview("its the best","me1",3);
//        System.out.println(falafel.reviewToString());
//        System.out.println(
//             "Name : "+ falafel.getName() +" | "+ " star : "+ falafel.getStars() +" | "+ "price "+ falafel.getPrice() +" | Review " + falafel.getBody()+ " " +falafel.getAuthor()+" " +falafel.getStar()
//        );
    }
}

 */
