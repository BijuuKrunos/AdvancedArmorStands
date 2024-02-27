package com.falyrion.aa;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.ChatPaginator;

import java.util.ArrayList;

public class GUI {

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // Create Menus

    /**
     * Function to create the main menu inventory and fill it with items to click on
     *
     * @param player: Player, The player to open the inventory to
     */
    private Inventory createMainMenu(Player player) {
        // Create Inventory

        Inventory GUIMain = Bukkit.createInventory(null, 9, "[lang]advancedarmorstands.gui.armor_stand[/lang]");


        // Create ItemStacks

        // Item basic settings

        ItemStack basicSettingsItem = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta basicSettingsMeta = basicSettingsItem.getItemMeta();
        basicSettingsMeta.setDisplayName("[lang]advancedarmorstand.gui.basic_settings[/lang]");
        ArrayList<String> basicSettingsLore = new ArrayList<String>();
        basicSettingsLore.add(" ");
        String menuMainBasicSettings = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.main.basic_settings", player.getLocale());
        String[] basicSettingsLoreArray = ChatPaginator.wordWrap(menuMainBasicSettings, 32);
        for (String s : basicSettingsLoreArray) {
            basicSettingsLore.add(s);
        }
        basicSettingsMeta.setLore(basicSettingsLore);
        basicSettingsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        basicSettingsItem.setItemMeta(basicSettingsMeta);

        // Item body settings

        ItemStack bodyPartSettingsItem = new ItemStack(Material.STONE_SLAB, 1);
        ItemMeta bodyPartSettingsMeta = bodyPartSettingsItem.getItemMeta();
        bodyPartSettingsMeta.setDisplayName("[lang]advancedarmorstand.gui.body_settings[/lang]");
        ArrayList<String> bodyPartSettingsLore = new ArrayList<String>();
        bodyPartSettingsLore.add("  ");
        String menuMainBodySettings = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.main.body_settings", player.getLocale());
        String[] bodySettingsLoreArray = ChatPaginator.wordWrap(menuMainBodySettings, 32);
        for (String s : bodySettingsLoreArray) {
            bodyPartSettingsLore.add(s);
        }
        bodyPartSettingsMeta.setLore(bodyPartSettingsLore);
        bodyPartSettingsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        bodyPartSettingsItem.setItemMeta(bodyPartSettingsMeta);

        // Item movement and rotation

        ItemStack movementItem = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta movementMeta = movementItem.getItemMeta();
        movementMeta.setDisplayName("[lang]advancedarmorstand.gui.movement_and_rotation[/lang]");
        ArrayList<String> movementLore = new ArrayList<String>();
        movementLore.add("  ");
        String menuMainMovement = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.main.movement", player.getLocale());
        String[] movementSettingsLoreArray = ChatPaginator.wordWrap(menuMainMovement, 32);
        for (String s : movementSettingsLoreArray) {
            movementLore.add(s);
        }
        movementMeta.setLore(movementLore);
        movementMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        movementItem.setItemMeta(movementMeta);

        // Item preset poses

        ItemStack presetPoses = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta presetPosesMeta = presetPoses.getItemMeta();
        presetPosesMeta.setDisplayName("[lang]advancedarmorstand.gui.predefined_poses[/lang]");
        ArrayList<String> presetPosesLore = new ArrayList<String>();
        presetPosesLore.add("  ");
        String menuMainPreset = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.main.preset", player.getLocale());
        String[] presetLoreArray = ChatPaginator.wordWrap(menuMainPreset, 32);
        for (String s : presetLoreArray) {
            presetPosesLore.add(s);
        }
        presetPosesMeta.setLore(presetPosesLore);
        presetPosesMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        presetPoses.setItemMeta(presetPosesMeta);

        // Item heads

        ItemStack headsItem = new ItemStack(Material.PUMPKIN, 1);
        headsItem.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        ItemMeta headsMeta = headsItem.getItemMeta();
        headsMeta.setDisplayName("[lang]advancedarmorstand.gui.heads[/lang]");
        ArrayList<String> headsLore = new ArrayList<String>();
        headsLore.add("  ");
        String menuMainHeads = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.main.heads", player.getLocale());
        String[] headsLoreArray = ChatPaginator.wordWrap(menuMainHeads, 32);
        for (String s : headsLoreArray) {
            headsLore.add(s);
        }
        headsLore.add("  ");
        headsLore.add(ChatColor.AQUA + "/aa head <player-name>");
        headsLore.add(ChatColor.AQUA + " <amount>");
        headsMeta.setLore(headsLore);
        headsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        headsItem.setItemMeta(headsMeta);


        // Item close

        ItemStack closeMenuItem = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta closeMenuMeta = closeMenuItem.getItemMeta();
        closeMenuMeta.setCustomModelData(54);
        closeMenuMeta.setDisplayName("[lang]advancedarmorstand.gui.close[/lang]");
        ArrayList<String> closeMenuLore = new ArrayList<String>();
        closeMenuLore.add("  ");
        String menuMainClose = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.main.close", player.getLocale());
        String[] closeLoreArray = ChatPaginator.wordWrap(menuMainClose, 32);
        for (String s : closeLoreArray) {
            closeMenuLore.add(s);
        }
        closeMenuMeta.setLore(closeMenuLore);
        closeMenuMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        closeMenuItem.setItemMeta(closeMenuMeta);

        // Background Item
        ItemStack backgroundItem = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta backgroundMeta = backgroundItem.getItemMeta();
        backgroundMeta.setCustomModelData(1);
        backgroundMeta.setDisplayName("§7§l*");
        backgroundMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        backgroundItem.setItemMeta(backgroundMeta);

        // Add ItemStacks to Inventory

        GUIMain.setItem(2, basicSettingsItem);
        GUIMain.setItem(3, bodyPartSettingsItem);
        GUIMain.setItem(4, movementItem);
        GUIMain.setItem(5, presetPoses);
        if (player.hasPermission("aa.head")) {
            GUIMain.setItem(6, headsItem);
        }
        else {
            GUIMain.setItem(6, backgroundItem);
        }
        GUIMain.setItem(8, closeMenuItem);
        // Background
        GUIMain.setItem(0, backgroundItem);
        GUIMain.setItem(1, backgroundItem);
        GUIMain.setItem(7, backgroundItem);


        // Return Inventory

        return GUIMain;
    }

