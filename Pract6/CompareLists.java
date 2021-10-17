package Pract6;

public class CompareLists{
    public static void compareSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];

            int min_i = i;

            for (int j = i+1; j < arr.length; j++) {

                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int [] Student= {1,4,8,774,947};
        int [] iDNumber= {1,6,5,321,64,876,324,12,345,86};
        compareSort(iDNumber);
        for(int i = 0; i< iDNumber.length; i++) {
            System.out.println(iDNumber[i]);
        }
    }
}