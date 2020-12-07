package com.van.designpattern.模版模式.example.papers;

import com.van.designpattern.模版模式.example.TestPaper;

public class StudentA extends TestPaper {
    @Override
    public String answer1() {
        return "9";
    }

    @Override
    public String answer2() {
        return "蚂蚁";
    }
}
