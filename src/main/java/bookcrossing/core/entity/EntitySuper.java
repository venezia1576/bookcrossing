package bookcrossing.core.entity;

/**
 * Created by User on 24.09.2017.
 */
public abstract class EntitySuper {
    private long id;

    public EntitySuper() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
