package me.piksel.gambleSMP.listeners.test;

import me.piksel.gambleSMP.events.test.testEvent;
import me.piksel.gambleSMP.guis.test.test;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class invListener implements Listener {
    public Boolean can(InventoryClickEvent event){
        if (
                event.getSlot() != 13
        ){
            return true;
        }
        return false;
    }



    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        // 1. Check if the inventory exists and has the correct title
        if (event.getView().getTitle().equals("GambleSMP")) {
            if (event.getInventory().getItem(13).getType() == Material.AIR ||event.getInventory().getItem(13).getType() == null){return;}
            Player player = null;
            HumanEntity clicked = event.getWhoClicked();

            if (clicked instanceof Player){
                player = (Player) event.getWhoClicked();
            }


            if (!can(event)){

                new testEvent().startEvent(player);
                event.setCancelled(true);
                event.getInventory().close();
                return;
            }
            // 2. Cancel the event to stop taking/placing items
            event.setCancelled(true);

            // 3. (Optional) Handle clicks on specific items
        }
    }
    @EventHandler
    public void onInventoryDrag(InventoryDragEvent event) {
        // Cancel dragging items into your custom GUI

        if (event.getView().getTitle().equals("GambleSMP")) {
            event.setCancelled(true);
        }
    }
    @EventHandler
    public void onClose(InventoryCloseEvent event){
        if (event.getView().getTitle().equals("GambleSMP")){
            if (event.getInventory().getItem(13).getType() == Material.AIR ||event.getInventory().getItem(13).getType() == null){return;}

        }
    }


    @EventHandler
    public void onUse(PlayerInteractEvent event) {
        if (!event.getAction().toString().contains("RIGHT_CLICK")) return;
        ItemStack item = event.getItem();
        Player player = event.getPlayer();
        if (item.getType() != Material.EMERALD && item.getEnchantmentLevel(Enchantment.UNBREAKING) >= 10){return;}
        item.setAmount(item.getAmount() - 1);
        new test().open(player);
    }

}