    private Inventory createBasicSettingsMenu(Player player) {

        // Create Inventory

        Inventory GUIBasicSettings = Bukkit.createInventory(null, 27, "[lang]advancedarmorstand.gui.basic_settings[/lang]");

        // Create ItemStacks

        ItemStack toggleArmsItem = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta toggleArmsMeta = toggleArmsItem.getItemMeta();
        toggleArmsMeta.setDisplayName("[lang]advancedarmorstand.gui.arms[/lang]");
        ArrayList<String> toggleArmLore = new ArrayList<String>();
        toggleArmLore.add(" ");
        String menuBasicArmsString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.arms", player.getLocale());
        String[] menuBasicArmsArray = ChatPaginator.wordWrap(menuBasicArmsString, 32);
        for (String s : menuBasicArmsArray) {
            toggleArmLore.add(s);
        }
        toggleArmsMeta.setLore(toggleArmLore);
        toggleArmsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        toggleArmsItem.setItemMeta(toggleArmsMeta);

        ItemStack baseplateInvisibleItem = new ItemStack(Material.STONE_SLAB, 1);
        ItemMeta baseplateInvisibleMeta = baseplateInvisibleItem.getItemMeta();
        baseplateInvisibleMeta.setDisplayName("[lang]advancedarmorstand.gui.stone_slab[/lang]");
        ArrayList<String> baseplateInvisibleLore = new ArrayList<String>();
        baseplateInvisibleLore.add("  ");
        String menuBasicBaseInvString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.base_inv", player.getLocale());
        String[] menuBasicBaseInvArray = ChatPaginator.wordWrap(menuBasicBaseInvString, 32);
        for (String s : menuBasicBaseInvArray) {
            baseplateInvisibleLore.add(s);
        }
        baseplateInvisibleMeta.setLore(baseplateInvisibleLore);
        baseplateInvisibleMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        baseplateInvisibleItem.setItemMeta(baseplateInvisibleMeta);

        ItemStack baseplateVisibleItem = new ItemStack(Material.STONE_SLAB, 1);
        ItemMeta baseplateVisibleMeta = baseplateVisibleItem.getItemMeta();
        baseplateVisibleMeta.setDisplayName("[lang]advancedarmorstand.gui.stone_slab_off[/lang]");
        ArrayList<String> baseplateVisibleLore = new ArrayList<String>();
        baseplateVisibleLore.add("  ");
        String menuBasicBaseVisString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.base_vis", player.getLocale());
        String[] menuBasicBaseVisArray = ChatPaginator.wordWrap(menuBasicBaseVisString, 32);
        for (String s : menuBasicBaseVisArray) {
            baseplateVisibleLore.add(s);
        }
        baseplateVisibleMeta.setLore(baseplateVisibleLore);
        baseplateVisibleMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        baseplateVisibleItem.setItemMeta(baseplateVisibleMeta);

        ItemStack gravityOffItem = new ItemStack(Material.FEATHER, 1);
        ItemMeta gravityOffMeta = gravityOffItem.getItemMeta();
        gravityOffMeta.setDisplayName("[lang]advancedarmorstand.gui.gravity.off[/lang]");
        ArrayList<String> gravityOffLore = new ArrayList<String>();
        gravityOffLore.add("  ");
        String menuBasicGravityOffString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.gravity_off", player.getLocale());
        String[] menuBasicGravityOffArray = ChatPaginator.wordWrap(menuBasicGravityOffString, 32);
        for (String s : menuBasicGravityOffArray) {
            gravityOffLore.add(s);
        }
        gravityOffMeta.setLore(gravityOffLore);
        gravityOffMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        gravityOffItem.setItemMeta(gravityOffMeta);

        ItemStack gravityOnItem = new ItemStack(Material.FEATHER, 1);
        ItemMeta gravityOnMeta = gravityOnItem.getItemMeta();
        gravityOnMeta.setDisplayName("[lang]advancedarmorstand.gui.gravity.on[/lang]");
        ArrayList<String> gravityOnLore = new ArrayList<String>();
        gravityOnLore.add("  ");
        String menuBasicGravityOnString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.gravity_on", player.getLocale());
        String[] menuBasicGravityOnArray = ChatPaginator.wordWrap(menuBasicGravityOnString, 32);
        for (String s : menuBasicGravityOnArray) {
            gravityOnLore.add(s);
        }
        gravityOnMeta.setLore(gravityOnLore);
        gravityOnMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        gravityOnItem.setItemMeta(gravityOnMeta);

        ItemStack asInvisibleItem = new ItemStack(Material.GLASS, 1);
        ItemMeta asInvisibleMeta = asInvisibleItem.getItemMeta();
        asInvisibleMeta.setDisplayName("[lang]advancedarmorstand.gui.invisible[/lang]");
        ArrayList<String> asInvisibleLore = new ArrayList<String>();
        asInvisibleLore.add("  ");
        String menuBasicInvString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.invisible", player.getLocale());
        String[] menuBasicInvArray = ChatPaginator.wordWrap(menuBasicInvString, 32);
        for (String s : menuBasicInvArray) {
            asInvisibleLore.add(s);
        }
        asInvisibleMeta.setLore(asInvisibleLore);
        asInvisibleMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        asInvisibleItem.setItemMeta(asInvisibleMeta);

        ItemStack asVisibleItem = new ItemStack(Material.BLACK_STAINED_GLASS, 1);
        ItemMeta asVisibleMeta = asVisibleItem.getItemMeta();
        asVisibleMeta.setDisplayName("[lang]advancedarmorstand.gui.visible[/lang]");
        ArrayList<String> asVisibleLore = new ArrayList<String>();
        asVisibleLore.add("  ");
        String menuBasicVisString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.visible", player.getLocale());
        String[] menuBasicVisArray = ChatPaginator.wordWrap(menuBasicVisString, 32);
        for (String s : menuBasicVisArray) {
            asVisibleLore.add(s);
        }
        asVisibleMeta.setLore(asVisibleLore);
        asVisibleMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        asVisibleItem.setItemMeta(asVisibleMeta);

        ItemStack makeSmallItem = new ItemStack(Material.OAK_SLAB, 1);
        ItemMeta makeSmallMeta = makeSmallItem.getItemMeta();
        makeSmallMeta.setDisplayName("[lang]advancedarmorstand.gui.small[/lang]");
        ArrayList<String> makeSmallLore = new ArrayList<String>();
        makeSmallLore.add("  ");
        String menuBasicSmallString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.size_small", player.getLocale());
        String[] menuBasicSmallArray = ChatPaginator.wordWrap(menuBasicSmallString, 32);
        for (String s : menuBasicSmallArray) {
            makeSmallLore.add(s);
        }
        makeSmallMeta.setLore(makeSmallLore);
        makeSmallMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        makeSmallItem.setItemMeta(makeSmallMeta);

        ItemStack makeNormalSizeItem = new ItemStack(Material.OAK_PLANKS, 1);
        ItemMeta makeNormalSizeMeta = makeNormalSizeItem.getItemMeta();
        makeNormalSizeMeta.setDisplayName("[lang]advancedarmorstand.gui.normal_size[/lang]");
        ArrayList<String> makeNormalSizeLore = new ArrayList<String>();
        makeNormalSizeLore.add("  ");
        String menuBasicNormalString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.size_normal", player.getLocale());
        String[] menuBasicNormalArray = ChatPaginator.wordWrap(menuBasicNormalString, 32);
        for (String s : menuBasicNormalArray) {
            makeNormalSizeLore.add(s);
        }
        makeNormalSizeMeta.setLore(makeNormalSizeLore);
        makeNormalSizeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        makeNormalSizeItem.setItemMeta(makeNormalSizeMeta);

        ItemStack customNameItem = new ItemStack(Material.NAME_TAG, 1);
        ItemMeta customNameMeta = customNameItem.getItemMeta();
        customNameMeta.setDisplayName("[lang]advancedarmorstand.gui.individual_name[/lang]");
        ArrayList<String> customNameLore = new ArrayList<String>();
        customNameLore.add("  ");
        String menuBasicNameString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.name", player.getLocale());
        String[] menuBasicNameArray = ChatPaginator.wordWrap(menuBasicNameString, 32);
        for (String s : menuBasicNameArray) {
            customNameLore.add(s);
        }
        customNameLore.add("  ");
        customNameLore.add(ChatColor.AQUA + "/aa name <name>");
        customNameMeta.setLore(customNameLore);
        customNameMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        customNameItem.setItemMeta(customNameMeta);

        ItemStack nameHelpItem = new ItemStack(Material.NAME_TAG, 1);
        ItemMeta nameHelpMeta = nameHelpItem.getItemMeta();
        nameHelpMeta.setDisplayName("[lang]advancedarmorstand.gui.name_help[/lang]");
        ArrayList<String> nameHelpLore = new ArrayList<String>();
        nameHelpLore.add(" ");
        String menuBasicNameHelpString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.name_help", player.getLocale());
        String[] menuBasicNameHelpArray = ChatPaginator.wordWrap(menuBasicNameHelpString, 32);
        for (String s : menuBasicNameHelpArray) {
            nameHelpLore.add(s);
        }
        nameHelpMeta.setLore(nameHelpLore);
        nameHelpMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        nameHelpItem.setItemMeta(nameHelpMeta);

        ItemStack hideNameItem = new ItemStack(Material.NAME_TAG, 1);
        ItemMeta hideNameMeta = hideNameItem.getItemMeta();
        hideNameMeta.setDisplayName("[lang]advancedarmorstand.gui.hide_names[/lang]");
        ArrayList<String> hideNameLore = new ArrayList<String>();
        hideNameLore.add("  ");
        String menuBasicNameHideString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.name_hide", player.getLocale());
        String[] menuBasicNameHideArray = ChatPaginator.wordWrap(menuBasicNameHideString, 32);
        for (String s : menuBasicNameHideArray) {
            hideNameLore.add(s);
        }
        hideNameMeta.setLore(hideNameLore);
        hideNameMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        hideNameItem.setItemMeta(hideNameMeta);

        ItemStack glowItem = new ItemStack(Material.GLOWSTONE, 1);
        ItemMeta glowMeta = glowItem.getItemMeta();
        glowMeta.setDisplayName("[lang]advancedarmorstand.gui.light_on[/lang]");
        ArrayList<String> glowLore = new ArrayList<String>();
        glowLore.add("  ");
        String menuBasicGlowAddString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.glow_add", player.getLocale());
        String[] menuBasicGlowAddArray = ChatPaginator.wordWrap(menuBasicGlowAddString, 32);
        for (String s : menuBasicGlowAddArray) {
            glowLore.add(s);
        }
        glowMeta.setLore(glowLore);
        glowMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        glowItem.setItemMeta(glowMeta);

        ItemStack glowRemoveItem = new ItemStack(Material.GLOWSTONE, 1);
        ItemMeta glowRemoveMeta = glowRemoveItem.getItemMeta();
        glowRemoveMeta.setDisplayName("[lang]advancedarmorstand.gui.light_off[/lang]");
        ArrayList<String> glowRemoveLore = new ArrayList<String>();
        glowRemoveLore.add("  ");
        String menuBasicGlowRemoveString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.glow_remove", player.getLocale());
        String[] menuBasicGlowRemoveArray = ChatPaginator.wordWrap(menuBasicGlowRemoveString, 32);
        for (String s : menuBasicGlowRemoveArray) {
            glowRemoveLore.add(s);
        }
        glowRemoveMeta.setLore(glowRemoveLore);
        glowRemoveMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        glowRemoveItem.setItemMeta(glowRemoveMeta);

        ItemStack invulnerableItem = new ItemStack(Material.OBSIDIAN, 1);
        ItemMeta invulnerableMeta = invulnerableItem.getItemMeta();
        invulnerableMeta.setDisplayName("[lang]advancedarmorstand.gui.indestructible[/lang]");
        ArrayList<String> invulnerableLore = new ArrayList<String>();
        invulnerableLore.add("  ");
        String menuBasicInvulnerableString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.basic.invulnerable", player.getLocale());
        String[] menuBasicInvulnerbleArray = ChatPaginator.wordWrap(menuBasicInvulnerableString, 32);
        for (String s : menuBasicInvulnerbleArray) {
            invulnerableLore.add(s);
        }
        invulnerableMeta.setLore(invulnerableLore);
        invulnerableMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        invulnerableItem.setItemMeta(invulnerableMeta);


        // Item help

        ItemStack helpItem = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta helpMeta = helpItem.getItemMeta();
        helpMeta.setCustomModelData(111);
        helpMeta.setDisplayName("[lang]advancedarmorstand.gui.help[/lang]");
        ArrayList<String> helpLore = new ArrayList<String>();
        helpLore.add("  ");
        String menuBasicHelpString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.help", player.getLocale());
        String[] menuBasicHelpArray = ChatPaginator.wordWrap(menuBasicHelpString, 32);
        for (String s : menuBasicHelpArray) {
            helpLore.add(s);
        }
        helpMeta.setLore(helpLore);
        helpItem.setItemMeta(helpMeta);


        // Item back

        ItemStack backItem = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta backMeta = backItem.getItemMeta();
        backMeta.setCustomModelData(54);
        backMeta.setDisplayName("[lang]advancedarmorstand.gui.back[/lang]");
        ArrayList<String> backLore = new ArrayList<String>();
        backLore.add("  ");
        String menuBasicBackString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.back", player.getLocale());
        String[] menuBasicBackArray = ChatPaginator.wordWrap(menuBasicBackString, 32);
        for (String s : menuBasicBackArray) {
            backLore.add(s);
        }
        backMeta.setLore(backLore);
        backMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        backItem.setItemMeta(backMeta);

        // Background Item
        ItemStack backgroundItem = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta backgroundMeta = backgroundItem.getItemMeta();
        backgroundMeta.setCustomModelData(1);
        backgroundMeta.setDisplayName("§7§l*");
        backgroundMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        backgroundItem.setItemMeta(backgroundMeta);

        // Add ItemStacks to Inventory

        GUIBasicSettings.setItem(0, toggleArmsItem);
        GUIBasicSettings.setItem(1, baseplateInvisibleItem);
        GUIBasicSettings.setItem(10, baseplateVisibleItem);
        GUIBasicSettings.setItem(11, gravityOffItem);
        GUIBasicSettings.setItem(2, gravityOnItem);
        GUIBasicSettings.setItem(3, glowItem);
        GUIBasicSettings.setItem(12, glowRemoveItem);
        GUIBasicSettings.setItem(13, makeSmallItem);
        GUIBasicSettings.setItem(4, makeNormalSizeItem);
        GUIBasicSettings.setItem(9, invulnerableItem);
        if (player.hasPermission("aa.names")) {
            GUIBasicSettings.setItem(6, customNameItem);
            GUIBasicSettings.setItem(24, nameHelpItem);
            GUIBasicSettings.setItem(15, hideNameItem);
        }
        else {
            GUIBasicSettings.setItem(6, backgroundItem);
            GUIBasicSettings.setItem(24, backgroundItem);
            GUIBasicSettings.setItem(15, backgroundItem);
        }
        if (player.hasPermission("aa.visible")) {
            GUIBasicSettings.setItem(5, asInvisibleItem);
            GUIBasicSettings.setItem(14, asVisibleItem);
        }
        else {
            GUIBasicSettings.setItem(5, backgroundItem);
            GUIBasicSettings.setItem(14, backgroundItem);
        }
        GUIBasicSettings.setItem(8, helpItem);
        GUIBasicSettings.setItem(26, backItem);
        // Background
        GUIBasicSettings.setItem(7, backgroundItem);
        GUIBasicSettings.setItem(16, backgroundItem);
        GUIBasicSettings.setItem(17, backgroundItem);
        GUIBasicSettings.setItem(18, backgroundItem);
        GUIBasicSettings.setItem(19, backgroundItem);
        GUIBasicSettings.setItem(20, backgroundItem);
        GUIBasicSettings.setItem(21, backgroundItem);
        GUIBasicSettings.setItem(22, backgroundItem);
        GUIBasicSettings.setItem(23, backgroundItem);
        GUIBasicSettings.setItem(25, backgroundItem);


        // Return inventory

        return GUIBasicSettings;
    }

