package ml.knightcraft.core.utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class guiHandler implements Listener {
    // First gui
    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        if(e.getView().getTitle().equalsIgnoreCase("Select a function")){
            e.setCancelled(true);
            if(e.getCurrentItem().getType().equals(Material.RED_WOOL)) {
                p.sendMessage(ChatColor.RED + "It works!");
                p.closeInventory();
            }
        }
    }
}
