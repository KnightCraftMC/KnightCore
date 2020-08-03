package ml.knightcraft.core.punishmentguiSection.commands;

import ml.knightcraft.core.punishmentguiSection.guis.initialGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class initGUI implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player p = (Player) sender;
            Inventory initGUI = initialGUI.initialGUI(p);
            p.openInventory(initGUI);
        }
        return true;
    }
}