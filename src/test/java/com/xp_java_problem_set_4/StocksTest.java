package com.xp_java_problem_set_4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 02/01/17.
 */
public class StocksTest {
    @Test
    public void createAndInitializeStock() {
        Stocks stock = new Stocks("Apple",5);
        assertEquals("Apple",stock.getName());
        assertEquals(5,stock.getNumberOfShare());
    }

}