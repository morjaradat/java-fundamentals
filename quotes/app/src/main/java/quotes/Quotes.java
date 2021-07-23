package quotes;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Quotes {
    private final String author;
    private final String text;


    public Quotes(String author, String text) {
        this.author = author;
        this.text = text;

    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }


}
