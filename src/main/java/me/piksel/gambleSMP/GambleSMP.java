package me.piksel.gambleSMP;

import me.piksel.gambleSMP.command.testGamble;
import me.piksel.gambleSMP.guis.test;
import me.piksel.gambleSMP.listeners.invListener;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class GambleSMP extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("GambleSMP plugin loaded!");
        LogCommands();
        LogListeners();
    }

    private void LogCommands(){
        registerCommand("test",new testGamble());

    }
    private void LogListeners(){
        getServer().getPluginManager().registerEvents(new invListener(),this);
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
