package Restaurant;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Restaurant extends ReviewClass {
    private final String Name;
    private double Stars;
    private String price;

//    private final List<Double>numberOfStars=new ArrayList();
//    private static final LinkedList category = new LinkedList();

//    public Restaurant(String name) {
//        this.Name = name;
//    }


    public Restaurant( String name, double stars, String price) {
        super(body, author, Star);
        Name = name;
        Stars = stars;
        this.price = price;
    }
    public String getName() {
        return Name;
    }

    public double getStars() {
        return Stars;
    }

    public void setStars(double stars) {
        Stars = stars;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Object addReview(String bodyContact, String authorName, double Star){
        this.body=body;
        this.author=author;
         this.Star=Star;
         return null;
    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "Name='" + Name + '\'' +
                ", Stars=" + Stars +
                ", price=" + price +
                '}';
    }
    //    public String toString() {
//        return " Restaurant name : " + this.getName() + "|  Stars :  " +this.getNumberOfStars() + "and the priceCategory is "+category.toString();
////                + this.getPriceCategory();
//    }
////    + this.getNumberOfStars()
//
//
//
//    public double getNumberOfStars() {
//        if (this.numberOfStars.size()==0){
//            return 0;
//        }
//        double sum =0;
//        double avg=0;
//        for (int i = 0; i <this.numberOfStars.size() ; i++) {
//            sum += this.numberOfStars.get(i);
//        }
//        avg=sum/this.numberOfStars.size();
//
//        return avg;
//    }
//
//    public void setNewStarReview(double numberOfStars) {
//        this.numberOfStars.add(numberOfStars);
//    }
//
//    public static LinkedList getCategory() {
//        return category;
//    }
//
//    public static void setLinkedList(String data, double price) {
//        category.add(Integer.parseInt(data), price);
//    }

}
