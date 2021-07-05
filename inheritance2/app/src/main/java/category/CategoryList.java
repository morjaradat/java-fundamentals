package category;

public class CategoryList {
    private  Node head;

    public void addCategory(String data,String price){
        Node node = new Node(data,price);
        if (this.head == null){
            this.head = node;
            return;
        }
        Node current = this.head;
        while (current.getNext() != null){
            current =current.getNext();
        }
        current.setNext(node);
    }
    public String toString(){
        Node current =this.head;
        if (current == null){
            return "category list is empty";
        }
        StringBuilder showList= new StringBuilder();
        showList.append("{");
        while (current != null){
            showList.append(" name => ").append(current.getData()).append(" & price => ").append(current.getPrice()).append(" || \n ");
            current=current.getNext();
        }
        showList.append("}");
        return showList.toString();
    }
}
