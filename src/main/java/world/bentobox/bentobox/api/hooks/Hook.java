package world.bentobox.bentobox.api.hooks;

import org.bukkit.plugin.Plugin;

/**
 * @author Poslovitch
 */
public interface Hook {

    Plugin getPlugin();

    boolean isPluginAvailable();

    boolean hook();


}
