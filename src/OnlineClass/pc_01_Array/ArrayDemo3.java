package OnlineClass.pc_01_Array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        /*
            找出数组中得最大值
        * */
        int[] arr = {
                1,2,3,5,4,9
        };
        int n = 0;
        for(int i=0;i<arr.length;i++){
            n=arr[0];
            if(n<arr[i]) n=arr[i];
        }
        System.out.println(n);
    }
}
