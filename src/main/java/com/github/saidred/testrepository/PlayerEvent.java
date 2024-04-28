package com.github.saidred.testrepository;

//
import static org.bukkit.Bukkit.getLogger;

import org.bukkit.entity.Player;

import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.EquipmentSlot;

import java.util.Objects;
import java.util.regex.*;

public class PlayerEvent implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent eve){
        getLogger().info("PlayerInteractEvent Start");
        Player pl = eve.getPlayer();
        getLogger().info(pl.getDisplayName());
        Action ac=eve.getAction();
        getLogger().info(ac.name());
        Pattern regright=Pattern.compile("^RIGHT_CLICK_");
        if(regright.matcher(ac.name()).find()){
            getLogger().info("Right click event");
        }
        Pattern regleft=Pattern.compile("^LEFT_CLICK_");
        if(regleft.matcher(ac.name()).find()){
            getLogger().info("Left click event");
        }
    }
}
