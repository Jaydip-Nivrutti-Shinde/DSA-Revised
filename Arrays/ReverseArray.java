import java.net.Socket;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr1 = {3,1,5,6,8,2,4};

        int st = 0;
        int ed = arr1.length-1;

        while (st<ed) {
            int temp = arr1[ed];
            arr1[ed]=arr1[st];
            arr1[st]=temp;
            st++;
            ed--;
        }
        for(int ele:arr1){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
