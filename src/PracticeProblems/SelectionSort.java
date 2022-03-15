package PracticeProblems;

public class SelectionSort {

    public static void main(String args[]){

        int array[] = {9,8,5,4,3,2,6,1};

        for(int i=0;i<array.length;i++){
            int ele = array[i];
            int minIndex = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<ele){
                    ele=array[j];
                    minIndex=j;
                }
            }

            if(ele<array[i]){
                int temp = array[i];
                array[i]=array[minIndex];
                array[minIndex]=temp;

            }



        }

        for(int k=0;k<array.length;k++){
            System.out.println(array[k]);
        }

    }


}
