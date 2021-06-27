package com.van.designpattern.standardpattern.代理模式;

public class UserControllerProxy implements IUserController {
    // private Record record;  // other dependcy
    private IUserController userController;

    public UserControllerProxy(IUserController userController) {
        this.userController = userController;
    }

    @Override
    public void login() {
        userController.login();
        System.out.println("do some not important things");
    }

    @Override
    public void register() {
        userController.register();
        System.out.println("do some not important things");
    }
}
