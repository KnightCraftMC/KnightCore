package ml.knightcraft.core.punishmentguiSection.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class initialGUI {
    public static Inventory initialGUI(Player p){
        Inventory initGUI = Bukkit.createInventory(p, 9, "Select a function");

        // First Item
        ItemStack item1 = new ItemStack(Material.RED_WOOL, 1);
        ItemMeta item1_meta = item1.getItemMeta();
        item1_meta.setDisplayName(ChatColor.RED + "Punishment GUI");
        item1.setItemMeta(item1_meta);


        // Add items & add to player
        initGUI.setItem(4, item1);
        return initGUI;
    }
}
