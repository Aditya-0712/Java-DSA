package Arrays1;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        //Static allocation
        int[] arr = {5, 2, 8, 39, 10};

        //Print array as a list (will print the address only)
        System.out.println(Arrays.asList(arr));

        //sort the array
        Arrays.sort(arr);

        System.out.println("\nLength of the array = " + arr.length);

        //Dynamic allocation
        int[] arr2 = new int[6];

        for (int i=0; i<6; i++){
            arr2[i]=i+1;
        }

        for (int num: arr2){
            System.out.print(num + " ");
        }

        //multi-dimensional array
        int[][] arr3 = new int[4][5];

        for (int i=0; i<4; i++){
            for (int j=0; j<5; j++){
                arr3[i][j]=i+1;
            }
        }

        //jagged array
        int[][] arr4 = {{1}, {2, 3}, {4, 5, 6}};

        System.out.println("\n\nJagged array");
        for (int[] temp: arr4){
            System.out.println();
            for (int num: temp){
                System.out.print(num + " ");
            }
        }
    }
}