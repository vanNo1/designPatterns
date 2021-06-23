package com.van.designpattern.callbackdemo;

import javax.security.auth.callback.Callback;
import java.util.function.Function;

public class UserService {
    public String hello(boolean flag, Callback callback)throws Exception{
        if (flag==true){
            return "hello";
        }else {
            throw new Exception("a");
        }
    }

}
