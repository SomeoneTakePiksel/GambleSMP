package me.piksel.gambleSMP.command;

import io.papermc.paper.command.brigadier.BasicCommand;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import me.piksel.gambleSMP.guis.test;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class testGamble implements BasicCommand {
    @Override
    public void execute(CommandSourceStack source, String[] args) {
        if (!(source.getSender() instanceof Player player)) return;
        if (!player.hasPermission("gamblesmp.test")){return;}
        new test().open(player);
    }
}
