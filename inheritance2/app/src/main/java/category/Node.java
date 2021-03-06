package category;

public class Node {
    private final String data;
    private final String price;
    private Node next;

    public Node(String data, String price) {
        this.data = data;
        this.price = price;
    }

    public String getData() {
        return data;
    }

    public String getPrice() {
        return price;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next =next;
    }
}
