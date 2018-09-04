package org.parabot.scriptwriter.revival.arunecrafter.data;

public class Constants {
    public static final int MAGE_ID = 4936;
    public static final int TELEPORT_INTERFACE_ID = 2459;
    public static final int TELEPORT_ABYSS_BUTTON_ID = 2461;

    public static final int RUNE_ESSENCE_ID = 7937;

    public static final int BANK_ID = 28861;

    public enum Rune {
        AIR(557, 25378, 14897, 1),
        COSMIC(565, 24974, 14903, 27),
        CHAOS(563, 24976, 14906, 35),
        NATURE(562, 24975, 14905, 44),
        LAW(564, 25034, 14904, 54),
        DEATH(561, 25035, 14907, 65),
        BLOOD(566, 25380, 27978, 77),
        SOUL(567, 25377, 27980, 92);

        private int id;
        private int portalId;
        private int altarId;
        private int level;

        Rune(int id, int portalId, int altarId, int level) {
            this.id = id;
            this.portalId = portalId;
            this.altarId = altarId;
            this.level = level;
        }

        public int getId() {
            return id;
        }

        public int getPortalId() {
            return portalId;
        }

        public int getAltarId() {
            return altarId;
        }

        public int getLevel() {
            return level;
        }
    }
}
