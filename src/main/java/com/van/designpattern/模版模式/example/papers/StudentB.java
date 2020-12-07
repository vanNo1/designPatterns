package com.van.designpattern.模版模式.example.papers;

import com.van.designpattern.模版模式.example.TestPaper;

public class StudentB extends TestPaper {
    @Override
    public String answer1() {
        return "10";
    }

    @Override
    public String answer2() {
        return "蚊子";
    }
}
