package org.parabot.scriptwriter.revival.arunecrafter.core;

import org.parabot.environment.scripts.Category;
import org.parabot.environment.scripts.Script;
import org.parabot.environment.scripts.ScriptManifest;
import org.parabot.environment.scripts.framework.Strategy;
import org.parabot.scriptwriter.revival.arunecrafter.data.Methods;
import org.parabot.scriptwriter.revival.arunecrafter.strategies.*;

import java.util.ArrayList;

@ScriptManifest(author = "Atex",
        category = Category.RUNECRAFTING,
        description = "Auto progresses to 99 runecrafting, requires access to ::dz",
        name = "aRunecrafter", servers = { "Revival" },
        version = 0.1)
public class Core extends Script {
    private static Core core;
    private static Methods methods = new Methods();
    private ArrayList<Strategy> strategies = new ArrayList<>();

    @Override
    public boolean onExecute() {
        strategies.add(new Banking());
        strategies.add(new EnterPortal());
        strategies.add(new MakeRunes());
        strategies.add(new TeleportToAbyss());

        strategies.add(new GoToMage());
        strategies.add(new ReturnHome());
        provide(strategies);

        core = this;

        return true;
    }

    public static void stopScript() {
        core.setState(STATE_STOPPED);
    }

    public static Methods getMethods() {
        return methods;
    }
}
