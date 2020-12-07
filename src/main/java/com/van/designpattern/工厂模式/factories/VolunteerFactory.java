package com.van.designpattern.工厂模式.factories;

import com.van.designpattern.工厂模式.IFactory;
import com.van.designpattern.工厂模式.LeiFeng;
import com.van.designpattern.工厂模式.leifengs.Volunteer;

public class VolunteerFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
