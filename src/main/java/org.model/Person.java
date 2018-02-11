package org.model;

public class Person {

    public Person()
    {

    }
    public Person(String name,int age,long mobile)
    {
        this.name=name;
        this.age=age;
        this.mobile=mobile;

    }

    private String name;
    private int age;
    private long mobile;



    public void setName(String name){
        this.name =name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
    public String getName()
    {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public long getMobile() {
        return mobile;
    }

}
