public class SumProductOfArray{
    public static void main(String[] args) {
        int[] arr1 = {3,2,6,4,7};
        int sum = 0;
        int prod = 1;
        for(int i=0;i<arr1.length;i++){
            sum = sum+arr1[i];
            prod = prod*arr1[i];
        }
        System.out.println(sum);
        System.out.println(prod);
    }
}
