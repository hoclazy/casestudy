package model;

public class Staff {
    private String username;
    private String pass;
    private String name;
    private int money = 25000000;

    public Staff() {
    }

    public Staff(String username, String pass, String name) {
        this.username = username;
        this.pass = pass;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "username='" + username + '\'' +
                ", pass='" + pass + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
