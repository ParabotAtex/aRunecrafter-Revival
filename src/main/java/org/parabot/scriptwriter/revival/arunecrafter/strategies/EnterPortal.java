package org.parabot.scriptwriter.revival.arunecrafter.strategies;

import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.framework.Strategy;
import org.parabot.scriptwriter.revival.arunecrafter.core.Core;
import org.rev317.min.api.methods.Inventory;
import org.rev317.min.api.methods.SceneObjects;

import java.util.Objects;

import static org.parabot.scriptwriter.revival.arunecrafter.data.Methods.getObject;

public class EnterPortal implements Strategy {
    @Override
    public boolean activate() {
        return getObject(Core.getMethods().getCurrentRune().getPortalId()) != null
                && Inventory.isFull();
    }

    @Override
    public void execute() {
        Objects.requireNonNull(getObject(Core.getMethods().getCurrentRune().getPortalId())).interact(SceneObjects.Option.FIRST);
        Time.sleep(2000);
    }
}
