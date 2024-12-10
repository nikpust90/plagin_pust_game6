package plagin_pust_game6;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Получаем игрока, который зашел на сервер
        Player player = event.getPlayer();

        // Отправляем игроку приветственное сообщение
        player.sendMessage("Добро пожаловать на сервер, " + player.getName() + "!");

        // Выводим сообщение в консоль сервера
        System.out.println(player.getName() + " зашел на сервер!");
    }
}
