package org.parabot.scriptwriter.revival.arunecrafter.data;


import org.rev317.min.api.methods.SceneObjects;
import org.rev317.min.api.methods.Skill;
import org.rev317.min.api.wrappers.SceneObject;

public class Methods {
    private Constants.Rune currentRune;

    public Constants.Rune getCurrentRune() {
        if(currentRune == null) updateCurrentRune(Skill.RUNECRAFTING.getLevel());
        return currentRune;
    }

    public void updateCurrentRune(int level) {
        Constants.Rune[] runes = Constants.Rune.values();
        for(int i = runes.length - 1; i >= 0; i--) {
            if(runes[i].getLevel() <= level) {
                currentRune = runes[i];
                return;
            }
        }
        currentRune = Constants.Rune.AIR;
    }

    public static SceneObject getObject(int id) {
        for (SceneObject sceneObject : SceneObjects.getAllSceneObjects()) {
            if (sceneObject != null) {
                if (sceneObject.getId() == id) {
                    return sceneObject;
                }
            }
        }
        return null;
    }

}
