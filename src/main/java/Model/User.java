package Model;

public class User {

    String firstName;
    String lasteName;
    int birthDate;
    String email;
    String password;


    public User(String firstName, String lasteName, int birthDate, String email, String password) {
        this.firstName = firstName;
        this.lasteName = lasteName;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasteName() {
        return lasteName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLasteName(String lasteName) {
        this.lasteName = lasteName;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lasteName='" + lasteName + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
