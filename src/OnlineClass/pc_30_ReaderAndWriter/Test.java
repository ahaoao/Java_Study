package OnlineClass.pc_30_ReaderAndWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test {
    public static void main(String[] args) throws IOException {
        //需求：通过字符流读取数据
        //1.创建字符流对象
        Reader reader = new FileReader("F:\\Java_Study\\src\\OnlineClass\\pc_30_ReaderAndWriter\\lib\\1.txt");
        //2.读取数据
        int ch;
        while((ch = reader.read()) != -1){
            System.out.println(ch);
        }
        //3.释放资源
        reader.close();
    }
}
