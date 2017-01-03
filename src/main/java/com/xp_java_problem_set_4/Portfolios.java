package com.xp_java_problem_set_4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by localadmin on 02/01/17.
 */
public class Portfolios {

    protected String name;
    public String getName() {
        return name;
    }

    public Portfolios(String name) {
        this.name = name;
    }
    List<Stocks> stocksList = new ArrayList<Stocks>();
}
