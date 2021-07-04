package review;

public class ReviewList {
    private ReviewNode head;

    public void addCategory(String body, String author, double stars) {
        ReviewNode reviewNode = new ReviewNode(body, author, stars);
        if (this.head == null) {
            this.head = reviewNode;
            return;
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
        }
    }

}
