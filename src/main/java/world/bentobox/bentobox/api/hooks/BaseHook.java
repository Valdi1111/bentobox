package world.bentobox.bentobox.api.hooks;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

/**
 * @author Poslovitch
 */
public abstract class BaseHook implements Hook {

    private Plugin plugin;
    private boolean pluginAvailable;

    public BaseHook(String plugin) {
        this.plugin = Bukkit.getPluginManager().getPlugin(plugin);
        this.pluginAvailable = this.plugin.isEnabled();
    }

    @Override
    public Plugin getPlugin() {
        return plugin;
    }

    @Override
    public boolean isPluginAvailable() {
        return pluginAvailable;
    }
}
