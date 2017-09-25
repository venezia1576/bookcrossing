package bookcrossing.core.entity;


import java.util.List;

/**
 * Created by User on 25.09.2017.
 */
public class Author extends People {
    private String bio;
    private List<Book> bookList;

    public Author() {
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Author{");
        sb.append("bio='").append(bio).append('\'');
        sb.append(", bookList=").append(bookList);
        sb.append('}');
        return sb.toString();
    }
}
