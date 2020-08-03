package ml.knightcraft.core.punishmentguiSection.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class selectPlayer {
    public static Inventory selectPunish(Player p){
            Inventory selectGUI = Bukkit.createInventory(p, 54, "Player Selection");

            // First Item
            ItemStack item1 = new ItemStack(Material.ARROW, 1);
            ItemMeta item1_meta = item1.getItemMeta();
            item1_meta.setDisplayName(ChatColor.RED + "Go Back");
            item1.setItemMeta(item1_meta);


            // Add items & add to player
            selectGUI.setItem(45, item1);


            for (Player all : Bukkit.getOnlinePlayers()){
                ItemStack item = new ItemStack(Material.FEATHER, 1);
                ItemMeta item_meta = item.getItemMeta();
                item_meta.setDisplayName(all.getDisplayName());
                item.setItemMeta(item_meta);

                selectGUI.addItem(item);
            }






        return selectGUI;
    }
}
