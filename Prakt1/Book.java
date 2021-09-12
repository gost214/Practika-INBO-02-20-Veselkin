package Prakt1;

public class Book {

        private String name;
        private int age;
        public Book(String n, int a){
            name = n;
            age = a;
        }
        public Book(String n){
            name = n;
            age = 0;
        }
        public Book(){
            name = "Name";
            age = 0;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public void setName (String name) {
            this.name = name;
        }
        public String getName(String name){
            return name;
        }
        public int getAge() {
            return age;
        }
        public String toString(){
            return this.name+this.age;
        }
        public void goOut(){
            System.out.println(name+" was written in "+age);
        }
}
