/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance2;

import java.util.ArrayList;

public class App {
//    public String getGreeting() {
//        return "Hello World!";
//    }

    public static void main(String[] args) {
//        System.out.println(new App().getGreeting());
        System.out.println("hello");
        Restaurant2 restaurant2 = new Restaurant2("falafel restaurant","$$$$$");

//        restaurant2.addCategory("tomato ","5$ ");
//        restaurant2.addCategory("potato ","50$ ");
//        restaurant2.addCategory("falafel ","500$ ");


        restaurant2.addReview("I love the falafel222","mohammad33",5);
        restaurant2.addReview("I love the falafel","mohammad",4);
        restaurant2.addReview("I love the falafel222","mohammad33",5);
        restaurant2.addReview("I love the falafel","mohammad",8);

        ArrayList<String> movie =new ArrayList<>();

        Theater theater =new Theater("The old Theater",movie);
        theater.addNewMovie("fly");
//        theater.addNewMovie("fly2");
//        theater.addNewMovie("fly3");
        System.out.println(theater.getMovies());
        theater.addReview("I love the fly","mohammad jaradat 2",8);
        System.out.println(theater);
        System.out.println("------------------**");

        Shop shop =new Shop("mohammad shop","sells computer parts","$$$");
        shop.addReview("teh prices are good ","mohammad jaradat",1);
        System.out.println(shop);
        System.out.println("------------------**");

        System.out.println(restaurant2);
        System.out.println("\n ***** The new restaurant2 stars : "+ restaurant2.getStar1()+" ******");
    }

}
