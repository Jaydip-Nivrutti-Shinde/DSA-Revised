public class TagrgetSumPair {
    public static void main(String[] args) {

        int[] arr1 = {3,1,5,6,8,7};
        int targetSum = 7;
        boolean flag = false;

        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(targetSum == arr1[i]+arr1[j]){
                    flag=true;
                    System.out.println("Target Sum found :"+arr1[i]+" , "+arr1[j]);
                    break;
                }
            }
        }  
        if(!flag){
            System.out.println("Not Found");
        }
    }
}
