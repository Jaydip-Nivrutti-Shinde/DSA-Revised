package Sorting;

public class SelectionSort {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 ={4,3,5,4,6,2,9,6};
        
        for(int i=0;i<arr1.length-1;i++){
            int min = arr1[i];
            int idx=i;
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[j]<min){
                    min=arr1[j];
                    idx=j;
                }
            }
            int temp = arr1[idx];
            arr1[idx]=arr1[i];
            arr1[i] = temp;
            print(arr1);
        }

        print(arr1);
    }
}
