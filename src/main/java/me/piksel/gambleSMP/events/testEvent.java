package me.piksel.gambleSMP.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;

import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

public class testEvent {
    Random rand = new Random();
    final int min = 1;
    final int max = 4;
    public void startEvent(Player player){
        int value = (int) Math.floor(Math.random() * (max - min + 1) + min); //thx to someone that gave me this code :)
        if (value == 1){
            for (int i = 0; i < 7;i++){
                player.getWorld().spawnEntity(player.getLocation(), EntityType.CREEPER);
            }
            player.sendActionBar(ChatColor.GREEN + "Ka-Ka-Ka KA-BOOOOOOOOOOM");
            return;
        } else if (value == 2) {
            ItemStack d = new ItemStack(Material.DIAMOND,15);
            player.getWorld().dropItem(player.getLocation(),d);
            player.sendActionBar(ChatColor.AQUA + "Rich fella talk");
            return;
        } else if (value == 3) {
            player.sendActionBar( ChatColor.ITALIC+""+ChatColor.GRAY +  "Nothing");
            player.getWorld().spawnEntity(player.getLocation(), EntityType.BAT);
            return;
        } else if (value == 4) {
            for (int i = 0; i < 20;i++){
                player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
            }
            player.sendActionBar(ChatColor.GREEN + "Me and my gng");
            return;
        }
    }
}
