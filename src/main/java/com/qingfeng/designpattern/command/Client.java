package com.qingfeng.designpattern.command;

import com.qingfeng.designpattern.command.impl.AddCommand;
import com.qingfeng.designpattern.command.impl.Operation;
import com.qingfeng.designpattern.command.impl.SubstractCommand;

public class Client {

    public static void main(String[] args) {
        //1、组装命令和接收者
        OperationApi operation = new Operation();

        AddCommand addCmd = new AddCommand(operation, 5);

        SubstractCommand substractCmd = new SubstractCommand(operation, 3);

        Calculator calculator = new Calculator();
        calculator.setAddCmd(addCmd);
        calculator.setSubstractCmd(substractCmd);

        calculator.addPressed();
        System.out.println("一次加法运算后的结果为：" + operation.getResult());
        calculator.substractPressed();
        System.out.println("一次减法运算后的结果为：" + operation.getResult());
        calculator.undoPressed();
        System.out.println("撤销一次后的结果为：" + operation.getResult());
        calculator.undoPressed();
        System.out.println("再次撤销后的结果为：" + operation.getResult());
        calculator.redoPressed();
        System.out.println("恢复一次操作后的结果为：" + operation.getResult());
        calculator.redoPressed();
        System.out.println("再次恢复一次操作后的结果为：" + operation.getResult());
    }

}
