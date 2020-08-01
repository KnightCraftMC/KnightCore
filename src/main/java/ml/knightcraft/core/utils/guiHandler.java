package ml.knightcraft.core.utils;

import ml.knightcraft.core.guis.initialGUI;
import ml.knightcraft.core.guis.selectMenu;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class guiHandler implements Listener {
    // First gui
    @EventHandler
    public void onMenuClick(InventoryClickEvent e) {
        // First gui
        try {
            Player p = (Player) e.getWhoClicked();
            if (e.getView().getTitle().equalsIgnoreCase("Select a function")) {
                e.setCancelled(true);
                if (e.getCurrentItem().getType().equals(Material.RED_WOOL)) {
                    Inventory selectMenu1 = selectMenu.selectPunish(p);

                    p.sendMessage(ChatColor.RED + "Selected: PunishmentGUI");
                    dingNoise.dingDing(p);
                    p.closeInventory();
                    p.openInventory(selectMenu1);
                }
            }
        }catch(NullPointerException exception){
            e.setCancelled(true);
        }

        try {
            Player p = (Player) e.getWhoClicked();
            if (e.getView().getTitle().equalsIgnoreCase("Punishment GUI")){
                e.setCancelled(true);
                // Go back and go forwards
                if (e.getCurrentItem().getType().equals(Material.ARROW)){
                    Inventory initGUI = initialGUI.initialGUI(p);

                    p.sendMessage(ChatColor.RED + "Selected: PunishmentGUI");
                    dingNoise.dingDing(p);
                    p.closeInventory();
                    p.openInventory(initGUI);
                }
            }
        }catch(NullPointerException exception){
            e.setCancelled(true);
        }
    }
}
