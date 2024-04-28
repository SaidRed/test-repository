package com.github.saidred.testrepository;

import org.bukkit.plugin.java.JavaPlugin;

public final class Test_repository extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(new PlayerEvent(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
