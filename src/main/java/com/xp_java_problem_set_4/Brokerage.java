package com.xp_java_problem_set_4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by localadmin on 02/01/17.
 */
public class Brokerage {
    protected String name;
    List<Client> clientList = new ArrayList<Client>();

    public Brokerage(){

    }

    public Brokerage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    protected void addClient(Client client) {
        this.clientList.add(client);
    }

}
