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

                    if (inventoryTitle.equalsIgnoreCase("[lang]advancedarmorstands.gui.armor_stand[/lang]")) {

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

                    else if (inventoryTitle.equalsIgnoreCase("[lang]advancedarmorstand.gui.basic_settings[/lang]")) {

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

                    else if (inventoryTitle.equalsIgnoreCase("[lang]advancedarmorstand.gui.body_settings[/lang]")) {

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

                    else if (inventoryTitle.equalsIgnoreCase("[lang]advancedarmorstand.gui.move_armor_stand[/lang] §a0§8.§a1")) {

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

                    else if (inventoryTitle.equalsIgnoreCase("[lang]advancedarmorstand.gui.move_armor_stand[/lang] §a0§8.§a5")) {

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

                    else if (inventoryTitle.equalsIgnoreCase("[lang]advancedarmorstand.gui.move_armor_stand[/lang] §a1")) {

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

                    else if (inventoryTitle.equalsIgnoreCase("[lang]advancedarmorstand.gui.predefined_poses[/lang]")) {

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
            case "[lang]advancedarmorstand.gui.basic_settings[/lang]":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 2);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "[lang]advancedarmorstand.gui.body_settings[/lang]":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 3);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "[lang]advancedarmorstand.gui.movement_and_rotation[/lang]":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 5);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "[lang]advancedarmorstand.gui.predefined_poses[/lang]":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 7);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "[lang]advancedarmorstand.gui.heads[/lang]":

            case "§7§lHelp and Info":
                AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                break;

            case "[lang]advancedarmorstand.gui.close[/lang]":
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
            case "[lang]advancedarmorstand.gui.arms[/lang]":
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

            case "[lang]advancedarmorstand.gui.stone_slab[/lang]":
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

            case "[lang]advancedarmorstand.gui.stone_slab_off[/lang]":
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

            case "[lang]advancedarmorstand.gui.gravity.off[/lang]":
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

            case "[lang]advancedarmorstand.gui.gravity.on[/lang]":
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

            case "[lang]advancedarmorstand.gui.invisible[/lang]":
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

            case "[lang]advancedarmorstand.gui.visible[/lang]":
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

            case "[lang]advancedarmorstand.gui.small[/lang]":
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

            case "[lang]advancedarmorstand.gui.normal_size[/lang]":
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

            case "[lang]advancedarmorstand.gui.hide_names[/lang]":
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

            case "[lang]advancedarmorstand.gui.name_help[/lang]":
                if (player.hasPermission("aa.names")) {
                    player.sendMessage("[lang]advancedarmorstand.help.with.names[/lang]");

                    player.closeInventory();
                    AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                } else {
                    player.sendMessage(ChatColor.RED + AdvancedArmorStandsMain.getInstance().getMessageString("no_permission", player.getLocale()));
                }
                break;

            case "[lang]advancedarmorstand.gui.light_on[/lang]":
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

            case "[lang]advancedarmorstand.gui.light_off[/lang]":
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

            case "[lang]advancedarmorstand.gui.indestructible[/lang]":
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

            case "[lang]advancedarmorstand.gui.individual_name[/lang]":

            case "[lang]advancedarmorstand.gui.help[/lang]":
                AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                break;

            case "[lang]advancedarmorstand.gui.back[/lang]":
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
            case "[lang]advancedarmorstand.gui.head_position[/lang]":

            case "[lang]advancedarmorstand.gui.body_position[/lang]":

            case "[lang]advancedarmorstand.gui.right_arm_position[/lang]":

            case "[lang]advancedarmorstand.gui.left_arm_position[/lang]":

            case "[lang]advancedarmorstand.gui.right_leg_position[/lang]":

            case "[lang]advancedarmorstand.gui.left_leg_position[/lang]":

            case "[lang]advancedarmorstand.gui.help[/lang]":
                AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                break;

            case "[lang]advancedarmorstand.gui.back[/lang]":
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

            case "[lang]advancedarmorstand.gui.back[/lang]":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 1);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "[lang]advancedarmorstand.gui.help[/lang]":
            case "[lang]advancedarmorstand.gui.blockSmallName[/lang] §8(§7Activ§8)":
            case "[lang]advancedarmorstand.gui.blockMediumName[/lang] §8(§7Activ§8)":
            case "[lang]advancedarmorstand.gui.blockLargeName[/lang] §8(§7Activ§8)":
                AdvancedArmorStandsMain.getInstance().playSoundBass(player);
                break;

            case "[lang]advancedarmorstand.gui.blockLargeName[/lang]":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 6);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "[lang]advancedarmorstand.gui.blockMediumName[/lang]":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 5);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;

            case "[lang]advancedarmorstand.gui.blockSmallName[/lang]":
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 4);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
                break;


            // Nav Cross

            case "[lang]advancedarmorstand.gui.forward[/lang]":
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

            case "[lang]advancedarmorstand.gui.backward[/lang]":
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

            case "[lang]advancedarmorstand.gui.right[/lang]":
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

            case "[lang]advancedarmorstand.gui.left[/lang]":
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

            case "[lang]advancedarmorstand.gui.up[/lang]":
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

            case "[lang]advancedarmorstand.gui.down[/lang]":
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

            case "[lang]advancedarmorstand.gui.turn_left[/lang]":
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

            case "[lang]advancedarmorstand.gui.turn_right[/lang]":
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
                player.sendMessage("[lang]advancedarmorstand.nearby_armor_stand.edited[/lang]");
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
            case "[lang]advancedarmorstand.gui.ongiong[/lang] 1" -> {
                setArmorStandPose(player, 345, 0, 10, 350, 0, 350, 340, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.ongiong[/lang] 2" -> {
                setArmorStandPose(player, 300, 40, 350, 20, 0, 350, 10, 0, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.sitting[/lang]" -> {
                setArmorStandPose(player, 345, 0, 10, 350, 0, 350, 280, 20, 0, 280, 340, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.waving[/lang]" -> {
                setArmorStandPose(player, 220, 20, 0, 350, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.greeting[/lang] 1" -> {
                setArmorStandPose(player, 260, 20, 0, 260, 340, 0, 340, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.greeting[/lang] 2" -> {
                setArmorStandPose(player, 240, 50, 0, 240, 320, 0, 10, 0, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.greeting[/lang] 3" -> {
                setArmorStandPose(player, 260, 10, 0, 260, 350, 0, 320, 0, 0, 10, 0, 0, 340, 0, 350, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.cheers[/lang] 1" -> {
                setArmorStandPose(player, 220, 20, 0, 220, 340, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.cheers[/lang] 2" -> {
                setArmorStandPose(player, 250, 60, 0, 20, 10, 0, 10, 0, 0, 350, 0, 0, 340, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.builder[/lang]" -> {
                setArmorStandPose(player, 340, 320, 0, 320, 40, 0, 340, 0, 0, 20, 0, 0, 20, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.swordsman[/lang]" -> {
                setArmorStandPose(player, 300, 320, 0, 300, 40, 0, 0, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.fencer[/lang]" -> {
                setArmorStandPose(player, 290, 0, 270, 20, 0, 230, 0, 30, 0, 340, 0, 340, 20, 30, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.archer[/lang]" -> {
                setArmorStandPose(player, 270, 350, 0, 280, 50, 0, 340, 0, 10, 20, 0, 350, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.present_object[/lang]" -> {
                setArmorStandPose(player, 280, 330, 0, 10, 0, 350, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.hold_object[/lang]" -> {
                setArmorStandPose(player, 250, 320, 0, 250, 35, 0, 10, 0, 0, 350, 0, 0, 340, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.point_upwards[/lang]" -> {
                setArmorStandPose(player, 260, 60, 0, 20, 20, 0, 10, 340, 0, 10, 30, 0, 0, 70, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "§7§lFisher" -> {
                setArmorStandPose(player, 300, 320, 0, 300, 40, 0, 280, 20, 0, 280, 340, 0, 0, 0, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.dancing[/lang] 1" -> {
                setArmorStandPose(player, 14, 0, 110, 20, 0, 250, 15, 30, 0, 330, 0, 110, 350, 20, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.dancing[/lang] 2" -> {
                setArmorStandPose(player, 14, 0, 110, 20, 0, 250, 250, 330, 0, 15, 330, 0, 350, 350, 0, 0, 0, 0);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
            case "[lang]advancedarmorstand.gui.help[/lang]" -> AdvancedArmorStandsMain.getInstance().playSoundBass(player);
            case "[lang]advancedarmorstand.gui.back[/lang]" -> {
                player.closeInventory();
                AdvancedArmorStandsMain.getInstance().showMenu(player, 1);
                AdvancedArmorStandsMain.getInstance().playSoundClick(player);
            }
        }
    }


}
