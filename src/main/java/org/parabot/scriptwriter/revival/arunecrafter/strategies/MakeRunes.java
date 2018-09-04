package org.parabot.scriptwriter.revival.arunecrafter.strategies;

import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.framework.SleepCondition;
import org.parabot.environment.scripts.framework.Strategy;
import org.parabot.scriptwriter.revival.arunecrafter.core.Core;
import org.rev317.min.api.methods.Inventory;
import org.rev317.min.api.methods.SceneObjects;
import org.rev317.min.api.methods.Skill;

import java.util.Objects;

import static org.parabot.scriptwriter.revival.arunecrafter.data.Methods.getObject;

public class MakeRunes implements Strategy {
    @Override
    public boolean activate() {
        return getObject(Core.getMethods().getCurrentRune().getAltarId()) != null
                && Inventory.isFull();
    }

    @Override
    public void execute() {
        Objects.requireNonNull(getObject(Core.getMethods().getCurrentRune().getAltarId())).interact(SceneObjects.Option.FIRST);
        Time.sleep(new SleepCondition() {
            @Override
            public boolean isValid() {
                return !Inventory.isFull();
            }
        }, 5000);
        Core.getMethods().updateCurrentRune(Skill.RUNECRAFTING.getLevel());
    }
}
