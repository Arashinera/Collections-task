package app;

public class User {

    private final String userName;
    private final String email;
    private final int number;

    public User(String userName, String email, int number) {
        this.userName = userName;
        this.email = email;
        this.number = number;
    }

    @Override
    public String toString() {
        return "\nUser №" + number + "\nUser name : " + userName + "\nUser email : " + email;
    }
}
