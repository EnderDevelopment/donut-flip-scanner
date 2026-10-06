package com.cabil62113.donutflipscannermod;

import java.util.HashSet;
import java.util.Set;

public
class ConfigManager {
    private static final Set<String> whitelist = new HashSet<>();
    private static final Set<String> blacklist = new HashSet<>();
    private static boolean isMockMode = true;

    public static void init() {
        DonutFlipScannerMod.LOGGER.info("Config Manager initialized");
        loadConfig();
    }

    private static void loadConfig() {
        // Load configuration from a file
        // This is a simplified example
        whitelist.add("DIAMOND_SWORD");
        blacklist.add("WOODEN_SWORD");
    }

    public static boolean isWhitelisted(String itemId) {
        return whitelist.contains(itemId);
    }

    public static boolean isBlacklisted(String itemId) {
        return blacklist.contains(itemId);
    }

    public static boolean isMockMode() {
        return isMockMode;
    }

    public static void setMockMode(boolean mockMode) {
        isMockMode = mockMode;
    }
}
