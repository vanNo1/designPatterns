package com.van.designpattern.standardpattern.代理模式;

/**
 * 其实类似于切片
 */
public class Main {
    public static void main(String[] args) {
        UserControllerProxy proxy = new UserControllerProxy(new UserController());
        proxy.login();
        proxy.register();
    }
}
