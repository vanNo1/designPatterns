package com.van.designpattern.模版模式.example;

import com.van.designpattern.模版模式.example.papers.StudentA;
import com.van.designpattern.模版模式.example.papers.StudentB;

/**
 * 学生的试卷
 */
public class Main {
    public static void main(String[] args) {
        TestPaper paperA = new StudentA();
        TestPaper paperB = new StudentB();
        paperA.question1();
        paperA.question2();
        paperB.question1();
        paperB.question2();
    }
}
