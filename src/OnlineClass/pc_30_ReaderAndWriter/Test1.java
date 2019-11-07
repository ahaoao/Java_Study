package OnlineClass.pc_30_ReaderAndWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //需求：通过字符流读取数据，一次读取一个字符数组
        Reader reader = new FileReader("F:\\Java_Study\\src\\OnlineClass\\pc_30_ReaderAndWriter\\lib\\2.txt");
        /*
        char[] chs = new char[3];
        int len1 = reader.read(chs);
        System.out.println(chs);//a,b,c
        System.out.println(len1);//3

        int len2 = reader.read(chs);
        System.out.println(chs);//d,e,f
        System.out.println(len2);//3

        int len3 = reader.read(chs);
        System.out.println(chs);//g,e,f    g覆盖了上一次的d ，ef不变
        System.out.println(len3);//1   */
        //定义字符数组
        char[] chs = new char[3];
        //定义一个变量，记录读取到的有效字符数
        int len;
        while((len = reader.read(chs)) != -1){
            String s = new String(chs,0,len);
            /**
             * chs:表示要操作的数组
             * 0:表示起始索引
             * len:表示要操作的字符个数
             * */
            System.out.println(s);
        }
        reader.close();
    }
}
