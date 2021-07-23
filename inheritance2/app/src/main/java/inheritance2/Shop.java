package inheritance2;

public class Shop extends Review implements ToStringInterface , AddShopReview{
    private  String name;
    private  String description;
    private String category;

    public Shop(String name, String description, String category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Shop => " +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\n' +
                ", Review='" + newReview.toString()
                ;
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
