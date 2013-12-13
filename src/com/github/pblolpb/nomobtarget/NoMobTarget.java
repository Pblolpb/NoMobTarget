package com.github.pblolpb.nomobtarget;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffectType;

public class NoMobTarget extends JavaPlugin implements Listener {

	public void onEnable () {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this, this);
	}

	@EventHandler
	public void onEntityTarge(EntityTargetEvent event){
		if(event.getTarget() instanceof Player){
			if(event.getEntityType().equals(EntityType.BLAZE) || 
					event.getEntityType().equals(EntityType.CAVE_SPIDER) ||
					event.getEntityType().equals(EntityType.CREEPER) || 
					event.getEntityType().equals(EntityType.ENDER_DRAGON) || 
					event.getEntityType().equals(EntityType.ENDERMAN) || 
					event.getEntityType().equals(EntityType.GHAST) || 
					event.getEntityType().equals(EntityType.IRON_GOLEM) || 
					event.getEntityType().equals(EntityType.MAGMA_CUBE) || 
					event.getEntityType().equals(EntityType.PIG_ZOMBIE) || 
					event.getEntityType().equals(EntityType.SILVERFISH) || 
					event.getEntityType().equals(EntityType.SKELETON) || 
					event.getEntityType().equals(EntityType.SLIME) || 
					event.getEntityType().equals(EntityType.SPIDER) || 
					event.getEntityType().equals(EntityType.WITCH) || 
					event.getEntityType().equals(EntityType.WITHER) ||
					event.getEntityType().equals(EntityType.ZOMBIE)) {
				Player player = (Player) event.getTarget();
				if(player.hasPotionEffect(PotionEffectType.INVISIBILITY)){	
					event.setCancelled(true);
				}
			}
		}
	}
}
