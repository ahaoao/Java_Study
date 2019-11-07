package OnlineClass.pc_01_Array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        /*
        数组分配后，系统给出默认值
        数组的定义格式：
            格式一：
                数据类型[] 数组名 = new 数据类型[长度]    //动态初始化
            格式二：
                数据类型[] 数据名 = new 数据类型[]{值1，值2，值3，......} //静态初始化
            格式三：
                数据类型[] 数据名 = {值1，值2，值3......}   //静态初始化

        int[] arr = new int[]
        变量arr数组存储的是数组在堆内存中的地址值，而不是数组元素的值，变量arr通过内存地址引用堆内存中的数组，
        所以数组是引用类型
        * */
        //格式一
        int[] arr1 = new int[3];
        //格式二
        int[] arr2 = new int[]{1,2,3};
        //格式三
        int[] arr3 = {1,2,3};
        /*掌握第一种和第三种*/
    }
}
