package com.mono.infosender.loaders.ext;

import com.mono.infosender.loaders.AbsLoader;
import lombok.Getter;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.List;

@Getter
public class PlayersLoader<P extends JavaPlugin> extends AbsLoader {

    private P pluginName;
    private HashMap<String, Player> players = new HashMap<>();

    @Override
    public void load() {
        pluginName.getServer().getOnlinePlayers().forEach(player -> players.put(player.getName(), player));
        List<OfflinePlayer> offlinePlayers = List.of(pluginName.getServer().getOfflinePlayers());
        offlinePlayers.forEach(player -> players.put(player.getName(), player.getPlayer()));
    }

    @Override
    public HashMap getBukkit() {
        return players;
    }
}
