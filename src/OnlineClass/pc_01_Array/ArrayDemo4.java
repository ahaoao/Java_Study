package OnlineClass.pc_01_Array;

public class ArrayDemo4 {
    public static void main(String[] args) {
        /*
            需求：定义一个方法打印数组，并调用。
        * */
        int[] arr = {2,3,5,9,6,7};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
