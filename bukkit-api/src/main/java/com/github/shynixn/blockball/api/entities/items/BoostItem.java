package com.github.shynixn.blockball.api.entities.items;

import com.github.shynixn.blockball.api.persistence.entity.PotionEffectMeta;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

import java.io.Serializable;

public interface BoostItem extends Serializable, ConfigurationSerializable {
    PotionEffectMeta[] getPotionEffects();

    void setPotionEffect(PotionEffectMeta potionEffect);

    void removePotionEffect(PotionEffectType type);

    PotionEffectMeta getPotionEffect(PotionEffectType type);

    String getDisplayName();

    void setDisplayName(String displayName);

    Spawnrate getSpawnrate();

    void setSpawnrate(Spawnrate spawnrate);

    int getId();

    void setId(int id);

    int getDamage();

    void setDamage(int damage);

    String getOwner();

    void setOwner(String owner);

    ItemStack generate();

    void apply(Player player);
}