    private Inventory createBodyPartsMenu(Player player) {

        // Create Inventory

        Inventory GUIBodyParts = Bukkit.createInventory(null, 27, "[lang]advancedarmorstand.gui.body_settings[/lang]");
        
        
        // Create ItemStacks

        ItemStack headPose = new ItemStack(Material.GOLDEN_HELMET, 1);
        ItemMeta headPoseItemMeta = headPose.getItemMeta();
        headPoseItemMeta.setDisplayName("[lang]advancedarmorstand.gui.head_position[/lang]");
        ArrayList<String> headPoseLore = new ArrayList<String>();
        headPoseLore.add("  ");
        String menuBodyStringHP = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.body.head", player.getLocale());
        String[] menuBodyStringArrayHP = ChatPaginator.wordWrap(menuBodyStringHP, 32);
        for (String s : menuBodyStringArrayHP) {
            headPoseLore.add(s);
        }
        headPoseLore.add("  ");
        headPoseLore.add("§8/§6aa hp §8<§6roll§8> <§6yaw§8> §8<§6pitch§8> <§6range§8>");

        headPoseItemMeta.setLore(headPoseLore);
        headPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        headPose.setItemMeta(headPoseItemMeta);

        ItemStack bodyPose = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
        ItemMeta bodyPoseMeta = bodyPose.getItemMeta();
        bodyPoseMeta.setDisplayName("[lang]advancedarmorstand.gui.body_position[/lang]");
        ArrayList<String> bodyPoseLore = new ArrayList<String>();
        bodyPoseLore.add("  ");
        String menuBodyStringBP = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.body.body", player.getLocale());
        String[] menuBodyStringArrayBP = ChatPaginator.wordWrap(menuBodyStringBP, 32);
        for (String s : menuBodyStringArrayBP) {
            bodyPoseLore.add(s);
        }
        bodyPoseLore.add("  ");
        bodyPoseLore.add("§8/§6aa bp §8<§6roll§8> <§6yaw§8> §8<§6pitch§8> <§6range§8>");
        bodyPoseMeta.setLore(bodyPoseLore);
        bodyPoseMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        bodyPose.setItemMeta(bodyPoseMeta);

        ItemStack rightArm = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
        ItemMeta rightArmMeta = rightArm.getItemMeta();
        rightArmMeta.setDisplayName("[lang]advancedarmorstand.gui.right_arm_position[/lang]");
        ArrayList<String> rightArmLore = new ArrayList<String>();
        rightArmLore.add("  ");
        String menuBodyStringRAP = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.body.rap", player.getLocale());
        String[] menuBodyStringArrayRAP = ChatPaginator.wordWrap(menuBodyStringRAP, 32);
        for (String s : menuBodyStringArrayRAP) {
            rightArmLore.add(s);
        }
        rightArmLore.add("  ");
        rightArmLore.add("§8/§6aa rap §8<§6roll§8> <§6yaw§8> §8<§6pitch§8> <§6range§8>");
        rightArmMeta.setLore(rightArmLore);
        rightArmMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        rightArm.setItemMeta(rightArmMeta);

        ItemStack leftArm = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
        ItemMeta leftArmMeta = leftArm.getItemMeta();
        leftArmMeta.setDisplayName("[lang]advancedarmorstand.gui.left_arm_position[/lang]");
        ArrayList<String> leftArmLore = new ArrayList<String>();
        leftArmLore.add("  ");
        String menuBodyStringLAP = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.body.lap", player.getLocale());
        String[] menuBodyStringArrayLAP = ChatPaginator.wordWrap(menuBodyStringLAP, 32);
        for (String s : menuBodyStringArrayLAP) {
            leftArmLore.add(s);
        }
        leftArmLore.add("  ");
        leftArmLore.add("§8/§6aa lap §8<§6roll§8> <§6yaw§8> §8<§6pitch§8> <§6range§8>");
        leftArmMeta.setLore(leftArmLore);
        leftArmMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        leftArm.setItemMeta(leftArmMeta);

        ItemStack rightLeg = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
        ItemMeta rightLegMeta = rightLeg.getItemMeta();
        rightLegMeta.setDisplayName("[lang]advancedarmorstand.gui.right_leg_position[/lang]");
        ArrayList<String> rightLegLore = new ArrayList<String>();
        rightLegLore.add("  ");
        String menuBodyStringRLP = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.body.rlp", player.getLocale());
        String[] menuBodyStringArrayRLP = ChatPaginator.wordWrap(menuBodyStringRLP, 32);
        for (String s : menuBodyStringArrayRLP) {
            rightLegLore.add(s);
        }
        rightLegLore.add("  ");
        rightLegLore.add("§8/§6aa rlp §8<§6roll§8> <§6yaw§8> §8<§6pitch§8> <§6range§8>");
        rightLegMeta.setLore(rightLegLore);
        rightLegMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        rightLeg.setItemMeta(rightLegMeta);

        ItemStack leftLeg = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
        ItemMeta leftLegMeta = leftLeg.getItemMeta();
        leftLegMeta.setDisplayName("[lang]advancedarmorstand.gui.left_leg_position[/lang]");
        ArrayList<String> leftLegLore = new ArrayList<String>();
        leftLegLore.add("  ");
        String menuBodyStringLLP = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.body.llp", player.getLocale());
        String[] menuBodyStringArrayLLP = ChatPaginator.wordWrap(menuBodyStringLLP, 32);
        for (String s : menuBodyStringArrayLLP) {
            leftLegLore.add(s);
        }
        leftLegLore.add("  ");
        leftLegLore.add("§8/§6aa llp §8<§6roll§8> <§6yaw§8> §8<§6pitch§8> <§6range§8>");
        leftLegMeta.setLore(leftLegLore);
        leftLegMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        leftLeg.setItemMeta(leftLegMeta);

        ItemStack helpItem = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta helpMeta = helpItem.getItemMeta();
        helpMeta.setCustomModelData(111);
        helpMeta.setDisplayName("[lang]advancedarmorstand.gui.help[/lang]");
        ArrayList<String> helpLore = new ArrayList<String>();
        helpLore.add("  ");
        String menuBodyHelpString = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.help", player.getLocale());
        String[] menuBodyHelpArray = ChatPaginator.wordWrap(menuBodyHelpString, 32);
        for (String s : menuBodyHelpArray) {
            helpLore.add(s);
        }
        helpMeta.setLore(helpLore);
        helpItem.setItemMeta(helpMeta);

        ItemStack backItem = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta backMeta = backItem.getItemMeta();
        backMeta.setCustomModelData(54);
        backMeta.setDisplayName("[lang]advancedarmorstand.gui.back[/lang]");
        ArrayList<String> backLore = new ArrayList<String>();
        backLore.add("  ");
        String menuBodyStringBack = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.back", player.getLocale());
        String[] menuBodyArrayBack = ChatPaginator.wordWrap(menuBodyStringBack, 32);
        for (String s : menuBodyArrayBack) {
            backLore.add(s);
        }
        backMeta.setLore(backLore);
        backMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        backItem.setItemMeta(backMeta);

        // Background Item
        ItemStack backgroundItem = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta backgroundMeta = backgroundItem.getItemMeta();
        backgroundMeta.setCustomModelData(1);
        backgroundMeta.setDisplayName("§7§l*");
        backgroundMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        backgroundItem.setItemMeta(backgroundMeta);


        // Set ItemStacks in Inventory

        GUIBodyParts.setItem(3, headPose);
        GUIBodyParts.setItem(12, bodyPose);
        GUIBodyParts.setItem(11, rightArm);
        GUIBodyParts.setItem(13, leftArm);
        GUIBodyParts.setItem(20, rightLeg);
        GUIBodyParts.setItem(22, leftLeg);
        GUIBodyParts.setItem(8, helpItem);
        GUIBodyParts.setItem(26, backItem);
        // Background
        GUIBodyParts.setItem(0, backgroundItem);
        GUIBodyParts.setItem(1, backgroundItem);
        GUIBodyParts.setItem(2, backgroundItem);
        GUIBodyParts.setItem(4, backgroundItem);
        GUIBodyParts.setItem(5, backgroundItem);
        GUIBodyParts.setItem(6, backgroundItem);
        GUIBodyParts.setItem(7, backgroundItem);
        GUIBodyParts.setItem(9, backgroundItem);
        GUIBodyParts.setItem(10, backgroundItem);
        GUIBodyParts.setItem(14, backgroundItem);
        GUIBodyParts.setItem(15, backgroundItem);
        GUIBodyParts.setItem(16, backgroundItem);
        GUIBodyParts.setItem(17, backgroundItem);
        GUIBodyParts.setItem(18, backgroundItem);
        GUIBodyParts.setItem(19, backgroundItem);
        GUIBodyParts.setItem(21, backgroundItem);
        GUIBodyParts.setItem(23, backgroundItem);
        GUIBodyParts.setItem(24, backgroundItem);
        GUIBodyParts.setItem(25, backgroundItem);


        // Create ItemStacks

        return GUIBodyParts;
    }

