package ml.knightcraft.core;

import ml.knightcraft.core.generalSection.credits;
import ml.knightcraft.core.punishmentguiSection.commands.initGUI;
import ml.knightcraft.core.punishmentguiSection.guiHandlers.playerSelection;
import ml.knightcraft.core.punishmentguiSection.guiHandlers.punishmentSelection;
import ml.knightcraft.core.utils.LicenseKeyYaml;
import ml.knightcraft.core.punishmentguiSection.guiHandlers.firstGUI;
import ml.knightcraft.core.utils.Licensing;
import ml.knightcraft.core.utils.onLoadNoise;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Main extends JavaPlugin {

    public static Main plugin;

    @Override
    public void onEnable() {
        Logger logger = Bukkit.getLogger();
        

        // Saving config
        logger.info(ChatColor.AQUA + "[CoconutPlugins] " + ChatColor.YELLOW + "Loading/Saving Config");
        LicenseKeyYaml.setup();
        LicenseKeyYaml.get().addDefault("License-Key", "Insert your license key here, which you can get by emailing hoptilic@coconutplugins.ga or by going to support.coconutplugins.ga.");
        LicenseKeyYaml.get().options().copyDefaults(true);
        LicenseKeyYaml.save();
        this.saveDefaultConfig();


        // Loading licensing
        logger.info(ChatColor.AQUA + "[CoconutPlugins] " + ChatColor.YELLOW + "Loading Licensing");
        String licensekey = LicenseKeyYaml.get().getString("License-Key");
        if(!new Licensing(licensekey, "https://licensing.coconutplugins.ga/verify.php", this).register()) return;


        // Loading Instance
        logger.info(ChatColor.AQUA + "[CoconutPlugins] " + ChatColor.YELLOW + "Loading Instance");
        plugin = this;


        // Loading command registration
        logger.info(ChatColor.AQUA + "[CoconutPlugins] " + ChatColor.YELLOW + "Loading Commands");
        getCommand("punish").setExecutor(new initGUI());
        getCommand("credits").setExecutor(new credits());


        // Loading event registration
        logger.info(ChatColor.AQUA + "[CoconutPlugins] " + ChatColor.YELLOW + "Loading Events");
        getServer().getPluginManager().registerEvents(new firstGUI(), this);
        getServer().getPluginManager().registerEvents(new playerSelection(), this);
        getServer().getPluginManager().registerEvents(new punishmentSelection(), this);


        // Finished loading
        logger.info(ChatColor.AQUA + "[CoconutPlugins] " + ChatColor.GREEN + "Finished loading successfully!");
        onLoadNoise.onLoadSound();


    }

    @Override
    public void onDisable() {
        Logger logger = Bukkit.getLogger();
        logger.info(ChatColor.AQUA + "[CoconutPlugins] " + ChatColor.GREEN + "Finished unloading successfully!");
    }
}
