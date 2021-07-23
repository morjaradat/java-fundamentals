package inheritance2;
import category.CategoryList;

public class Restaurant extends Review implements ToStringInterface , AddRestaurantReview {

    private final String name;
    private int star1;
    private static  CategoryList category = new CategoryList();
    private String categoryPrice;

    public Restaurant(String name, String categoryPrice) {
        super();
        this.name = name;
        this.star1 = 0;
        this.categoryPrice=categoryPrice;
    }

    public String getCategoryPrice() {
        return categoryPrice;
    }

    public void setCategoryPrice(String categoryPrice) {
        this.categoryPrice = categoryPrice;
    }

    public void setStar(int star) {
        this.star1 = star;
    }

    public void addCategory(String data,String price){
        category.addCategory(data,price);

    }

    public String getName() {
        return name;
    }

    public double getStar1() {
        return star1;
    }

    public static CategoryList getCategory() {
        return category;
    }

    @Override
    public String toString() {
        int ss= getReviewStar();
       setStar(ss);
//        System.out.println("this is ss : " +ss);
        if (star1 ==0) return "Restaurant => { name = " + name +" , star=" + star1 + "}";
        else
        return "Restaurant2 => {" +
                "name = " + name + '\'' +
                ", star=" + getStar1() + "}\n" +
                " category='" + getCategoryPrice() + "\n" +
                " Reviews=" + newReview.toString() ;
    }

    @Override
    public void addReview(String body, String author, int star) {
        boolean addNewReview = newReview.addNewReview(body,author,star);
//        System.out.println(addNewReview);
        if (addNewReview){
//           System.out.println("star");
//           System.out.println("---------");
            setReviewStar(star);
        }

    }

}
