public class OddEvenidxMultiAdd {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        for(int i=0; i<arr.length;i++){
            if(i%2==0){
                arr[i]*=2;
            }else{
                arr[i]+=10;
            }
        }
        for(int ele : arr){
            System.err.print(ele+" ");
        }
        System.out.println();
    }
}
