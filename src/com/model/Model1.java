package com.model;

import org.springframework.ui.Model;

/**
 * @author Leon
 */
public class Model1 {
    private String id;
    private String name;
    private int age;

    public Model1(){

    }
    public Model1(String id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
//        System.out.println("id是:"+id +"  "+"name是："+name+"  "+"age是："+age);
        return   "id是:"+id +"  "+"name是："+name+"  "+"age是："+age;

    }

}
