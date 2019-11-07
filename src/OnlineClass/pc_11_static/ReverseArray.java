package OnlineClass.pc_11_static;

public class ReverseArray {
    int num1=10;
    static int num2=20;
    public static void show(){
        System.out.println(num2);
    }

    public static void reverse(int[] arr){
        int num;
        for(int i=0;i<arr.length/2;i++){
            num=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=num;
        }
    }
}
