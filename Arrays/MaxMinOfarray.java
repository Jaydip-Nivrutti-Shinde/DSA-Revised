public class MaxMinOfarray {
    public static void MaxMin(int[] arr){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }

         System.out.println("Max is: "+ max);
         System.out.println("Min is: "+ min);

    }
    public static void main(String[] args) {
        int[] arr1 = {1,-2,3,4,-5};
        MaxMin(arr1);         
    }
}
