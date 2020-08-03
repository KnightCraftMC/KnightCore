package ml.knightcraft.core.punishmentguiSection.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class selectPunishment {
    public static Inventory initialGUI(Player p){
        Inventory selectAPunishment = Bukkit.createInventory(p, 54, "Select a Punishment");

        // Go back item
        ItemStack item1 = new ItemStack(Material.ARROW, 1);
        ItemMeta item1_meta = item1.getItemMeta();
        item1_meta.setDisplayName(ChatColor.RED + "Go Back");
        item1.setItemMeta(item1_meta);


        // Add items & add to player
        selectAPunishment.setItem(45, item1);
        return selectAPunishment;
    }
}
