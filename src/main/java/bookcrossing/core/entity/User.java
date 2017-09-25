package bookcrossing.core.entity;

import java.util.Date;
import java.util.List;
import java.util.SortedSet;

/**
 * Created by User on 25.09.2017.
 */
public class User extends People {
    private String nickname;
    private String email;
    private String password;
    private String phoneNumber;
    private boolean isOnline;
    private Date birthDate;
    private Date lastVisitedTime;
    private float rating;
    private SortedSet<Dialog> dialogList;
    private List<BookRecord> booksList;
    private List<BookRecord> rentedBooks;
    private Location location;

    public User() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append(super.toString());
        sb.append("nickname='").append(nickname).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", isOnline=").append(isOnline);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", lastVisitedTime=").append(lastVisitedTime);
        sb.append(", rating=").append(rating);
        sb.append(", dialogList=").append(dialogList);
        sb.append(", booksList=").append(booksList);
        sb.append(", rentedBooks=").append(rentedBooks);
        sb.append(", location=").append(location);
        sb.append('}');
        return sb.toString();
    }
}
