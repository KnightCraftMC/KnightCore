package ml.knightcraft.core.commands;

import ml.knightcraft.core.Main;
import ml.knightcraft.core.utils.dingNoise;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class credits implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Plugin plugin = Main.plugin;


        if(sender instanceof Player){
            Player p = (Player) sender;
            p.sendMessage(ChatColor.AQUA + "The server is owner by: " + ChatColor.RED + "Vlady");
            dingNoise.dingDing((Player)sender);


            Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                public void run() {
                    p.sendMessage(ChatColor.AQUA + "The server is developed by: " + ChatColor.RED + "Hoptilic");
                    dingNoise.dingDing((Player)sender);
                }
            }, 40l);
        }
        return true;
    }
}
