package me.piksel.gambleSMP.events.test;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class testEvent {
    Random rand = new Random();
    final int min = 1;
    final int max = 8;
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
        } else if (value == 5) {
            player.sendActionBar( ChatColor.ITALIC+""+ChatColor.YELLOW +  "Nothing.................");
            player.getWorld().spawnEntity(player.getLocation(), EntityType.WARDEN);
            return;
        } else if (value == 6) {
            ItemStack d = new ItemStack(Material.DIRT, 64);
            for (int i = 0; i < 43;i++) {

                player.getWorld().dropItem(player.getLocation(),d);
            }

            player.sendActionBar(ChatColor.DARK_GREEN + "Skibidi");
            return;
        } else if (value == 7) {
            player.sendActionBar( ChatColor.ITALIC+""+ChatColor.YELLOW +  "Dungeons and dragons");
            player.getWorld().spawnEntity(player.getLocation(), EntityType.ENDER_DRAGON);
            return;
        } else if (value == 8) {

            for (int i = 0; i < 5;i++) {

                player.getWorld().playSound(player.getLocation(), Sound.ENTITY_BAT_DEATH ,8f,1f);
                player.getWorld().playSound(player.getLocation(), Sound.BLOCK_ANVIL_FALL ,8f,1f);
            }

            player.sendActionBar(ChatColor.DARK_GREEN + "Skibidi");
            return;
        }
    }
}
