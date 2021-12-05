package net.teamuni.test;

import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("플러그인이 활성화 됨.");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        getLogger().info("플러그인이 비활성화 됨.");
        // Plugin shutdown logic
    }
}
