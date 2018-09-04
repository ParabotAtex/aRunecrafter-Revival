package org.parabot.scriptwriter.revival.arunecrafter.strategies;

import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.framework.SleepCondition;
import org.parabot.environment.scripts.framework.Strategy;
import org.parabot.scriptwriter.revival.arunecrafter.data.Constants;
import org.rev317.min.api.methods.Interfaces;
import org.rev317.min.api.methods.Inventory;
import org.rev317.min.api.methods.Menu;
import org.rev317.min.api.methods.Npcs;

public class TeleportToAbyss implements Strategy {
    @Override
    public boolean activate() {
        return Npcs.getClosest(Constants.MAGE_ID) != null
                && Inventory.isFull();
    }

    @Override
    public void execute() {
        if(Interfaces.getBackDialogId() != Constants.TELEPORT_INTERFACE_ID) {
            Npcs.getClosest(Constants.MAGE_ID).interact(Npcs.Option.FOURTH);
            Time.sleep(new SleepCondition() {
                @Override
                public boolean isValid() {
                    return Interfaces.getBackDialogId() == Constants.TELEPORT_INTERFACE_ID;
                }
            }, 2000);
        } else {
            Menu.clickButton(Constants.TELEPORT_ABYSS_BUTTON_ID);
            Time.sleep(2000);
        }
    }
}
