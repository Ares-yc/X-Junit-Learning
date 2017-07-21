package com.ares.x_junit_learning;

/**
 * ====================================
 * 作    者：Ares(颜崔)
 * 地    址：https://github.com/Ares-yc
 * 描    述：简单的数学函数类
 * 版    本：1.0.0
 * 创建时间：2017/7/21/021.
 * 修改时间：2017/7/21/021.
 * ====================================
 */

public class IMathUtil {

    /**
     * 加法，求两数之和
     * @param a 加数
     * @param b 被加数
     * @return  和
     */
    public int add(int a,int b){
        return a + b;//为了简单起见，暂不考虑溢出等情况。
    }

    /**
     * 乘法，求两数之积
     * @param a 乘数
     * @param b 被乘数
     * @return  积
     */
    public int multiply(int a,int b){
        return a * b;//为了简单起见，暂不考虑溢出等情况。
    }

    public double divide(int a,int b){
        if (b == 0) throw new IllegalArgumentException("Dividor cannot be 0 !");
        return a / b;
    }
}
