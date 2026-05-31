package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr1 ={1,5,2,3,7,9,0,5,6};
        for(int i=1;i<arr1.length;i++){
            int j=i-1;
            while (j>=0 && arr1[j+1]< arr1[j]) {
                int temp = arr1[j+1];
                arr1[j+1] = arr1[j];
                arr1[j]=temp;
                j--;
            }
            for(int ele:arr1){
            System.out.print(ele+" ");
        }
        System.out.println();
        }
        
    }
}
