package com.xp_java_problem_set_4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 02/01/17.
 */
public class ClientTest {
    @Test
    public void createClient_isInitializedWithAName() {
        Client client = new Client("Anish","Male",24);

        assertEquals("Anish", client.getName());
        assertEquals("Male", client.getGender());
        assertEquals(24, client.getAge());
    }

    @Test
    public void depositToAccount(){
        Client client = new Client("Anish","Male",24);
        client.deposit(10000);
        assertEquals(10000, client.getBalance());
    }

    @Test
    public void withdrowFromAccount(){
        Client client = new Client("Anish","Male",24);
        client.deposit(10000);

        assertEquals(true, client.withdrow(3000));
        assertEquals(7000, client.getBalance());

        assertEquals(false, client.withdrow(8000));
        assertEquals(7000, client.getBalance());
    }
}