package com.qingfeng.designpattern.command.instance;

import com.qingfeng.designpattern.command.CommandApi;

import java.util.ArrayList;
import java.util.Collection;

public class MenuCommand implements CommandApi {

    private Collection<CommandApi> col = new ArrayList<CommandApi>();

    public void addCommand(CommandApi commandApi){
        col.add(commandApi);
    }

    @Override
    public void execute() {
        for (CommandApi commandApi : col) {
            commandApi.execute();
        }
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
