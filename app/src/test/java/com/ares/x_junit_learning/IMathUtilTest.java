package com.ares.x_junit_learning;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * ====================================
 * 作    者：Ares(颜崔)
 * 地    址：https://github.com/Ares-yc
 * 描    述：简单的数学函数类测试类
 * 版    本：1.0.0
 * 创建时间：2017/7/21/021.
 * 修改时间：2017/7/21/021.
 * ====================================
 */

public class IMathUtilTest {

    IMathUtil iMathUtil;

    @Before
    public void setUp() {
        iMathUtil = new IMathUtil();
    }

    @Test
    public void testAdd() {
        int sum = iMathUtil.add(1, 2);
        Assert.assertEquals(3, sum);
    }

    @Test
    public void testMultiply() {
        int product = iMathUtil.multiply(2, 4);
        Assert.assertEquals("This is wrong", 8, product);
    }

    @Test
    @Ignore
    public void testXX() {
        //暂未实现该方法，@Ignore表示忽略本测试方法
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivide() {
        iMathUtil.divide(4, 0);
        //@Test(expected = IllegalArgumentException.class)
        //表示只有当该测试方法抛出IllegalArgumentException异常时该方法测试成功
    }

}
