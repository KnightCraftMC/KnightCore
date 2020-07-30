package ml.knightcraft.core.utils;

import ml.knightcraft.core.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class onLoadNoise {
    public static void onLoadSound(){
        Plugin plugin = Main.plugin;

        for (Player player : Bukkit.getOnlinePlayers()){
            player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
            player.sendMessage(ChatColor.AQUA + "[CoconutPlugins]: " + ChatColor.YELLOW + "Plugin loaded successfully!");
        }
    }}
