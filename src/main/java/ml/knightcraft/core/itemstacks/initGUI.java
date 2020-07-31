package ml.knightcraft.core.itemstacks;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class initGUI implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player p = (Player) sender;

            Inventory initGUI = Bukkit.createInventory(p, 9, "Select a function");

            // First Item
            ItemStack item1 = new ItemStack(Material.RED_WOOL, 1);
            ItemMeta item1_meta = item1.getItemMeta();
            item1_meta.setDisplayName(ChatColor.RED + "It works!");
            item1.setItemMeta(item1_meta);




            initGUI.addItem(item1);
            p.openInventory(initGUI);
        }



        return true;
    }
}