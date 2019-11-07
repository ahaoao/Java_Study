package testSix_2;

import java.math.BigInteger;

public class BigintegerExample {
    public static void sumBigInteger(BigInteger num1, BigInteger num2){
        BigInteger sum = num1.add(num2);
        System.out.println(num1+"+"+num2+"="+sum);
    }
    public static void differBigInteger(BigInteger num1, BigInteger num2){
        BigInteger differ = num1.subtract(num2);
        System.out.println(num1+"-"+num2+"="+differ);
    }
    public static void multipleBigInteger(BigInteger num1, BigInteger num2){
        BigInteger multiple = num1.multiply(num2);
        System.out.println(num1+"*"+num2+"="+multiple);
    }
    public static void divideBigInteger(BigInteger num1, BigInteger num2){
        BigInteger divide = num1.divide(num2);
        System.out.println(num1+"/"+num2+"="+divide);
    }
}
