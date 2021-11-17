package com.designpattern.design.test;

import com.designpattern.design.builder.Computer;
import com.designpattern.design.builder.Student;

public class TestBuilderPattern {
    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();
        System.out.println(comp.toString());

        Student student = new Student.StudentBuilder("1", "DHKTPM14", "Nhat Hao", 21, true).setAddress("HCM").build();
        System.out.println(student.toString());
    }
}
