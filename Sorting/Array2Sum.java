package Sorting;
import java.util.Arrays;

public class Array2Sum {
    public static void main(String[] args) {
        int[] arr1 ={4,3,5,4,6,2,9,6};
        Arrays.sort(arr1);
        for(int ele:arr1){
            System.out.print(ele+" ");
        }
        System.out.println();
        int i=0, j=arr1.length-1, target=50;
        while (i < j) {
            if (arr1[i]+arr1[j]==target) {
                System.out.println("Found");
                return;
            }else if(arr1[i]+arr1[j]<target){
                i++;
            }else{
                j--;
            }
        }
        System.out.println("Not Found");

    }
}
