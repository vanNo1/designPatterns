package com.van.designpattern.模版模式.example;

public abstract class TestPaper {
    public void question1() {
        System.out.println("3的平方为？" + answer1());
    }

    public void question2() {
        System.out.println("最小的动物是？" + answer2());
    }

    public abstract String answer1();

    public abstract String answer2();
}
