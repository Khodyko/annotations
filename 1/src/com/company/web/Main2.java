package com.company.web;

public class Main2 extends Main {

    @Override
//    @SuppressWarnings("deprecation")
    @SuppressWarnings("all")
    public void modern(){
        System.out.println("overrided");
        new Main().outdated();
    }
//    @Override
//    public void modern(Integer a){
//        System.out.println("overrided with " +a);
//    }
}
