public class SearchInarray {
    public static String LinearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) return "Found";
        }
        return "Not Present";
    }
    public static void main(String[] args) {
        int[] arr1 = {3,1,5,6,8,2};
        System.out.println(LinearSearch(arr1,5));
    }
}
