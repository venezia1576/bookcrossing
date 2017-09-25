package bookcrossing.core.entity;

import java.util.Date;

/**
 * Created by User on 25.09.2017.
 */
public class BookRecord extends EntitySuper {
    private long bookId;
    private long userHolderId;
    private String description;
    private Date rentTime;
    private float shabbinessStatus;

    public BookRecord() {
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getUserHolderId() {
        return userHolderId;
    }

    public void setUserHolderId(long userHolderId) {
        this.userHolderId = userHolderId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRentTime() {
        return rentTime;
    }

    public void setRentTime(Date rentTime) {
        this.rentTime = rentTime;
    }

    public float getShabbinessStatus() {
        return shabbinessStatus;
    }

    public void setShabbinessStatus(float shabbinessStatus) {
        this.shabbinessStatus = shabbinessStatus;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BookRecord{");
        sb.append("bookId=").append(bookId);
        sb.append(", userHolderId=").append(userHolderId);
        sb.append(", description='").append(description).append('\'');
        sb.append(", rentTime=").append(rentTime);
        sb.append(", shabbinessStatus=").append(shabbinessStatus);
        sb.append('}');
        return sb.toString();
    }
}
