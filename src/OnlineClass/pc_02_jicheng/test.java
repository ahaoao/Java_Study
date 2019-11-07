package OnlineClass.pc_02_jicheng;

import OnlineClass.pc_02_jicheng.apple;

public class test {
    /**
     * Java中使用变量的规则：
     * 就近原则，局部位置有就使用。
     * 没有就去本类成员位置找，有就使用。
     * 没有就去父类的成员位置找，有就使用，没有就报错。
     */
    public static void main(String[] args) {
        apple a = new apple();
        a.showPrice();
    }

}
