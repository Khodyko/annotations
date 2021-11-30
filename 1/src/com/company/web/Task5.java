package com.company.web;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;


@Retention(RetentionPolicy.RUNTIME)
@Target({METHOD,FIELD})
public @interface Task5 {
String a="asd";
//    public void method();
//    public void method2();
}
