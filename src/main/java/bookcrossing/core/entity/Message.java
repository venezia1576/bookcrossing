package bookcrossing.core.entity;

import java.util.Date;

/**
 * Created by User on 25.09.2017.
 */
public class Message extends EntitySuper{
    private long senderId;
    private long dialogId;
    private String content;
    private Date sendTime;
    private boolean isRead;

    public Message() {
    }

    public long getSenderId() {
        return senderId;
    }

    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    public long getDialogId() {
        return dialogId;
    }

    public void setDialogId(long dialogId) {
        this.dialogId = dialogId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Message{");
        sb.append("senderId=").append(senderId);
        sb.append(", dialogId=").append(dialogId);
        sb.append(", content='").append(content).append('\'');
        sb.append(", sendTime=").append(sendTime);
        sb.append(", isRead=").append(isRead);
        sb.append('}');
        return sb.toString();
    }
}
