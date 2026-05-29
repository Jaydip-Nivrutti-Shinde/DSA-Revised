package Sorting;

public class CheckSorted {
    public static boolean isOrNot(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {0,0,0,1,2,2,6,5};
        System.out.println(isOrNot(arr1));
    }
}