    private Inventory createMovementMenu(Player player, int Size) {

        // Create Inventory
        String inventoryName = "";

        String blockSmallName = "[lang]advancedarmorstand.gui.blockSmallName[/lang]";
        String blockMediumName = "[lang]advancedarmorstand.gui.blockMediumName[/lang]";
        String blockLargeName = "[lang]advancedarmorstand.gui.blockLargeName[/lang]";

        Material blockSmallMaterial = Material.ORANGE_TERRACOTTA;
        Material blockMediumMaterial = Material.ORANGE_TERRACOTTA;
        Material blockLargeMaterial = Material.ORANGE_TERRACOTTA;

        switch (Size) {
            case 1:
                inventoryName = "[lang]advancedarmorstand.gui.move_armor_stand[/lang] §a0§8.§a1";
                blockSmallMaterial = Material.BLUE_TERRACOTTA;
                blockSmallName = "[lang]advancedarmorstand.gui.blockSmallName[/lang] §8(§7Activ§8)";
                break;

            case 2:
                inventoryName = "[lang]advancedarmorstand.gui.move_armor_stand[/lang] §a0§8.§a5";
                blockMediumMaterial = Material.BLUE_TERRACOTTA;
                blockMediumName = "[lang]advancedarmorstand.gui.blockMediumName[/lang] §8(§7Activ§8)";
                break;

            case 3:
                inventoryName = "[lang]advancedarmorstand.gui.move_armor_stand[/lang] §a1";
                blockLargeMaterial = Material.BLUE_TERRACOTTA;
                blockLargeName = "[lang]advancedarmorstand.gui.blockLargeName[/lang] §8(§7Activ§8)";
                break;
        }

        Inventory GUIMovement = Bukkit.getServer().createInventory(null, 27, inventoryName);


        // Create ItemStacks

        ItemStack blockSettingsLargeItem = new ItemStack(blockLargeMaterial, 1);
        ItemMeta blockSettingsLargeItemItemMeta = blockSettingsLargeItem.getItemMeta();
        blockSettingsLargeItemItemMeta.setDisplayName(blockLargeName);
        ArrayList<String> blockSettingsLargeLore = new ArrayList<String>();
        blockSettingsLargeLore.add("  ");
        String menuMoveStringDist01 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.distance_01", player.getLocale());
        String[] menuMoveArrayDist01 = ChatPaginator.wordWrap(menuMoveStringDist01, 32);
        for (String s : menuMoveArrayDist01) {
            blockSettingsLargeLore.add(s);
        }
        blockSettingsLargeItemItemMeta.setLore(blockSettingsLargeLore);
        blockSettingsLargeItemItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        blockSettingsLargeItem.setItemMeta(blockSettingsLargeItemItemMeta);

        ItemStack blockSettingsMediumItem = new ItemStack(blockMediumMaterial, 1);
        ItemMeta blockSettingsMediumItemItemMeta = blockSettingsMediumItem.getItemMeta();
        blockSettingsMediumItemItemMeta.setDisplayName(blockMediumName);
        ArrayList<String> blockSettingsMediumLore = new ArrayList<String>();
        blockSettingsMediumLore.add("  ");
        String menuMoveStringDist02 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.distance_02", player.getLocale());
        String[] menuMoveArrayDist02 = ChatPaginator.wordWrap(menuMoveStringDist02, 32);
        for (String s : menuMoveArrayDist02) {
            blockSettingsMediumLore.add(s);
        }
        blockSettingsMediumItemItemMeta.setLore(blockSettingsMediumLore);
        blockSettingsMediumItemItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        blockSettingsMediumItem.setItemMeta(blockSettingsMediumItemItemMeta);

        ItemStack blockSettingsSmallItem = new ItemStack(blockSmallMaterial, 1);
        ItemMeta blockSettingsSmallItemItemMeta = blockSettingsSmallItem.getItemMeta();
        blockSettingsSmallItemItemMeta.setDisplayName(blockSmallName);
        ArrayList<String> blockSettingsSmallLore = new ArrayList<String>();
        blockSettingsSmallLore.add("  ");
        String menuMoveStringDist03 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.distance_03", player.getLocale());
        String[] menuMoveArrayDist03 = ChatPaginator.wordWrap(menuMoveStringDist03, 32);
        for (String s : menuMoveArrayDist03) {
            blockSettingsSmallLore.add(s);
        }
        blockSettingsSmallItemItemMeta.setLore(blockSettingsSmallLore);
        blockSettingsSmallItemItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        blockSettingsSmallItem.setItemMeta(blockSettingsSmallItemItemMeta);


        ItemStack moveForward = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta moveForwardItemMeta = moveForward.getItemMeta();
        moveForwardItemMeta.setCustomModelData(12);
        moveForwardItemMeta.setDisplayName("[lang]advancedarmorstand.gui.forward[/lang]");
        ArrayList<String> moveForwardLore = new ArrayList<String>();
        moveForwardLore.add("  ");
        String menuMoveStringForward = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.forward", player.getLocale());
        String[] menuMoveArrayForward = ChatPaginator.wordWrap(menuMoveStringForward, 32);
        for (String s : menuMoveArrayForward) {
            moveForwardLore.add(s);
        }
        moveForwardItemMeta.setLore(moveForwardLore);
        moveForwardItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveForward.setItemMeta(moveForwardItemMeta);

        ItemStack moveBackwards = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta moveBackwardsItemMeta = moveBackwards.getItemMeta();
        moveBackwardsItemMeta.setCustomModelData(32);
        moveBackwardsItemMeta.setDisplayName("[lang]advancedarmorstand.gui.backward[/lang]");
        ArrayList<String> moveBackwardsLore = new ArrayList<String>();
        moveBackwardsLore.add("  ");
        String menuMoveStringBackward = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.backward", player.getLocale());
        String[] menuMoveArrayBackward = ChatPaginator.wordWrap(menuMoveStringBackward, 32);
        for (String s : menuMoveArrayBackward) {
            moveBackwardsLore.add(s);
        }
        moveBackwardsItemMeta.setLore(moveBackwardsLore);
        moveBackwardsItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveBackwards.setItemMeta(moveBackwardsItemMeta);

        ItemStack moveRight = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta moveRightItemMeta = moveRight.getItemMeta();
        moveRightItemMeta.setCustomModelData(22);
        moveRightItemMeta.setDisplayName("[lang]advancedarmorstand.gui.right[/lang]");
        ArrayList<String> moveRightLore = new ArrayList<String>();
        moveRightLore.add("  ");
        String menuMoveStringRight = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.right", player.getLocale());
        String[] menuMoveArrayRight = ChatPaginator.wordWrap(menuMoveStringRight, 32);
        for (String s : menuMoveArrayRight) {
            moveRightLore.add(s);
        }
        moveRightItemMeta.setLore(moveRightLore);
        moveRightItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveRight.setItemMeta(moveRightItemMeta);

        ItemStack moveLeft = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta moveLeftItemMeta = moveLeft.getItemMeta();
        moveLeftItemMeta.setCustomModelData(42);
        moveLeftItemMeta.setDisplayName("[lang]advancedarmorstand.gui.left[/lang]");
        ArrayList<String> moveLeftLore = new ArrayList<String>();
        moveLeftLore.add("  ");
        String menuMoveStringLeft = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.left", player.getLocale());
        String[] menuMoveArrayLeft = ChatPaginator.wordWrap(menuMoveStringLeft, 32);
        for (String s : menuMoveArrayLeft) {
            moveLeftLore.add(s);
        }
        moveLeftItemMeta.setLore(moveLeftLore);
        moveLeftItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveLeft.setItemMeta(moveLeftItemMeta);
        
        ItemStack moveUp = new ItemStack(Material.FEATHER, 1);
        ItemMeta moveUpItemMeta = moveUp.getItemMeta();
        moveUpItemMeta.setDisplayName("[lang]advancedarmorstand.gui.up[/lang]");
        ArrayList<String> moveUpLore = new ArrayList<String>();
        moveUpLore.add("  ");
        String menuMoveStringUp = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.up", player.getLocale());
        String[] menuMoveArrayUp = ChatPaginator.wordWrap(menuMoveStringUp, 32);
        for (String s : menuMoveArrayUp) {
            moveUpLore.add(s);
        }
        moveUpItemMeta.setLore(moveUpLore);
        moveUpItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveUp.setItemMeta(moveUpItemMeta);

        ItemStack moveDown = new ItemStack(Material.ANVIL, 1);
        ItemMeta moveDownItemMeta = moveDown.getItemMeta();
        moveDownItemMeta.setDisplayName("[lang]advancedarmorstand.gui.down[/lang]");
        ArrayList<String> moveDownLore = new ArrayList<String>();
        moveDownLore.add("  ");
        String menuMoveStringDown = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.down", player.getLocale());
        String[] menuMoveArrayDown = ChatPaginator.wordWrap(menuMoveStringDown, 32);
        for (String s : menuMoveArrayDown) {
            moveDownLore.add(s);
        }
        moveDownItemMeta.setLore(moveDownLore);
        moveDownItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        moveDown.setItemMeta(moveDownItemMeta);

        ItemStack rotateLeft = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta rotateLeftItemMeta = rotateLeft.getItemMeta();
        rotateLeftItemMeta.setDisplayName("[lang]advancedarmorstand.gui.turn_left[/lang]");
        ArrayList<String> rotateLeftLore = new ArrayList<String>();
        rotateLeftLore.add("  ");
        String menuMoveStringRotateLeft = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.rotate_left", player.getLocale());
        String[] menuMoveArrayRotateLeft = ChatPaginator.wordWrap(menuMoveStringRotateLeft, 32);
        for (String s : menuMoveArrayRotateLeft) {
            rotateLeftLore.add(s);
        }
        rotateLeftItemMeta.setLore(rotateLeftLore);
        rotateLeftItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        rotateLeft.setItemMeta(rotateLeftItemMeta);

        ItemStack rotateRight = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta rotateRightItemMeta = rotateRight.getItemMeta();
        rotateRightItemMeta.setDisplayName("[lang]advancedarmorstand.gui.turn_right[/lang]");
        ArrayList<String> rotateRightLore = new ArrayList<String>();
        rotateRightLore.add("  ");
        String menuMoveStringRotateRight = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.move.rotate_right", player.getLocale());
        String[] menuMoveArrayRotateRight = ChatPaginator.wordWrap(menuMoveStringRotateRight, 32);
        for (String s : menuMoveArrayRotateRight) {
            rotateRightLore.add(s);
        }
        rotateRightItemMeta.setLore(rotateRightLore);
        rotateRightItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        rotateRight.setItemMeta(rotateRightItemMeta);

        ItemStack helpItem = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta helpMeta = helpItem.getItemMeta();
        helpMeta.setCustomModelData(111);
        helpMeta.setDisplayName("[lang]advancedarmorstand.gui.help[/lang]");
        ArrayList<String> helpLore = new ArrayList<String>();
        helpLore.add("  ");
        String menuMoveStringHelp = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.help", player.getLocale());
        String[] menuMoveArrayHelp = ChatPaginator.wordWrap(menuMoveStringHelp, 32);
        for (String s : menuMoveArrayHelp) {
            helpLore.add(s);
        }
        helpMeta.setLore(helpLore);
        helpItem.setItemMeta(helpMeta);

        ItemStack backItem = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta backMeta = backItem.getItemMeta();
        backMeta.setCustomModelData(54);
        backMeta.setDisplayName("[lang]advancedarmorstand.gui.back[/lang]");
        ArrayList<String> backLore = new ArrayList<String>();
        backLore.add(" ");
        String menuMoveBack = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.back", player.getLocale());
        String[] menuMoveArrayBack = ChatPaginator.wordWrap(menuMoveBack, 32);
        for (String s : menuMoveArrayBack) {
            backLore.add(s);
        }
        backMeta.setLore(backLore);
        backMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        backItem.setItemMeta(backMeta);

        // Background Item
        ItemStack backgroundItem = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta backgroundMeta = backgroundItem.getItemMeta();
        backgroundMeta.setCustomModelData(1);
        backgroundMeta.setDisplayName("§7§l*");
        backgroundMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        backgroundItem.setItemMeta(backgroundMeta);


        // Set ItemStacks in Inventory

        // Size Buttons
        GUIMovement.setItem(0, blockSettingsLargeItem);
        GUIMovement.setItem(9, blockSettingsMediumItem);
        GUIMovement.setItem(18, blockSettingsSmallItem);
        // Navigation Cross
        GUIMovement.setItem(2, moveForward);
        GUIMovement.setItem(20, moveBackwards);
        GUIMovement.setItem(12, moveRight);
        GUIMovement.setItem(10, moveLeft);
        // Right side of the GUI: Buttons for up and Down
        GUIMovement.setItem(4, moveUp);
        GUIMovement.setItem(22, moveDown);
        // Other Buttons
        GUIMovement.setItem(14, rotateLeft);
        GUIMovement.setItem(15, rotateRight);
        GUIMovement.setItem(8, helpItem);
        GUIMovement.setItem(26, backItem);
        // Background
        GUIMovement.setItem(1, backgroundItem);
        GUIMovement.setItem(3, backgroundItem);
        GUIMovement.setItem(5, backgroundItem);
        GUIMovement.setItem(6, backgroundItem);
        GUIMovement.setItem(7, backgroundItem);
        GUIMovement.setItem(11, backgroundItem);
        GUIMovement.setItem(13, backgroundItem);
        GUIMovement.setItem(16, backgroundItem);
        GUIMovement.setItem(17, backgroundItem);
        GUIMovement.setItem(19, backgroundItem);
        GUIMovement.setItem(21, backgroundItem);
        GUIMovement.setItem(23, backgroundItem);
        GUIMovement.setItem(24, backgroundItem);
        GUIMovement.setItem(25, backgroundItem);


        // Return
        return GUIMovement;
    }

