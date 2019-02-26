package com.bht.aop.model;

public class User {

    String name;

    public String getName() {
        System.out.println("***getName() in User Class with name = [" + this.name + "]***");
        return name;
    }

    public void setName(String name){
        System.out.println("***setName() in User Class with name = [" + name + "]***");
        this.name = name;
    }


    public void throwUserException(){
        throw new NullPointerException("null pointer is me0");
    }
}
