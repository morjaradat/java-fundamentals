package Restaurant;
import category.CategoryList;

import java.util.LinkedList;

public class Restaurant2  extends Review2{

    private final String name;
    private double star1;
    private static  CategoryList category = new CategoryList();


    public Restaurant2( String name) {
        super();
        this.name = name;
        this.star1 = 0;
    }

    public void setStar(double star) {
        this.star1 = star;
    }

    public void addCategory(String data,String price){
        category.addCategory(data,price);

    }

    @Override
    public String toString() {
        return "Restaurant2 => {" +
                "name = " + name + '\'' +
                ", star=" + star1 + "}\n" +
                ", { category='" + category.toString() + "}\n" +
                ", Reviews=" + newReview.toString() ;
    }
}
