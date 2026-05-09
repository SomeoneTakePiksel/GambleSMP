package me.piksel.gambleSMP.guis.test;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class test {
    public void open(Player player){
        Inventory inv = Bukkit.createInventory(
                player,
                27,
                "GambleSMP"
        );
        //decoration
        ItemStack plainItem = new ItemStack(
                Material.BLACK_STAINED_GLASS_PANE,
                1
        );
        for (int i = 0;i < 9; i++){
            inv.setItem(i,plainItem);
        }
        inv.setItem(9,plainItem);
        inv.setItem(17,plainItem);
        for (int i = 18;i < 27; i++){
            inv.setItem(i,plainItem);
        }
        //color deco
        ItemStack plainItemYellow = new ItemStack(
                Material.YELLOW_STAINED_GLASS_PANE,
                1
        );
        ItemStack plainItemRed = new ItemStack(
                Material.RED_STAINED_GLASS_PANE,
                1
        );
        inv.setItem(16,plainItemRed);
        inv.setItem(15,plainItemYellow);
        inv.setItem(14,plainItemRed);
        inv.setItem(12,plainItemYellow);
        inv.setItem(11,plainItemRed);
        inv.setItem(10,plainItemYellow);
        //end
        //middle

        ItemStack reward = new ItemStack(Material.EMERALD,1);

        ItemMeta rewardMeta = reward.getItemMeta();

        rewardMeta.setDisplayName(ChatColor.GREEN +"Shiny emerald");
        //lore
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY +   ":=====================:");
        lore.add(ChatColor.YELLOW + "Test reward!");
        lore.add(ChatColor.GRAY +   ":=====================:");
        rewardMeta.setLore(lore);
        //enchant



        //set meta
        reward.setItemMeta(rewardMeta);

        //enchant
        reward.addUnsafeEnchantment(Enchantment.UNBREAKING,10);


        //set item
        inv.setItem(
                13,
                reward
        );


        player.openInventory(inv);
    }
}
