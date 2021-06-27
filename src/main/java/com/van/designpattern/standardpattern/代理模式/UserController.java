package com.van.designpattern.standardpattern.代理模式;

public class UserController implements IUserController {
    @Override
    public void login() {
        System.out.println("the main login logic");
    }

    @Override
    public void register() {
        System.out.println("the main register logic");
    }
}
