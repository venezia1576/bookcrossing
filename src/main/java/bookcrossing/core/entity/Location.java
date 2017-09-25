package bookcrossing.core.entity;

/**
 * Created by User on 25.09.2017.
 */
// я пока не придумал как реализовать класс локации пользователя, поэтому сделал вот такой класс-заглушку.
public class Location extends EntitySuper {
    private String coordinates;

    public Location() {
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Location{");
        sb.append("coordinates='").append(coordinates).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
