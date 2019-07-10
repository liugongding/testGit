package com.how2java.springboot.test;

public class Test {
    private static Test ourInstance = new Test();

    public static Test getInstance() {
        return ourInstance;
    }

    private Test() {
        System.out.println("修改");
        System.out.println("未修改");
        System.out.println("未修改");
        System.out.println("未修改");
    }
}
