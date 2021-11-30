package com.company.web;


import jdk.jfr.BooleanFlag;
import jdk.jfr.Label;

import java.lang.annotation.Documented;

public class Task7 {
    @Label("123")
    String a = "abc;";
    @Task5
    Integer b = 20;
    @BooleanFlag
    Boolean c = false;
}
