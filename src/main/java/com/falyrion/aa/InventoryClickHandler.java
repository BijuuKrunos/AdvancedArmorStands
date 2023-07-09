package com.falyrion.aa;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.util.EulerAngle;


public class InventoryClickHandler implements Listener {

    /**
     * Event listener to handle click events
     */
    @EventHandler
    public void onInventoryClick (InventoryClickEvent clickEvent) {

        if (clickEvent.getClickedInventory() != null) {
            if (clickEvent.getCurrentItem() != null) {
                if (clickEvent.getCurrentItem().getType() != Material.AIR) {

                    String inventoryTitle = clickEvent.getView().getTitle();

                    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Handle Click Events for Main Menu

                    if (inventoryTitle.equalsIgnoreCase("Rüstungsständer")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventMainMenu(itemName, player);
                        }
                    }

                    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Handle Click Events for Basic Settings Menu

                    else if (inventoryTitle.equalsIgnoreCase("RS Grundeinstellungen")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventBasicMenu(itemName, player);
                        }
                    }

                    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Handle Click Events for Body Parts Settings Menu

                    else if (inventoryTitle.equalsIgnoreCase("RS Körpereinstellungen")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventBodyPartMenu(itemName, player);
                        }
                    }

                    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Handle Click Events for Movement and Rotation Menus

                    else if (inventoryTitle.equalsIgnoreCase("Rüstungsständer bewegen§8: §a0§8.§a1")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventMovementMenu(itemName, player, (float) 0.1);
                        }
                    }

