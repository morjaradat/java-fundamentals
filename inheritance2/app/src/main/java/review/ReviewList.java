package review;

public class ReviewList {
    private ReviewNode head;

    public boolean addNewReview(String body, String author, double stars) {

        ReviewNode current = this.head;

        boolean authorNotExist = true;

        while (current != null) {
//            System.out.println(current.getAuthor());
            if (current.getAuthor() == author) {
//                System.out.println(current.getAuthor());
                authorNotExist = false;
                break;
            }
            current = current.getNext();
        }

        ReviewNode reviewNode = new ReviewNode(body, author, stars);
        if (authorNotExist) {
            if (this.head == null) {
                this.head = reviewNode;
                return true;
            }
              current=this.head;
            while (current.getNext()!= null){
                current =current.getNext();
            }
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
