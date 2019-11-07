package HomeWork_02_Exception;

/**
 * Author: ahao
 * Date: 2019-10-29
 * */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.*;


public class LoggingExceptions2 {
    //Logger.getLogger()方法创建了一个String参数相关联的Logger对象(通常是与错误相关的包名或类名)
    //这个Logger对象会将其输出发送到System.err
    private static Logger logger = Logger.getLogger("LoggingExceptions2");
    static void logException(Exception e) throws IOException {
        /**
         * printStackTrace不会产生默认字符串,为了获取字符串,我们使用重载的printStackTrace()方法
         * 它接受一个java.io.PrintWriter()对象作为参数,如果我们将一个StringWriter对象传递给这个PrintWrite()构造器
         * 那么就可以调用toString()方法,就可以抽取为一个String字符串
         * */
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));//printStackTrace不会产生默认字符串,为了获取字符串,我们使用重载的
        //先给logger添加文件处理器，然后再执行记录日志的操作
        WriteException(logger);
        logger.severe(trace.toString());//severe写入到日志
    }

    static void WriteException(Logger logger) throws IOException {
        /**
         * FileHandler 为文件记录Handler
         * pattern: 指定文件
         * append：追加的方式写入文件
         * */
        FileHandler fileHandler = new FileHandler("F:/Exception.log",true);
        fileHandler.setLevel(Level.INFO);//设置日志级别，指定的信息级别将保存在本Handler记录。
        logger.addHandler(fileHandler);//添加日志处理程序---FileHandler 记录到5日志文件中
    }

    public static void main(String[] args) throws IOException {
        try {
            throw new IllegalStateException();
        } catch (IllegalStateException e) {
            logException(e);
        }
    }
}