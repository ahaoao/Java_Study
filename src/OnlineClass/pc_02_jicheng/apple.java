package OnlineClass.pc_02_jicheng;

public class apple extends fruit {
    //成员变量
    int price = 10;
    public void showPrice(){
        //局部变量
        int price = 5;
        System.out.println(price);//本方法
        System.out.println(this.price);//本类
        System.out.println(super.price);//父类
        /*
         *this：
         * 本质：对象
         * 用法：从本类开始找
         *
         * super:
         * 本质：父类内存空间的标识
         * 用法：从父类开始找
         * */
    }
}
