package it.scopped.superreports.cooldown;

import it.scopped.superreports.api.cooldown.ICooldownHandler;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CooldownManager implements ICooldownHandler {

	private final Map<UUID, Long> cooldowns = new HashMap<>();

	@Override
	public void put(Player player, long amount) {
		cooldowns.put(player.getUniqueId(), System.currentTimeMillis() + amount);
	}

	@Override
	public void flush(Player player) {
		cooldowns.remove(player.getUniqueId());
	}

	@Override
	public long getRemaining(Player player) {
		long currentTime = System.currentTimeMillis();
		Long endTime = cooldowns.get(player.getUniqueId());

		if (endTime == null || currentTime >= endTime) {
			flush(player);
			return 0L;
		}

		return endTime - currentTime;
	}

	@Override
	public Map<UUID, Long> getCooldowns() {
		return cooldowns;
	}
}