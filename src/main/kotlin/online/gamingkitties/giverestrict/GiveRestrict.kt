package online.gamingkitties.giverestrict

import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerCommandPreprocessEvent
import org.bukkit.plugin.java.JavaPlugin


class GiveRestrict : JavaPlugin(), Listener {

    /**
     * Register the listener when plugin is enabled
     */
    override fun onEnable() {
        server.pluginManager.registerEvents(this, this)
        super.onEnable()
    }

    /**
     * Filter out /give commands and check if user has permission to /give the item
     */
    @EventHandler(priority = EventPriority.HIGH)
    fun checkGivePermission(command: PlayerCommandPreprocessEvent) {
        // Check if command is /give
        if (command.message.split(' ').getOrNull(0) != "/give") return

        // Get the item in the /give command
        val item =
            command.message
                .split(' ')
                .getOrNull(2)
                ?.removePrefix("minecraft:")
                ?.replace(Regex("\\{.*}"), "") ?: return

        // Get target of the /give command
        val target = command.message.split(' ').getOrNull(1) ?: return

        // Check that user has permission for item
        if (!command.player.hasPermission("giverestrict.$item")) {
            // If they don't, tell them and cancel the command
            command.player.sendMessage(
                "You don't have permission to give $item to " +
                        if (determineIfTargetIsPlayer(command.player, target)) "yourself" else target
            )
            command.isCancelled = true
        }
    }

    private fun determineIfTargetIsPlayer(player: Player, target: String) = player.name == target

}