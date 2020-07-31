package ml.knightcraft.core;

import ml.knightcraft.core.itemstacks.initGUI;
import ml.knightcraft.core.utils.LicenseKeyYaml;
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


        // Loading event registration
        logger.info(ChatColor.AQUA + "[CoconutPlugins] " + ChatColor.YELLOW + "Loading Events");


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
