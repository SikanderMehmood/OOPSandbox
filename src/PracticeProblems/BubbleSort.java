package PracticeProblems;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String args[])
    {
        int array[] = {9,8,7,6,5,4,3,2,1,0};

        for(int i=0;i<array.length-1;i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    int x = array[j+1];
                    array[j+1] = array[j];
                    array[j] = x;
                }
            }

        }

        for(int k=0;k<array.length;k++){
            System.out.print(array[k]);
        }

    }


}
