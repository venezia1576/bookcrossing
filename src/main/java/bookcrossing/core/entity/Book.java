package bookcrossing.core.entity;

import java.sql.Blob;
import java.util.SortedSet;

/**
 * Created by User on 25.09.2017.
 */
public class Book extends EntitySuper{
    private Blob icon;
    private String title;
    private String synopsis;
    private SortedSet<Author> authors;

    public Book() {
    }

    public Blob getIcon() {
        return icon;
    }

    public void setIcon(Blob icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public SortedSet<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(SortedSet<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("icon=").append(icon);
        sb.append(", title='").append(title).append('\'');
        sb.append(", synopsis='").append(synopsis).append('\'');
        sb.append(", authors=").append(authors);
        sb.append('}');
        return sb.toString();
    }
}
