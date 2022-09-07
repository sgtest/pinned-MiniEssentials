package me.bobsmiley.miniessentials;

import me.bobsmiley.miniessentials.commands.*;
import me.bobsmiley.miniessentials.commands.statistics.CommandPlaytime;
import me.bobsmiley.miniessentials.commands.time.CommandDay;
import me.bobsmiley.miniessentials.commands.time.CommandNight;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public final class MiniEssentials extends JavaPlugin {

    @Override
    public void onEnable() {
        Server server = this.getServer();

        this.getCommand("repair").setExecutor(new CommandRepair());
        this.getCommand("teleport").setExecutor(new CommandTeleport(server));
        this.getCommand("clearinventory").setExecutor(new CommandClearInventory(server));
        this.getCommand("weather").setExecutor(new CommandWeather());
        this.getCommand("speed").setExecutor(new CommandSpeed());
        this.getCommand("day").setExecutor(new CommandDay());
        this.getCommand("night").setExecutor(new CommandNight());
        this.getCommand("playtime").setExecutor(new CommandPlaytime(server));
        this.getCommand("list").setExecutor(new CommandList(server));


        //getServer().getPluginManager().registerEvent(new ManageChatAndCommandListener(), this);

    }

    @Override
    public void onDisable() {

    }
}