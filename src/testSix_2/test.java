package testSix_2;

import java.math.BigInteger;

public class test {

    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("74521566668");
        BigInteger num2 = new BigInteger("89978787887");
        //计算和
        BigintegerExample.sumBigInteger(num1,num2);
        //差
        BigintegerExample.differBigInteger(num1,num2);
        //积
        BigintegerExample.multipleBigInteger(num1,num2);
        //商
        BigintegerExample.divideBigInteger(num1,num2);
    }
}
