package com.xp_java_problem_set_4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 02/01/17.
 */
public class BrokerageTest {
    @Test
    public void createBrokerage_isInitializedWithAName() {
        Brokerage brokerage = new Brokerage("Zerodha");
        assertEquals("Zerodha", brokerage.getName());
    }
    @Test
    public void addClientToBrokerage() {

        Client client = new Client("Rakesh","Male",25);
        Brokerage brokerage = new Brokerage();
        brokerage.addClient(client);

        assertEquals("Rakesh", brokerage.clientList.get(0).name);
        assertEquals("Male", brokerage.clientList.get(0).gender);
        assertEquals(25, brokerage.clientList.get(0).age);
    }


}