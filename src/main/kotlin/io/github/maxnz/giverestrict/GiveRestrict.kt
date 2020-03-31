/*
 *  Copyright (c) 2020 Max Narvaez
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */

package io.github.maxnz.giverestrict

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