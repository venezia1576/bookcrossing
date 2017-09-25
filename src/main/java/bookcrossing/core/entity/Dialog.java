package bookcrossing.core.entity;

import java.util.List;
import java.util.SortedSet;

/**
 * Created by User on 25.09.2017.
 */
public class Dialog extends EntitySuper{
    private long dialogOwnerId;
    private String title;
    private SortedSet<User> members;
    private List<Message> messages;

    public Dialog() {
    }

    public long getDialogOwnerId() {
        return dialogOwnerId;
    }

    public void setDialogOwnerId(long dialogOwnerId) {
        this.dialogOwnerId = dialogOwnerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SortedSet<User> getMembers() {
        return members;
    }

    public void setMembers(SortedSet<User> members) {
        this.members = members;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dialog{");
        sb.append("dialogOwnerId=").append(dialogOwnerId);
        sb.append(", title='").append(title).append('\'');
        sb.append(", members=").append(members);
        sb.append(", messages=").append(messages);
        sb.append('}');
        return sb.toString();
    }
}
