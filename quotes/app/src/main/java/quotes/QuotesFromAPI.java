package quotes;

public class QuotesFromAPI {
    private String quoteText;
    private String quoteAuthor;

    public QuotesFromAPI(String quoteText, String quoteAuthor) {
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }
}
