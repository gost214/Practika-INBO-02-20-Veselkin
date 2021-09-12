package Pract2;

public class Author {
    private String name;
    private String email;
    private char gender;


    public Author(String a, String e, char g) {
        name= a;
        email = e;
        gender = g;
        char c= 'M';
        char  c1='F';
        char c2='U';

    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {


        return gender;
    }

    public String toString() {
        return "Author " +
                "name='" + name + '\'' +
                ",gender='" + gender+ '\'' + "email='" + email + '\'';
    }
}
