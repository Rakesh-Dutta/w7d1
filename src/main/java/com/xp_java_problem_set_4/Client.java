package com.xp_java_problem_set_4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by localadmin on 02/01/17.
 */
public class Client {
    protected String name;
    protected String gender;
    protected int age;
    protected int balance;

    List<Portfolios> portfoliosList = new ArrayList<Portfolios>();

    public Client(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void deposit(int balance){
        this.balance += balance;
    }

    public int getBalance() {
        return balance;
    }
    public boolean withdrow(int balance){
        if(this.balance < balance) {
           return false;
        }
        this.balance -= balance;
        return true;
    }

}
