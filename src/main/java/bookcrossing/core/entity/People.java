package bookcrossing.core.entity;

import java.sql.Blob;

/**
 * Created by User on 24.09.2017.
 */
public abstract class People extends EntitySuper {
    private Blob avatar;
    private String firstName;
    private String lastName;
    private Gender gender;

    public People() {
    }

    public Blob getAvatar() {
        return avatar;
    }

    public void setAvatar(Blob avatar) {
        this.avatar = avatar;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append("avatar=").append(avatar);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", gender=").append(gender);
        return sb.toString();
    }

    public enum Gender {
        MALE(0), FEMALE(1);
        private int id;

        Gender(final int id) {
            this.id = id;
        }
    }
}
