package com.mono.infosender;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class InfoSender extends JavaPlugin {

    @Override
    public void onEnable() {
        Logger logger = getLogger();
        logger.info("InfoSender has been enabled! Contact github.com/MonoSudji for more information.");
    }

    @Override
    public void onDisable() {

    }
}
