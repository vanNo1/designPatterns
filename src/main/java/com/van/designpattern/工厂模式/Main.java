package com.van.designpattern.工厂模式;

import com.van.designpattern.工厂模式.factories.StudentFactory;
import com.van.designpattern.工厂模式.factories.VolunteerFactory;

/**
 * 对比简单工厂的好处就是它遵守了开放-封闭 原则，但不好的地方是选择权交给了客户端这里来实现
 *
 * 屏蔽了细节，工厂可以直接new出来，但是要生成的类可能会非常复杂，于是工厂把细节给屏蔽在内部，
 * 去生成复杂的类
 * 但感觉如果这几个复杂类相差很大的话，那么工厂与复杂类没必要搞成抽象，直接可以生成具体。
 */
public class Main {
    public static void main(String[] args) {
        IFactory studentFactory = new StudentFactory();
        IFactory volunteerFactory = new VolunteerFactory();
        LeiFeng student = studentFactory.createLeiFeng();
        LeiFeng volunteer = volunteerFactory.createLeiFeng();
        student.buy();
        volunteer.buy();
    }
}
