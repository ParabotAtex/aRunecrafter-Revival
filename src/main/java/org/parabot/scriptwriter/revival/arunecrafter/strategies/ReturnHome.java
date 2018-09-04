package org.parabot.scriptwriter.revival.arunecrafter.strategies;

import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.Inventory;
import org.rev317.min.api.methods.Menu;

public class ReturnHome implements Strategy {
    @Override
    public boolean activate() {
        return !Inventory.isFull();
    }

    @Override
    public void execute() {
        Menu.clickButton(19210);
        Time.sleep(4000);
    }
}
