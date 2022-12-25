package JavaTask3.model;

public class Book {
    private String title;
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    private String author;

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + "]";
    }
}
