public class MissingInArray {
    public static void main(String[] args) {
        int[] arr1 = {1,4,3,5};
        int max=Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<arr1.length;i++){
            sum = sum+arr1[i];
            if(max<arr1[i]) max = arr1[i];
        }
        System.out.println((max*(max+1)/2) - sum);
    }
}
