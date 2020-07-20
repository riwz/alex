package com.company;

public abstract class Person {
    private String name;
    private int Q;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public int getQ(){

        return Q;
    }
    public void setQ(int q) {

        this.Q = Q;
    }
    public  Person(String name, int Q){
        this.name = name;
        this.Q = Q;
    }
}