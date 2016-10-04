package com.example.android.architecture.blueprints.todoapp.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by lee on 16/8/25.
 */
public class CalculatorJunitUnitTest {

    private Calculator calculator;


    @BeforeClass
    public static void beforeClassM(){
        //Log.d("CalculatorJunitUnitTest","BeforeClass");

    }


    @Before
    public void setup() {

        calculator = new Calculator();
        //Log.d("CalculatorJunitUnitTest","Before");

    }


    @Test
    public void testAdd() throws Exception {
        int sum = calculator.add(1, 2);
        Assert.assertEquals(3, sum);
    }

    @Test
    public void testMultiply() throws Exception {
        int product = calculator.multiply(2, 4);
        Assert.assertEquals(8, product);
    }

    @Test
    @Ignore("not implemented yet")
        public void testFactorial() {
    }

    @Test(expected = IllegalArgumentException.class)
        public void testDivide() {
        calculator.divide(4, 0);
    }


    @After
    public void after(){
        calculator = null;
        //Log.d("CalculatorJunitUnitTest","after");
    }

    @AfterClass
    public static void afterClassM(){
        //Log.d("CalculatorJunitUnitTest","AfterClass");
    }

}
