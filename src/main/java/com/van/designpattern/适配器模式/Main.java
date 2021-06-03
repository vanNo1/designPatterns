package com.van.designpattern.适配器模式;

/**
 * 手机只能冲5v的电，但是家里只有220v的电，所以要用适配器转换成5v的电给手机用
 * 其实手机不能够直接冲家里的电，因为GeneralPower没有implement Power 接口，所以这里用适配器去适配。
 * 适配器有两个作用，其一是帮助手机能够使用家电，其二是对家电进行转换
 */
public class Main {
    public static void main(String[] args) {
        Mobile mobile=new Mobile();
        mobile.charge(new Adapter(new GeneralPower()));
    }
}
