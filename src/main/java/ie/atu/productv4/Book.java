package ie.atu.productv4;

public class Book extends Product {

    private String author;
    protected static int count = 0;

    public Book() {
        super();
        author = "";
        count++;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public static int getCount() {
        return count;
    }



    @Override
    public String toString() {
        return super.toString() + " by " + author;
    }
}
