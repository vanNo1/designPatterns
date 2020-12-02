package com.van.designpattern.策略模式;

/**
 * 模拟商场优惠策略
 * context 里面肯定要把所有逻辑封装好，客户端拿来用就是了，比如打7折：在context中定义好是7折，不要让客户端来输入7！
 */
public class Main {
    public static void main(String[] args) {
        CashContext context = new CashContext(2, 200d);
        // 普通，买多少就是多少
        context.createNormal();
        double result1 = context.getResult(2 * 200d);
        // 打7折
        context.createDiscount();
        double result2 = context.getResult(2 * 200d);
        // 满300减30
        context.createReturnByMoney();
        double result3 = context.getResult(2 * 200d);
        // 买2送一
        context.createReturnByAmount();
        double result4 = context.getResult(2 * 200d);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
