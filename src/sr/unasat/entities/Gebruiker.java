package sr.unasat.entities;

public class Gebruiker {
    private String username;
    private String password;
    private boolean isSubscribed;

    public Gebruiker(String username, String password, boolean isSubscribed) {
        this.username = username;
        this.password = password;
        this.isSubscribed = isSubscribed;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getIsSubscribed() {
        return isSubscribed;
    }

    public void setIsSubscribed(boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    @Override
    public String toString() {
        return "Gebruiker{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isSubscribed='" + isSubscribed + '\'' +
                '}';
    }

}
