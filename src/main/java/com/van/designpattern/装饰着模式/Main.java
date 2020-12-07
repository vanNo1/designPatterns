package com.van.designpattern.装饰着模式;

import com.van.designpattern.装饰着模式.decorate.Clothes;
import com.van.designpattern.装饰着模式.decorate.Pants;
import com.van.designpattern.装饰着模式.decorate.Shoe;
import com.van.designpattern.装饰着模式.people.YellowPeople;

/**
 * 穿衣服
 */
public class Main {
    public static void main(String[] args) {
        YellowPeople van = new YellowPeople("van");
        van.show();
        System.out.println('\n');
        Clothes clothes = new Clothes();
        clothes.decorate(van);
        clothes.show();
        System.out.println('\n');
        Pants pants = new Pants();
        pants.decorate(clothes);
        pants.show();
        System.out.println('\n');
        Shoe shoe = new Shoe();
        shoe.decorate(pants);
        shoe.show();

    }
}
