package PracticeProblems;

public class InsertionSort {


    public static void main(String args[]){

        int array[]={9,8,7,6,5,4,3,2,1};

        for(int i=1;i<array.length;i++){
            int k=array[i];
            int j=i-1;
           while (j>=0 && k<array[j]){
               int temp = array[j];
               array[j]=array[j+1];
               array[j+1]=temp;
               j--;
           }

        }
for(int i=0;i<array.length;i++) {
    System.out.println(array[i]);
}


    }


}
