package com.qingfeng.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    /**
     * 持有执行加法的命令对象
     */
    private CommandApi addCmd = null;

    /**
     * 持有执行减法的命令对象
     */
    private CommandApi substractCmd = null;

    private List<CommandApi> undoCmds = new ArrayList<CommandApi>();

    private List<CommandApi> redoCmds = new ArrayList<CommandApi>();

    /**
     * 设置执行加法的命令对象
     * @param addCmd
     */
    public void setAddCmd(CommandApi addCmd){
        this.addCmd = addCmd;
    }

    /**
     * 设置执行减法的命令对象
     * @param substractCmd
     */
    public void setSubstractCmd(CommandApi substractCmd){
        this.substractCmd = substractCmd;
    }

    public void addPressed(){
        this.addCmd.execute();
        undoCmds.add(this.addCmd);
    }

    public void substractPressed(){
        this.substractCmd.execute();
        undoCmds.add(this.substractCmd);
    }

    public void undoPressed(){
        if (this.undoCmds.size() > 0){
            CommandApi commandApi = this.undoCmds.get(this.undoCmds.size() - 1);
            commandApi.undo();
            this.redoCmds.add(commandApi);
            this.undoCmds.remove(commandApi);
        }else {
            System.out.println("很抱歉，没有可撤销的命令");
        }
    }

    public void redoPressed(){
        if (this.redoCmds.size() > 0){
            CommandApi commandApi = this.redoCmds.get(this.redoCmds.size() - 1);
            commandApi.redo();
            this.undoCmds.add(commandApi);
            this.redoCmds.remove(commandApi);
        }else {
            System.out.println("抱歉，没有可恢复的命令");
        }
    }


}
