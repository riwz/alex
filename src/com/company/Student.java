package com.company;

public class Student extends Person {

    private  String name;
    private int Q;

    public Student(String name, int Q) {
        super(name, Q);
    }

    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public  int getQ(){
        return Q;
    }
    public void setQ(int Q){
        this.Q = Q;
    }

}
