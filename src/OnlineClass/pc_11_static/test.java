package OnlineClass.pc_11_static;

public class test {
    /**
     *static 修饰成员方法
     * 静态方法：
     * 静态方法中没有对象this，所以不能访问非静态成员
     * 静态方法的使用场景：如果某方法只能访问静态成员，并且不需通过 对象名. 的形式调用，就可以考虑将其定义为static
     *
     * 需求：定义静态方法，反转数组中的元素
     * 核心：1.arr[i] 和 arr[arr.length-1-i]在交换
     * 2.循环次数只需要执行数组长度的一半就可以了，也就是arr.length/2
     * */
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,9,10};
        ReverseArray.reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
