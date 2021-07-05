package review;

import category.Node;

public class ReviewList {
    private ReviewNode head;

    public boolean addNewReview(String body, String author, double stars) {
        ReviewNode reviewNode = new ReviewNode(body, author, stars);
        if (this.head == null) {
            this.head = reviewNode;
            return true;
        }
        boolean authorNotExist = true;
        ReviewNode current = this.head;
        while (current.getNext() != null) {
            current = current.getNext();
            if (current.getAuthor() == author) {
                authorNotExist = false;
            }
        }
        if (authorNotExist) {
            current.setNext(reviewNode);
            return true;
        }
        return false;
    }
    public String toString(){
        ReviewNode current =this.head;
        if (current == null){
            return "Review list is empty";
        }
        StringBuilder showList= new StringBuilder();
        showList.append("{");
        while (current != null){
            showList.append(" body => ").append(current.getBody()).append(" | author => ").append(current.getAuthor()).append(" | Review Star =>").append(current.getStar()).append(" || ");
            current=current.getNext();
        }
        showList.append("}");
        return showList.toString();
    }

}
