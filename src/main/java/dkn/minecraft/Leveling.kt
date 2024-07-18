package dkn.minecraft

import org.bukkit.plugin.java.JavaPlugin

class Leveling : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("[Leveling] Стартуем!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("[Leveling] Отключаюсь...")
    }
}
