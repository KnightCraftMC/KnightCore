package ml.knightcraft.core.punishmentguiSection.guiHandlers;

import ml.knightcraft.core.punishmentguiSection.guis.selectPlayer;
import ml.knightcraft.core.utils.dingNoise;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class firstGUI implements Listener {
    // First gui
    @EventHandler
    public void onMenuClick(InventoryClickEvent e) {
        // First gui
        try {
            Player p = (Player) e.getWhoClicked();
            if (e.getView().getTitle().equalsIgnoreCase("Select a function")) {
                e.setCancelled(true);
                if (e.getCurrentItem().getType().equals(Material.RED_WOOL)) {
                    Inventory selectMenu1 = selectPlayer.selectPunish(p);

                    p.sendMessage(ChatColor.RED + "Selected: Player Selection");
                    dingNoise.dingDing(p);
                    p.closeInventory();
                    p.openInventory(selectMenu1);
                }
            }
        }catch(NullPointerException exception){
            e.setCancelled(true);
        }
    }
}
