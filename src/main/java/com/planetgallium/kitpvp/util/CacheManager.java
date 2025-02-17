package com.planetgallium.kitpvp.util;

import com.planetgallium.kitpvp.api.Kit;

import java.util.*;

public class CacheManager {

    private static final Map<String, String> usernameToUUID = new HashMap<>();
    private static final Map<String, Kit> kitCache = new HashMap<>();
    private static final Map<String, Menu> previewMenuCache = new HashMap<>();
    private static final Set<String> compassUsers = new HashSet<>();
    private static final Map<String, Map<String, Long>> abilityCooldowns = new HashMap<>();
    private static final Set<String> witchPotionUsers = new HashSet<>();
    private static final Map<String, PlayerData> statsCache = new HashMap<>();

    public static Map<String, String> getUUIDCache() { return usernameToUUID; }

    public static Map<String, Kit> getKitCache() { return kitCache; }

    public static Map<String, Menu> getPreviewMenuCache() { return previewMenuCache; }

    public static Set<String> getCompassUsers() { return compassUsers; }

    public static Set<String> getWitchPotionUsers() { return witchPotionUsers; }

    public static Map<String, PlayerData> getStatsCache() { return statsCache; }

    public static Map<String, Long> getPlayerAbilityCooldowns(String username) {

        if (abilityCooldowns.get(username) == null) {
            abilityCooldowns.put(username, new HashMap<>());
        }

        return abilityCooldowns.get(username);

    }

    public static void clearCaches() {
        kitCache.clear();
        previewMenuCache.clear();
        compassUsers.clear();
        abilityCooldowns.clear();
        // stats, usernameToUUID, and witchPotionUsers cache isn't here as of right now
    }

}
