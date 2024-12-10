package plagin_pust_game6;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Hello world!
 *
 */
public class App extends JavaPlugin
{

        @Override
        public void onEnable() {
                getLogger().info("Плагин запущен!");

                Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(), this);
                Bukkit.getPluginManager().registerEvents(new TeleportListener(), this);
        }


        @Override
        public void onDisable() {

                getLogger().info("Плагин остановлен.");

        }

}