    private Inventory createPresetPosesMenu(Player player) {

        // Create Inventory

        Inventory GUIPresetPoses = Bukkit.createInventory(null, 27, "[lang]advancedarmorstand.gui.predefined_poses[/lang]");


        // Create ItemStacks

        ItemStack defaultPose = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta defaultPoseMeta = defaultPose.getItemMeta();
        defaultPoseMeta.setDisplayName("§7§lStandard 1");
        ArrayList<String> defaultPoseLore = new ArrayList<String>();
        defaultPoseLore.add("  ");
        String menuPresetString01 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_01", player.getLocale());
        String[] menuPresetArray01 = ChatPaginator.wordWrap(menuPresetString01, 32);
        for (String s : menuPresetArray01) {
            defaultPoseLore.add(s);
        }
        defaultPoseMeta.setLore(defaultPoseLore);
        defaultPoseMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        defaultPose.setItemMeta(defaultPoseMeta);

        ItemStack defaultPose2 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta defaultPose2Meta = defaultPose2.getItemMeta();
        defaultPose2Meta.setDisplayName("§7§lStandard 2");
        ArrayList<String> defaultPose2Lore = new ArrayList<String>();
        defaultPose2Lore.add("  ");
        String menuPresetString02 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_02", player.getLocale());
        String[] menuPresetArray02 = ChatPaginator.wordWrap(menuPresetString02, 32);
        for (String s : menuPresetArray02) {
            defaultPose2Lore.add(s);
        }
        defaultPose2Meta.setLore(defaultPose2Lore);
        defaultPose2Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        defaultPose2.setItemMeta(defaultPose2Meta);

        ItemStack walkingPose1 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta walkingPose1ItemMeta = walkingPose1.getItemMeta();
        walkingPose1ItemMeta.setDisplayName("§7§lLaufend 1");
        ArrayList<String> walkingPose1Lore = new ArrayList<String>();
        walkingPose1Lore.add("  ");
        String menuPresetString03 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_03", player.getLocale());
        String[] menuPresetArray03 = ChatPaginator.wordWrap(menuPresetString03, 32);
        for (String s : menuPresetArray03) {
            walkingPose1Lore.add(s);
        }
        walkingPose1ItemMeta.setLore(walkingPose1Lore);
        walkingPose1ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        walkingPose1.setItemMeta(walkingPose1ItemMeta);

        ItemStack walkingPose2 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta walkingPose2ItemMeta = walkingPose2.getItemMeta();
        walkingPose2ItemMeta.setDisplayName("§7§lLaufend 2");
        ArrayList<String> walkingPose2Lore = new ArrayList<String>();
        walkingPose2Lore.add("  ");
        String menuPresetString04 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_04", player.getLocale());
        String[] menuPresetArray04 = ChatPaginator.wordWrap(menuPresetString04, 32);
        for (String s : menuPresetArray04) {
            walkingPose2Lore.add(s);
        }
        walkingPose2ItemMeta.setLore(walkingPose2Lore);
        walkingPose2ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        walkingPose2.setItemMeta(walkingPose2ItemMeta);

        ItemStack sittingPose = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta sittingPoseItemMeta = sittingPose.getItemMeta();
        sittingPoseItemMeta.setDisplayName("§7§lSitzend");
        ArrayList<String> sittingPoseLore = new ArrayList<String>();
        sittingPoseLore.add("  ");
        String menuPresetString05 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_05", player.getLocale());
        String[] menuPresetArray05 = ChatPaginator.wordWrap(menuPresetString05, 32);
        for (String s : menuPresetArray05) {
            sittingPoseLore.add(s);
        }
        sittingPoseItemMeta.setLore(sittingPoseLore);
        sittingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        sittingPose.setItemMeta(sittingPoseItemMeta);

        ItemStack wavingPose = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta wavingPoseItemMeta = wavingPose.getItemMeta();
        wavingPoseItemMeta.setDisplayName("§7§lWinkend");
        ArrayList<String> wavingPoseMeta = new ArrayList<String>();
        wavingPoseMeta.add("  ");
        String menuPresetString06 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_06", player.getLocale());
        String[] menuPresetArray06 = ChatPaginator.wordWrap(menuPresetString06, 32);
        for (String s : menuPresetArray06) {
            wavingPoseMeta.add(s);
        }
        wavingPoseItemMeta.setLore(wavingPoseMeta);
        wavingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wavingPose.setItemMeta(wavingPoseItemMeta);

        ItemStack greetingPose = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta greetingPoseItemMeta = greetingPose.getItemMeta();
        greetingPoseItemMeta.setDisplayName("§7§lBegrüßend 1");
        ArrayList<String> greetingPoseLore = new ArrayList<String>();
        greetingPoseLore.add("  ");
        String menuPresetString07 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_07", player.getLocale());
        String[] menuPresetArray07 = ChatPaginator.wordWrap(menuPresetString07, 32);
        for (String s : menuPresetArray07) {
            greetingPoseLore.add(s);
        }
        greetingPoseItemMeta.setLore(greetingPoseLore);
        greetingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        greetingPose.setItemMeta(greetingPoseItemMeta);

        ItemStack greetingPose2 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta greetingPose2ItemMeta = greetingPose2.getItemMeta();
        greetingPose2ItemMeta.setDisplayName("§7§lBegrüßend 2");
        ArrayList<String> greetingPose2Lore = new ArrayList<String>();
        greetingPose2Lore.add("  ");
        String menuPresetString08 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_08", player.getLocale());
        String[] menuPresetArray08 = ChatPaginator.wordWrap(menuPresetString08, 32);
        for (String s : menuPresetArray08) {
            greetingPose2Lore.add(s);
        }
        greetingPose2ItemMeta.setLore(greetingPose2Lore);
        greetingPose2ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        greetingPose2.setItemMeta(greetingPose2ItemMeta);

        ItemStack greetingPose3 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta greetingPose3ItemMeta = greetingPose3.getItemMeta();
        greetingPose3ItemMeta.setDisplayName("§7§lBegrüßend 3");
        ArrayList<String> greetingPose3Lore = new ArrayList<String>();
        greetingPose3Lore.add("  ");
        String menuPresetString09 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_09", player.getLocale());
        String[] menuPresetArray09 = ChatPaginator.wordWrap(menuPresetString09, 32);
        for (String s : menuPresetArray09) {
            greetingPose3Lore.add(s);
        }
        greetingPose3ItemMeta.setLore(greetingPose3Lore);
        greetingPose3ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        greetingPose3.setItemMeta(greetingPose3ItemMeta);

        ItemStack cheeringPose = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta cheeringPoseItemMeta = cheeringPose.getItemMeta();
        cheeringPoseItemMeta.setDisplayName("§7§lJubel 1");
        ArrayList<String> cheeringPoseLore = new ArrayList<String>();
        cheeringPoseLore.add("  ");
        String menuPresetString10 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_10", player.getLocale());
        String[] menuPresetArray10 = ChatPaginator.wordWrap(menuPresetString10, 32);
        for (String s : menuPresetArray10) {
            cheeringPoseLore.add(s);
        }
        cheeringPoseItemMeta.setLore(cheeringPoseLore);
        cheeringPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        cheeringPose.setItemMeta(cheeringPoseItemMeta);

        ItemStack cheeringPose2 = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta cheeringPose2ItemMeta = cheeringPose2.getItemMeta();
        cheeringPose2ItemMeta.setDisplayName("§7§lJubel 2");
        ArrayList<String> cheeringPose2Lore = new ArrayList<String>();
        cheeringPose2Lore.add("  ");
        String menuPresetString11 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_11", player.getLocale());
        String[] menuPresetArray11 = ChatPaginator.wordWrap(menuPresetString11, 32);
        for (String s : menuPresetArray11) {
            cheeringPose2Lore.add(s);
        }
        cheeringPose2ItemMeta.setLore(cheeringPose2Lore);
        cheeringPose2ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        cheeringPose2.setItemMeta(cheeringPose2ItemMeta);

        ItemStack builderPose = new ItemStack(Material.CLAY, 1);
        ItemMeta builderPoseItemMeta = builderPose.getItemMeta();
        builderPoseItemMeta.setDisplayName("§7§lErbauer");
        ArrayList<String> builderPoseLore = new ArrayList<String>();
        builderPoseLore.add("  ");
        String menuPresetString12 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_12", player.getLocale());
        String[] menuPresetArray12 = ChatPaginator.wordWrap(menuPresetString12, 32);
        for (String s : menuPresetArray12) {
            builderPoseLore.add(s);
        }
        builderPoseItemMeta.setLore(builderPoseLore);
        builderPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        builderPose.setItemMeta(builderPoseItemMeta);

        ItemStack swordFighterPose = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta swordFighterPoseItemMeta = swordFighterPose.getItemMeta();
        swordFighterPoseItemMeta.setDisplayName("§7§lSchwertkämpfer");
        ArrayList<String> swordFighterPoseLore = new ArrayList<String>();
        swordFighterPoseLore.add("  ");
        String menuPresetString13 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_13", player.getLocale());
        String[] menuPresetArray13 = ChatPaginator.wordWrap(menuPresetString13, 32);
        for (String s : menuPresetArray13) {
            swordFighterPoseLore.add(s);
        }
        swordFighterPoseItemMeta.setLore(swordFighterPoseLore);
        swordFighterPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        swordFighterPose.setItemMeta(swordFighterPoseItemMeta);

        ItemStack fencingPose = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta fencingPoseItemMeta = fencingPose.getItemMeta();
        fencingPoseItemMeta.setDisplayName("§7§lFechter");
        ArrayList<String> fencingPoseLore = new ArrayList<String>();
        fencingPoseLore.add("  ");
        String menuPresetString14 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_14", player.getLocale());
        String[] menuPresetArray14 = ChatPaginator.wordWrap(menuPresetString14, 32);
        for (String s : menuPresetArray14) {
            fencingPoseLore.add(s);
        }
        fencingPoseItemMeta.setLore(fencingPoseLore);
        fencingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        fencingPose.setItemMeta(fencingPoseItemMeta);

        ItemStack archerPose = new ItemStack(Material.BOW, 1);
        ItemMeta archerPoseItemMeta = archerPose.getItemMeta();
        archerPoseItemMeta.setDisplayName("§7§lBogenschütze");
        ArrayList<String> archerPoseLore = new ArrayList<String>();
        archerPoseLore.add("  ");
        String menuPresetString15 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_15", player.getLocale());
        String[] menuPresetArray15 = ChatPaginator.wordWrap(menuPresetString15, 32);
        for (String s : menuPresetArray15) {
            archerPoseLore.add(s);
        }
        archerPoseItemMeta.setLore(archerPoseLore);
        archerPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        archerPose.setItemMeta(archerPoseItemMeta);

        ItemStack presentingPose = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta presentingPoseItemMeta = presentingPose.getItemMeta();
        presentingPoseItemMeta.setDisplayName("§7§lGegenstand Präsentieren");
        ArrayList<String> presentingPoseLore = new ArrayList<String>();
        presentingPoseLore.add("  ");
        String menuPresetString16 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_16", player.getLocale());
        String[] menuPresetArray16 = ChatPaginator.wordWrap(menuPresetString16, 32);
        for (String s : menuPresetArray16) {
            presentingPoseLore.add(s);
        }
        presentingPoseItemMeta.setLore(presentingPoseLore);
        presentingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        presentingPose.setItemMeta(presentingPoseItemMeta);

        ItemStack holdingItemPose = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta holdingItemPoseItemMeta = holdingItemPose.getItemMeta();
        holdingItemPoseItemMeta.setDisplayName("§7§lGegenstand über dem Kopf halten");
        ArrayList<String> holdingItemPoseLore = new ArrayList<String>();
        holdingItemPoseLore.add("  ");
        String menuPresetString21 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_21", player.getLocale());
        String[] menuPresetArray21 = ChatPaginator.wordWrap(menuPresetString21, 32);
        for (String s : menuPresetArray21) {
            holdingItemPoseLore.add(s);
        }
        holdingItemPoseItemMeta.setLore(holdingItemPoseLore);
        holdingItemPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        holdingItemPose.setItemMeta(holdingItemPoseItemMeta);

        ItemStack pointUpPose = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta pointUpPoseItemMeta = pointUpPose.getItemMeta();
        pointUpPoseItemMeta.setDisplayName("§7§lDirekt nach oben zeigen");
        ArrayList<String> pointUpPoseLore = new ArrayList<String>();
        pointUpPoseLore.add("  ");
        String menuPresetString17 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_17", player.getLocale());
        String[] menuPresetArray17 = ChatPaginator.wordWrap(menuPresetString17, 32);
        for (String s : menuPresetArray17) {
            pointUpPoseLore.add(s);
        }
        pointUpPoseItemMeta.setLore(pointUpPoseLore);
        pointUpPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        pointUpPose.setItemMeta(pointUpPoseItemMeta);

        ItemStack fishermanPose = new ItemStack(Material.FISHING_ROD, 1);
        ItemMeta fishermanPoseItemMeta = fishermanPose.getItemMeta();
        fishermanPoseItemMeta.setDisplayName("§7§lFisher");
        ArrayList<String> fishermanPoseLore = new ArrayList<String>();
        fishermanPoseLore.add("  ");
        String menuPresetString18 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_18", player.getLocale());
        String[] menuPresetArray18 = ChatPaginator.wordWrap(menuPresetString18, 32);
        for (String s : menuPresetArray18) {
            fishermanPoseLore.add(s);
        }
        fishermanPoseItemMeta.setLore(fishermanPoseLore);
        fishermanPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        fishermanPose.setItemMeta(fishermanPoseItemMeta);

        ItemStack dancingPose = new ItemStack(Material.FEATHER, 1);
        ItemMeta dancingPoseItemMeta = dancingPose.getItemMeta();
        dancingPoseItemMeta.setDisplayName("§7§lTanzend 1");
        ArrayList<String> dancingPoseLore = new ArrayList<String>();
        dancingPoseLore.add("  ");
        String menuPresetString19 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_19", player.getLocale());
        String[] menuPresetArray19 = ChatPaginator.wordWrap(menuPresetString19, 32);
        for (String s : menuPresetArray19) {
            dancingPoseLore.add(s);
        }
        dancingPoseItemMeta.setLore(dancingPoseLore);
        dancingPoseItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        dancingPose.setItemMeta(dancingPoseItemMeta);

        ItemStack dancingPose2 = new ItemStack(Material.FEATHER, 1);
        ItemMeta dancingPose2ItemMeta = dancingPose2.getItemMeta();
        dancingPose2ItemMeta.setDisplayName("§7§lTanzend 2");
        ArrayList<String> dancingPose2Lore = new ArrayList<String>();
        dancingPose2Lore.add("  ");
        String menuPresetString20 = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.preset.pose_20", player.getLocale());
        String[] menuPresetArray20 = ChatPaginator.wordWrap(menuPresetString20, 32);
        for (String s : menuPresetArray20) {
            dancingPose2Lore.add(s);
        }
        dancingPose2ItemMeta.setLore(dancingPose2Lore);
        dancingPose2ItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        dancingPose2.setItemMeta(dancingPose2ItemMeta);

        ItemStack helpItem = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta helpItemItemMeta = helpItem.getItemMeta();
        helpItemItemMeta.setCustomModelData(111);
        helpItemItemMeta.setDisplayName("[lang]advancedarmorstand.gui.help[/lang]");
        ArrayList<String> helpItemLore = new ArrayList<String>();
        helpItemLore.add("  ");
        String menuPresetStringHelp = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.help", player.getLocale());
        String[] menuPresetArrayHelp = ChatPaginator.wordWrap(menuPresetStringHelp, 32);
        for (String s : menuPresetArrayHelp) {
            helpItemLore.add(s);
        }
        helpItemItemMeta.setLore(helpItemLore);
        helpItem.setItemMeta(helpItemItemMeta);

        ItemStack backItem = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta backItemItemMeta = backItem.getItemMeta();
        backItemItemMeta.setCustomModelData(54);
        backItemItemMeta.setDisplayName("[lang]advancedarmorstand.gui.back[/lang]");
        ArrayList<String> backItemLore = new ArrayList<String>();
        backItemLore.add("  ");
        String menuPresetStringBack = ChatColor.GRAY + AdvancedArmorStandsMain.getInstance().getMessageString("menu.back", player.getLocale());
        String[] menuPresetArrayBack = ChatPaginator.wordWrap(menuPresetStringBack, 32);
        for (String s : menuPresetArrayBack) {
            backItemLore.add(s);
        }
        backItemItemMeta.setLore(backItemLore);
        backItemItemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        backItem.setItemMeta(backItemItemMeta);

        // Background Item
        ItemStack backgroundItem = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta backgroundMeta = backgroundItem.getItemMeta();
        backgroundMeta.setCustomModelData(1);
        backgroundMeta.setDisplayName("§7§l*");
        backgroundMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        backgroundItem.setItemMeta(backgroundMeta);


        // Set ItemStacks in Inventory

        GUIPresetPoses.setItem(0, defaultPose);
        GUIPresetPoses.setItem(1, defaultPose2);
        GUIPresetPoses.setItem(2, walkingPose1);
        GUIPresetPoses.setItem(3, walkingPose2);
        GUIPresetPoses.setItem(4, sittingPose);
        GUIPresetPoses.setItem(5, wavingPose);
        GUIPresetPoses.setItem(6, greetingPose);
        GUIPresetPoses.setItem(9, greetingPose2);
        GUIPresetPoses.setItem(10, greetingPose3);
        GUIPresetPoses.setItem(11, cheeringPose);
        GUIPresetPoses.setItem(12, cheeringPose2);
        GUIPresetPoses.setItem(13, builderPose);
        GUIPresetPoses.setItem(14, swordFighterPose);
        GUIPresetPoses.setItem(15, fencingPose);
        GUIPresetPoses.setItem(18, archerPose);
        GUIPresetPoses.setItem(19, presentingPose);
        GUIPresetPoses.setItem(20, holdingItemPose);
        GUIPresetPoses.setItem(21, pointUpPose);
        GUIPresetPoses.setItem(22, fishermanPose);
        GUIPresetPoses.setItem(23, dancingPose);
        GUIPresetPoses.setItem(24, dancingPose2);

        GUIPresetPoses.setItem(8, helpItem);
        GUIPresetPoses.setItem(26, backItem);
        // Background
        GUIPresetPoses.setItem(7, backgroundItem);
        GUIPresetPoses.setItem(16, backgroundItem);
        GUIPresetPoses.setItem(17, backgroundItem);
        GUIPresetPoses.setItem(25, backgroundItem);


        // Return Inventory

        return GUIPresetPoses;
    }


        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // Open Menus

