package OnlineClass.pc_29_ClassFile;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //需求：将F:\1.txt封装成File对象
        //方式一:根据字符串形式的路径获取File对象
        File file1 = new File("F:\\1.txt");
        System.out.println("file1: "+file1);
        //方式二：根据字符串形式的父目录以及子目录创建File对象
        File file2 = new File("F:\\","1.txt");
        System.out.println("file2: "+file2);
        //方式三：根据父目录对象，以字符串形式的子目录来获取File对象
        File file3 = new File("F:\\");
        File file4 = new File(file3,"1.txt");
        System.out.println("file4: "+file4);

        //需求：在F盘下创建2.txt文件
        File file5 = new File("F:\\2.txt");
        boolean flag1 = file5.createNewFile();
        System.out.println(flag1);

        //需求：在F盘下创建z文件夹
        File file6 = new File("F:\\z");
        boolean flag2 = file6.mkdir();//make directory 创建单级目录
        System.out.println(flag2);

        //需求：在F盘下创建x/y/z文件夹
        File file7 = new File("F:\\x\\y\\z");
        boolean flag3 = file7.mkdirs();//创建多级目录(也可以创建单级目录)
        System.out.println(flag3);

        System.out.println("测试file6是不是文件夹： "+file6.isDirectory());
        System.out.println("测试file6是不是文件： "+file6.isFile());
        System.out.println("测试file6是否存在 ： "+file6.exists());
        
    }
}
