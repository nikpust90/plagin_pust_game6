package plagin_pust_game6;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.EnumSet;

public class TeleportListener implements Listener {
    private static final EnumSet<Material> WOODEN_BLOCKS = EnumSet.of(Material.OAK_LOG, Material.BIRCH_LOG, Material.SPRUCE_LOG, Material.JUNGLE_LOG,
            Material.ACACIA_LOG, Material.DARK_OAK_LOG, Material.MANGROVE_LOG, Material.CHERRY_LOG
    );
    @EventHandler
    public void onPlayerRightTeleport(PlayerInteractEvent event) {
        // Проверяем, что игрок кликнул правой кнопкой мыши
        if(event.getAction().toString().contains("RIGHT_CLICK")) {
            // Проверяем, что клик был по блоку дерева
            Block clickedBlock = event.getClickedBlock();
            if(event.getClickedBlock() != null && WOODEN_BLOCKS.contains(event.getClickedBlock().getType())) {
                // Получаем игрока
                Player player = event.getPlayer();
                //получаем координаты рядом с деревом
                Location locationToTeleport = clickedBlock.getLocation().add(1, 0,0);

                //телепортируем игрока на дерево
                player.teleport(locationToTeleport);
                player.sendMessage("Вы телепортированы к дереву на координаты: "
                        + locationToTeleport.getX() + ", "
                        + locationToTeleport.getY() + ", "
                        + locationToTeleport.getZ());
            }
        }
    }
}
