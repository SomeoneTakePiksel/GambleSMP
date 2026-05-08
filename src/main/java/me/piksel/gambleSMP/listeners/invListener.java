package me.piksel.gambleSMP.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;

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
            if (!can(event)){return;}
            // 2. Cancel the event to stop taking/placing items
            event.setCancelled(true);

            // 3. (Optional) Handle clicks on specific items
            if (event.getCurrentItem() != null && event.getCurrentItem().getType() != Material.AIR) {
                Player player = (Player) event.getWhoClicked();
            }
        }
    }
    @EventHandler
    public void onInventoryDrag(InventoryDragEvent event) {
        // Cancel dragging items into your custom GUI

        if (event.getView().getTitle().equals("GambleSMP")) {
            event.setCancelled(true);
        }
    }



}
