package OnlineClass.pc_27_thorws;

public class Test {
    /**
     * 异常处理方式二：throws
     * 抛出异常，交给调用者处理
     * 特点：抛出异常结束后，程序不再执行
     * */
    public static void main(String[] args) throws Exception{
        //需求：调用show()
        //show()方法已经抛出了一个异常，作为调用者(main函数)必须处理这个异常
        //方案一：接着抛出异常
        //show();
        //方案二：采用try catch处理
        try{
            show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("看看我执行了吗？");
    }
    public static void show() throws Exception{
        int a = 10/0;
        System.out.println("a: "+a);
    }
}
