package com.company.web;


import jdk.jfr.BooleanFlag;
import jdk.jfr.Label;

import java.lang.reflect.Field;

public class Main {
    /**
     * Show that this method is Deprecated
     * For task 1
     *
     * @deprecated
     */
    @Deprecated
    public void outdated() {

    }

    /**
     * Show that this method is new
     */
    @SuppressWarnings("all")
    public void modern() {
    }

    @SafeVarargs
    public static <T> void Task4(T... args) {
        for (T t : args) {
            System.out.println(t);
        }
    }


    public static void main(String[] args) {

        for (String t : args) {
            System.out.println(t);
        }
        //Task7
        Class<Task7> task7Class = Task7.class;
        for (Field a : task7Class.getDeclaredFields()) {
            switch (a.getName()
            ) {
                case "a": {
                    System.out.println(a.getAnnotation(Label.class));
                    break;
                }
                case "b": {
                    System.out.println(a.getAnnotation(Task5.class));
                    break;
                }
                case "c": {
                    System.out.println(a.getAnnotation(BooleanFlag.class));
                    break;
                }

            }

        }

    }
}