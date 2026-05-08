package me.piksel.gambleSMP.command;

import io.papermc.paper.command.brigadier.BasicCommand;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class testGamble implements BasicCommand {
    @Override
    public void execute(CommandSourceStack source, String[] args) {
        if (!(source.getSender() instanceof Player player)) return;
        if (player.hasPermission("gamblesmp.test")){return;}
        Inventory inv = Bukkit.createInventory(
                player,
                27,
                "GambleSMP"
        );
        ItemStack plainItem = new ItemStack(
                Material.BLACK_STAINED_GLASS_PANE,
                1
        );
        for (int i = 0;i < 9; i++){
            inv.setItem(i,plainItem);
        }
        inv.setItem(9,plainItem);
        inv.setItem(17,plainItem);
        inv.setItem(
                13,
                new ItemStack(Material.EMERALD,1)
        );
        for (int i = 18;i < 27; i++){
            inv.setItem(i,plainItem);
        }

        player.openInventory(inv);
    }
}