                    else if (inventoryTitle.equalsIgnoreCase("Rüstungsständer bewegen§8: §a0§8.§a5")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventMovementMenu(itemName, player, (float) 0.5);
                        }
                    }

                    else if (inventoryTitle.equalsIgnoreCase("Rüstungsständer bewegen§8: §a1")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventMovementMenu(itemName, player, (float) 1);
                        }
                    }

                    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    // Handle Click Events for Preset Pose Menu

                    else if (inventoryTitle.equalsIgnoreCase("Rüstungsständer Posen")) {

                        clickEvent.setCancelled(true);
                        Player player = (Player) clickEvent.getWhoClicked();

                        if (clickEvent.getClick().isKeyboardClick()) {
                            player.updateInventory();
                        }

                        if (clickEvent.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
                            player.updateInventory();
                        }

                        if (clickEvent.getClickedInventory() == clickEvent.getView().getTopInventory()) {

                            String itemName = clickEvent.getCurrentItem().getItemMeta().getDisplayName();

                            handleEventPresetPoseMenu(itemName, player);
                        }
                    }



                }
            }
        }
    }


    /**
     * Runs an action based on a clicked item. Called by InventoryClickEvent-EventHandler.
     *
     * @param itemName: String, The item that was clicked on
     * @param player: Player, The player who clicked
     */
    private void handleEventMainMenu(String itemName, Player player) {

        switch(itemName) {
            case "§7§lGrundeinstellungen":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 2);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§7§lKörpereinstellungen":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 3);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§7§lBewegung und Drehung":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 5);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§7§lVordefinierte Posen":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 7);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§7§lKöpfe":

            case "§7§lHelp and Info":
                AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                break;

            case "§7§lSchließen":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;
        }
    }


    /**
     * Runs an action based on a clicked item. Called by InventoryClickEvent-EventHandler.
     *
     * @param itemName: String, The item that was clicked on
     * @param player: Player, The player who clicked
     */
    private void handleEventBasicMenu(String itemName, Player player) {

        switch(itemName) {
            case "§7§lArme":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!armorStand.hasArms()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setArms(true);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§7§lSteinplatte unsichtbar":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (armorStand.hasBasePlate()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setBasePlate(false);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§7§lSteinplatte sichtbar":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!armorStand.hasBasePlate()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setBasePlate(true);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§7§lSchwerkraft aus":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (armorStand.hasGravity()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setGravity(false);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }

                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§7§lSchwerkraft an":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!armorStand.hasGravity()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setGravity(true);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§7§lUnsichtbar":
                if (player.hasPermission("aa.visible")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (armorStand.isVisible()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setVisible(false);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§7§lSichtbar":
                if (player.hasPermission("aa.visible")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!armorStand.isVisible()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setVisible(true);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§7§lKlein":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!armorStand.isSmall()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setSmall(true);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§7§lNormale Größe":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (armorStand.isSmall()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)){
                                    continue;
                                }
                                armorStand.setSmall(false);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§7§lNamen ausblenden":
                if (player.hasPermission("aa.names")) {
                    for (Entity entity : player.getNearbyEntities(0.5, 0.5, 0.5)){
                        if (entity instanceof ArmorStand armorStand) {
                            if (armorStand.isCustomNameVisible()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                    continue;
                                }
                                armorStand.setCustomNameVisible(false);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§7§lNamenshilfe":
                if (player.hasPermission("aa.names")) {
                    player.sendMessage("§8===[ §9RS §8| §9Namenshilfe §8]===");
                    player.sendMessage("§7Benutze §8/§6aa name §8<§6Text§8> §7um deinen Rüstungsständer einen individuellen Namen zu geben§8! §7Der Befehl wirkt auf jeden Rüstungsständer in §a1 Block §7Radius§8.");
                    player.sendMessage("§7Schreibe einen §a& §7Farb§8- §7oder Textcode vor dem Namen um diesen zu beinflussen§8.");
                    player.sendMessage("  ");
                    player.sendMessage("§7Beispiel§8: '/§6aa name &3Ich &6&lbin &fToll§8' §7wird zu §8'§3Ich §6§lbin §fToll§8' ");
                    player.sendMessage("§8===========================");

                    player.closeInventory();
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;

            case "§7§lLeuchtend an":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!armorStand.isGlowing()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)){
                                    continue;
                                }
                                armorStand.setGlowing(true);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§7§lLeuchtend aus":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (armorStand.isGlowing()) {
                                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)){
                                    continue;
                                }
                                armorStand.setGlowing(false);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else{
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§7§lUnzerstörbar":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(2, 2, 2)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)){
                                continue;
                            }
                            if (armorStand.isInvulnerable()) {
                                armorStand.setInvulnerable(false);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            } else {
                                armorStand.setInvulnerable(true);
                                player.sendMessage(ChatColor.GOLD + AdvancedArmorStandsMain.getInstance().getMessageString("modification_menu", player.getLocale()));
                            }
                        }
                    }
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                }
                break;

            case "§7§lIndividueller Name":

            case "§7§lHilfe?":
                AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                break;

            case "§7§lZurück":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 1);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;
        }
    }


    /**
     * Runs an action based on a clicked item. Called by InventoryClickEvent-EventHandler.
     *
     * @param itemName: String, The item that was clicked on
     * @param player: Player, The player who clicked
     */
    private void handleEventBodyPartMenu(String itemName, Player player) {

        switch (itemName) {
            case "§7§lKopf Position":

            case "§7§lKörper Position":

            case "§7§lRechte Arm Position":

            case "§7§lLinke Arm Position":

            case "§7§lRechte Bein Position":

            case "§7§lLinke Bein Position":

            case "§7§lHilfe§8?":
                AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                break;

            case "§7§lZurück":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 1);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;
        }
    }


    /**
     * Runs an action based on a clicked item. Called by InventoryClickEvent-EventHandler.
     *
     * @param itemName: String, The item that was clicked on
     * @param player: Player, The player who clicked
     */
    private void handleEventMovementMenu(String itemName, Player player, float distance) {

        /**
         * Runs an action based on a clicked item. Called by InventoryClickEvent-EventHandler.
         */

        switch (itemName) {

            case "§7§lZurück":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 1);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§7§lHilfe§8?":
            case "§7§lDistanz§8: §a0§8.§a1 Blöcke §8(§7Activ§8)":
            case "§7§lDistanz§8: §a0§8.§a5 Blöcke §8(§7Activ§8)":
            case "§7§lDistanz§8: §a1 Block §8(§7Activ§8)":
                AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                break;

            case "§7§lDistanz§8: §a1 Block":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 6);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§7§lDistanz§8: §a0§8.§a5 Blöcke":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 5);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "§7§lDistanz§8: §a0§8.§a1 Blöcke":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 4);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;


            // Nav Cross

            case "§7§lVorwärts":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                continue;
                            }
                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX() + distance,
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;

            case "§7§lRückwärts":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)){
                                continue;
                            }
                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX() - distance,
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;

            case "§7§lRechts":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                continue;
                            }
                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ() + distance
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;

            case "§7§lLinks":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                continue;
                            }
                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ() - distance
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;


            // Move up and down

            case "§7§lHoch":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                continue;
                            }
                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY() + distance, armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;

            case "§7§lRunter":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                continue;
                            }
                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY() - distance, armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw);

                            armorStand.teleport(newLocation);

                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;


            // Rotate

            case "§7§lNach links drehen":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                                continue;
                            }
                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw + 45);

                            armorStand.teleport(newLocation);

                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;

            case "§7§lNach rechts drehen":
                if (player.hasPermission("aa.edit")) {
                    for (Entity entity : player.getNearbyEntities(distance, distance, distance)) {
                        if (entity instanceof ArmorStand armorStand) {
                            if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)){
                                continue;
                            }
                            Location newLocation = new Location(
                                    armorStand.getWorld(), armorStand.getLocation().getX(),
                                    armorStand.getLocation().getY(), armorStand.getLocation().getZ()
                            );

                            Float armorStandYaw = armorStand.getLocation().getYaw();
                            newLocation.setYaw(armorStandYaw - 45);

                            armorStand.teleport(newLocation);

                            AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                        }
                    }
                } else {
                    AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;


        }
    }


    /**
     * Helper function for handlePresetPoseMenu(). Modifies an armor stands body parts near a player based on given input
     * angles for all body parts.
     */
    private void setArmorStandPose(Player player, double rightArmRoll, double rightArmYaw, double rightArmPitch,
                                   double leftArmRoll, double leftArmYaw, double leftArmPitch,
                                   double rightLegRoll, double rightLegYaw, double rightLegPitch,
                                   double leftLegRoll, double LeftLegYaw, double llp_yaw,
                                   double headRoll, double headYaw, double headPitch,
                                   double bodyRoll, double bodyYaw, double bodyPitch) {

        for (Entity entity : player.getNearbyEntities(1, 1, 1)) {
            if (entity instanceof ArmorStand armorStand) {

                if (!AdvancedArmorStandsMain.getInstance().canChange(armorStand, player)) {
                    continue;
                }
                // Set general settings
                armorStand.setArms(true);
                armorStand.setBasePlate(false);
                armorStand.setGravity(false);

                // Calculate and set right arm settings
                rightArmRoll = Math.toRadians(rightArmRoll);
                rightArmYaw = Math.toRadians(rightArmYaw);
                rightArmPitch = Math.toRadians(rightArmPitch);
                EulerAngle rightArmEulerAngle = new EulerAngle(rightArmRoll, rightArmYaw, rightArmPitch);
                armorStand.setRightArmPose(rightArmEulerAngle);

                // Calculate and set left arm settings
                leftArmRoll = Math.toRadians(leftArmRoll);
                leftArmYaw = Math.toRadians(leftArmYaw);
                leftArmPitch = Math.toRadians(leftArmPitch);
                EulerAngle leftArmEulerAngle = new EulerAngle(leftArmRoll, leftArmYaw, leftArmPitch);
                armorStand.setLeftArmPose(leftArmEulerAngle);

                // Calculate and set right leg settings
                rightLegRoll = Math.toRadians(rightLegRoll);
                rightLegYaw = Math.toRadians(rightLegYaw);
                rightLegPitch = Math.toRadians(rightLegPitch);
                EulerAngle rightLegEulerAngle = new EulerAngle(rightLegRoll, rightLegYaw, rightLegPitch);
                armorStand.setRightLegPose(rightLegEulerAngle);

                // Calculate and set left leg settings
                leftLegRoll = Math.toRadians(leftLegRoll);
                LeftLegYaw = Math.toRadians(LeftLegYaw);
                llp_yaw = Math.toRadians(llp_yaw);
                EulerAngle leftLegEulerAngle = new EulerAngle(leftLegRoll, LeftLegYaw, llp_yaw);
                armorStand.setLeftLegPose(leftLegEulerAngle);

                // Calculate and set body settings
                bodyRoll = Math.toRadians(bodyRoll);
                bodyYaw = Math.toRadians(bodyYaw);
                bodyPitch = Math.toRadians(bodyPitch);
                EulerAngle bodyEulerAngle = new EulerAngle(bodyRoll, bodyYaw, bodyPitch);
                armorStand.setBodyPose(bodyEulerAngle);

                // Calculate and set head settings
                headRoll = Math.toRadians(headRoll);
                headYaw = Math.toRadians(headYaw);
                headPitch = Math.toRadians(headPitch);
                EulerAngle headEulerAngle = new EulerAngle(headRoll, headYaw, headPitch);
                armorStand.setHeadPose(headEulerAngle);

                // Send success message to player
                player.sendMessage("§8[§bAA§8] §7Ein naher Rüstungsständer wurde editiert§8!");
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
        }
    }



    /**
     * Runs an action based on a clicked item. Called by InventoryClickEvent-EventHandler.
     *
     * @param itemName: String, The item that was clicked on
     * @param player: Player, The player who clicked
     */
    private void handleEventPresetPoseMenu(String itemName, Player player) {

        switch (itemName) {
            case "§7§lStandard 1" -> {
                setArmorStandPose(player, 345, 0, 10, 350, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§Standard 2" -> {
                setArmorStandPose(player, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lLaufend 1" -> {
                setArmorStandPose(player, 345, 0, 10, 350, 0, 350, 340, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lLaufend 2" -> {
                setArmorStandPose(player, 300, 40, 350, 20, 0, 350, 10, 0, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lSitzend" -> {
                setArmorStandPose(player, 345, 0, 10, 350, 0, 350, 280, 20, 0, 280, 340, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lWinkend" -> {
                setArmorStandPose(player, 220, 20, 0, 350, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lBegrüßend 1" -> {
                setArmorStandPose(player, 260, 20, 0, 260, 340, 0, 340, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lBegrüßend 2" -> {
                setArmorStandPose(player, 240, 50, 0, 240, 320, 0, 10, 0, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lBegrüßend 3" -> {
                setArmorStandPose(player, 260, 10, 0, 260, 350, 0, 320, 0, 0, 10, 0, 0, 340, 0, 350, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lJubel 1" -> {
                setArmorStandPose(player, 220, 20, 0, 220, 340, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lJubel 2" -> {
                setArmorStandPose(player, 250, 60, 0, 20, 10, 0, 10, 0, 0, 350, 0, 0, 340, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lErbauer" -> {
                setArmorStandPose(player, 340, 320, 0, 320, 40, 0, 340, 0, 0, 20, 0, 0, 20, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lSchwertkämpfer" -> {
                setArmorStandPose(player, 300, 320, 0, 300, 40, 0, 0, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lFechter" -> {
                setArmorStandPose(player, 290, 0, 270, 20, 0, 230, 0, 30, 0, 340, 0, 340, 20, 30, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lBogenschütze" -> {
                setArmorStandPose(player, 270, 350, 0, 280, 50, 0, 340, 0, 10, 20, 0, 350, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lGegenstand Präsentieren" -> {
                setArmorStandPose(player, 280, 330, 0, 10, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lGegenstand über dem Kopf halten" -> {
                setArmorStandPose(player, 250, 320, 0, 250, 35, 0, 10, 0, 0, 350, 0, 0, 340, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lDirekt nach oben zeigen" -> {
                setArmorStandPose(player, 260, 60, 0, 20, 20, 0, 10, 340, 0, 10, 30, 0, 0, 70, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lFisher" -> {
                setArmorStandPose(player, 300, 320, 0, 300, 40, 0, 280, 20, 0, 280, 340, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lTanzend 1" -> {
                setArmorStandPose(player, 14, 0, 110, 20, 0, 250, 15, 30, 0, 330, 0, 110, 350, 20, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lTanzend 2" -> {
                setArmorStandPose(player, 14, 0, 110, 20, 0, 250, 250, 330, 0, 15, 330, 0, 350, 350, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lHilfe§8?" -> AdvancedArmorStandsMain.getInstance().playSoundBass(player);
            case "§7§lZurück" -> {
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 1);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
        }
    }


}
