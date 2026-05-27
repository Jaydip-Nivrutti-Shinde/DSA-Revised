import java.util.Arrays;

public class ArrayDemo{
    public static void main(String[] args) {
        int[] arr1 = {1,5,3,6,0,5};
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        int[] arr2 = arr1; // shallow copy change in one affect other 
        int[] arr3 = Arrays.copyOf(arr1, arr1.length); // deep copy

        System.out.println(arr2);
        System.out.println(arr3);

        System.out.println(arr1);
    }
}
