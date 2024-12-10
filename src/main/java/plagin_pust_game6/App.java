package plagin_pust_game6;

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

        // Регистрируем обработчик событий
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        }

        @Override
        public void onDisable() {
        getLogger().info("Плагин остановлен.");
        }

}
