package org.parabot.scriptwriter.revival.arunecrafter.strategies;

import org.parabot.environment.api.utils.Time;
import org.parabot.environment.input.Keyboard;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.Inventory;

public class GoToMage implements Strategy {
    @Override
    public boolean activate() {
        return Inventory.isFull();
    }

    @Override
    public void execute() {
        Keyboard.getInstance().sendKeys("::dz");
        Time.sleep(4000);
    }
}
