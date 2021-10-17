package Pract6;
import java.util.Arrays;

public class Student {
    public static  void insertionSort(int[] m, int a, int b)
    {
        for (int i = 1; i < m.length; i++) {
            int current = m[i];
            int j = i;
            while (j > 0 && m[j - 1] > current) {
                m[j] = m[j - 1];
                j--;
            }
            m[j] = current;
        }
    }
    public static void main(String[] args) {
        int[] IDNumbers = { 128, 10, 342, 223, 678, 676, 11, 12 };
        System.out.println("Было");
        System.out.println(Arrays.toString(IDNumbers));

        int low = 0;
        int high = IDNumbers.length-1;

        insertionSort(IDNumbers, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(IDNumbers));
    }

}
