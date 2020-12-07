package com.van.designpattern.工厂模式;

import com.van.designpattern.工厂模式.factories.StudentFactory;
import com.van.designpattern.工厂模式.factories.VolunteerFactory;

/**
 * 对比简单工厂的好处就是它遵守了开放-封闭 原则，但不好的地方是选择权交给了客户端这里来实现
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
