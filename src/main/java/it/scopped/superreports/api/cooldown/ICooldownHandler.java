package it.scopped.superreports.api.cooldown;

import org.bukkit.entity.Player;

import java.util.Map;
import java.util.UUID;

public interface ICooldownHandler {

	void put(Player player, long amount);
	void flush(Player player);

	long getRemaining(Player player);

	Map<UUID, Long> getCooldowns();
}