    /**
     * Creates and opens a menu to a player, based on a given menu ID.
     *
     * Available menu IDs:
     * 1 = Main Menu
     * 2 = Basic Settings
     * 3 = Body Parts Menu
     * 4 = Movement Menu (Distance 0.1 Blocks)
     * 5 = Movement Menu (Distance 0.5 Blocks)
     * 6 = Movement Menu (Distance 1 Block)
     * 7 = Preset Poses
     *
     * @param player: Player, The player to open the menu for
     * @param menuID: int, Menu ID
     */
    public void openMenu(Player player, int menuID){

        switch(menuID) {
            case 1:
                Inventory mainMenu = createMainMenu(player);
                player.openInventory(mainMenu);
                break;

            case 2:
                Inventory basicSettingsMenu = createBasicSettingsMenu(player);
                player.openInventory(basicSettingsMenu);
                break;

            case 3:
                Inventory bodyPartsMenu = createBodyPartsMenu(player);
                player.openInventory(bodyPartsMenu);
                break;

            case 4:
                Inventory movementMenuSmall = createMovementMenu(player, 1);
                player.openInventory(movementMenuSmall);
                break;

            case 5:
                Inventory movementMenuMedium = createMovementMenu(player, 2);
                player.openInventory(movementMenuMedium);
                break;

            case 6:
                Inventory movementMenuLarge = createMovementMenu(player, 3);
                player.openInventory(movementMenuLarge);
                break;

            case 7:
                Inventory presetPoseMenu = createPresetPosesMenu(player);
                player.openInventory(presetPoseMenu);
                break;
        }



    }



}
