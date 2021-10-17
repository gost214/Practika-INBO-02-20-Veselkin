package Pract6;


import java.util.*;
public class SortingStudentByGPA {
    static class Student {
        private String name;
        private int Score;

        public Student(String name, int Score) {
            this.name = name;
            this.Score = Score;
        }

        String getName() {
            return name;
        }

        int getScore() {
            return Score;
        }
    }

    static class SComparator implements Comparator<Student> {
        public int compare(Student Student1, Student Student2) {
            if (Student1.getScore() < Student2.getScore()) {
                return 1;
            } else if (Student1.getScore() > Student2.getScore()) {
                return -1;
            } else {
                return 0;
            }
        }
    }


        public static void main(String[] args) {
            Comparator<Student> S = new SComparator();
            TreeSet<Student> SBal = new TreeSet<Student>(S);
            SBal.add(new Student("Сергей", 3));
            SBal .add(new Student("Василий", 2));
            SBal .add(new Student("Иван", 5));
            for (Student Students : SBal ) {
                System.out.printf("%s: %d\n", Students.getName(), Students.getScore());
            }
        }



}