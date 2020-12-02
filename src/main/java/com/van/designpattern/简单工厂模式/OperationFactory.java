package com.van.designpattern.简单工厂模式;

import com.van.designpattern.简单工厂模式.operations.Subtract;
import com.van.designpattern.简单工厂模式.operations.Sum;

/**
 * 工厂用于创建运算实例
 */
public class OperationFactory {
    public static Operation createOperation(char operate) {
        Operation operation = null;
        switch (operate) {
            case '+':
                operation = new Sum();
                break;
            case '-':
                operation = new Subtract();
                break;
        }
        return operation;
    }

}
