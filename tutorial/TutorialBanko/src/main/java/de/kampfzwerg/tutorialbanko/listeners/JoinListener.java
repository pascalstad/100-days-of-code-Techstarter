package de.kampfzwerg.tutorialbanko.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.GREEN.toString() + ChatColor.UNDERLINE + player.getName() + " hat den Server betreten ");
        player.sendMessage(ChatColor.GOLD + "Willkommen auf dem Server! \n\"Viel Spaß und viel Vergnügen :^)");
    }
}
