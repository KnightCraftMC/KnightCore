package ml.knightcraft.core.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class selectMenu {
    public static Inventory selectPunish(Player p){
            Inventory selectGUI = Bukkit.createInventory(p, 54, "Punishment GUI");

            // First Item
            ItemStack item1 = new ItemStack(Material.ARROW, 1);
            ItemMeta item1_meta = item1.getItemMeta();
            item1_meta.setDisplayName(ChatColor.RED + "Go Back");
            item1.setItemMeta(item1_meta);
            // Add items & add to player
            selectGUI.setItem(45, item1);
        return selectGUI;
    }
}
