package com.xp_java_problem_set_4;

/**
 * Created by localadmin on 02/01/17.
 */
public class Stocks {


    protected String name;
    protected int numberOfShare;

    public Stocks(String name, int numberOfShare) {
        this.name = name;
        this.numberOfShare = numberOfShare;
    }
    public String getName() {
        return name;
    }

    public int getNumberOfShare() {
        return numberOfShare ;
    }

}
