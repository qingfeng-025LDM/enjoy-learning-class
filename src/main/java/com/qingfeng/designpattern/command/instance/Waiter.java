package com.qingfeng.designpattern.command.instance;

import com.qingfeng.designpattern.command.CommandApi;

public class Waiter {

    private MenuCommand menuCommand = new MenuCommand();

    public void orderDish(CommandApi cmd){
        HotCook hotCook = new HotCook();
        CoolCook coolCook = new CoolCook();
        if (cmd instanceof DuckCommand){
            ((DuckCommand) cmd).setCookApi(hotCook);
        }else if (cmd instanceof ChopCommand){
            ((ChopCommand) cmd).setCookApi(hotCook);
        }else if (cmd instanceof PorkCommand){
            ((PorkCommand) cmd).setCookApi(coolCook);
        }
        menuCommand.addCommand(cmd);
    }

    public void orderOver(){
        this.menuCommand.execute();
    }

}
