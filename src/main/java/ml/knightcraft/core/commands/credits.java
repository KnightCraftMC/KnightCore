package ml.knightcraft.core.commands;

import ml.knightcraft.core.Main;
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
            p.playNote(p.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));


            Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                public void run() {
                    p.sendMessage(ChatColor.AQUA + "The server is developed by: " + ChatColor.RED + "Hoptilic");
                    p.playNote(p.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                }
            }, 40l);
        }
        return true;
    }
}
