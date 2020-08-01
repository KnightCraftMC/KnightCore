package ml.knightcraft.core.guiHandlers;

import ml.knightcraft.core.guis.initialGUI;
import ml.knightcraft.core.utils.dingNoise;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class punishmentGUI implements Listener {
    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
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
