package pract9;

public class Student {
    private String name;
    private int INN;
    Student(String name, int INN){
        this.name=name;
        this.INN=INN;
    }
    public void setINN(int INN) {
        this.INN = INN;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getINN(){
        return INN;
    }
    public String toString(){
        return "Name: "+name+" INN: "+INN;
    }
}