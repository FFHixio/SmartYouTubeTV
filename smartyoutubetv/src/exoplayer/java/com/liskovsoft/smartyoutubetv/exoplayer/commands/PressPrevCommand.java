package com.liskovsoft.smartyoutubetv.exoplayer.commands;

public class PressPrevCommand extends PressCommandBase {
    private final GenericCommand mCommand;

    public PressPrevCommand(GenericCommand command) {
        mCommand = command;
    }

    @Override
    public boolean call() {
        pressButtonByClass("icon-player-prev", mCommand);
        return true;
    }

}
