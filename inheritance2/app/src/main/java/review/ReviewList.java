package review;

public class ReviewList {
    private ReviewNode head;

    public boolean addNewReview(String body, String author, double stars) {
        ReviewNode current = this.head;
        boolean authorNotExist = true;
        while (current != null) {
            if (current.getAuthor() == author) {
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

    public boolean addNewMovieReview(String movieName,String body, String author, double stars) {
        ReviewNode current = this.head;
        boolean authorNotExist = true;
        while (current != null) {
            if (current.getAuthor().equals(author)) {
                authorNotExist = false;
                break;
            }
            current = current.getNext();
        }

        ReviewNode reviewNode = new ReviewNode(movieName,body, author, stars);
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
        } else if (current.getMovieName()==null){
            StringBuilder showList= new StringBuilder();
            showList.append("{");
            while (current != null){
                showList.append(" body => ").append(current.getBody()).append(" | author => ").append(current.getAuthor()).append(" | Review Star => ").append(current.getStar()).append(" || ");
                current=current.getNext();
            }
            showList.append("}");
            return showList.toString();
        }else {
            StringBuilder showList= new StringBuilder();
            showList.append("{");
            while (current != null){
                showList.append(" movieName=> ").append(current.getMovieName()).append(" | body => ").append(current.getBody()).append(" | author => ").append(current.getAuthor()).append(" | Review Star => ").append(current.getStar()).append(" || ");
                current=current.getNext();
            }
            showList.append("}");
            return showList.toString();
        }

    }

}
