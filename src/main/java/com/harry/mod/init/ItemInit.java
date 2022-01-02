package com.harry.mod.init;

import java.util.ArrayList;
import java.util.List;

import com.harry.mod.objects.armor.ArmorBase;
import com.harry.mod.objects.items.ItemBase;
import com.harry.mod.objects.tools.ToolAxe;
import com.harry.mod.objects.tools.ToolHoe;
import com.harry.mod.objects.tools.ToolPickaxe;
import com.harry.mod.objects.tools.ToolSpade;
import com.harry.mod.objects.tools.ToolSword;
import com.harry.mod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 2, 180, 5.0F, 1.5F, 5);
	public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("armor_copper", Reference.MOD_ID + ":copper", 13, new int[] {2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	
	public static final ItemSword SWORD_COPPER = new ToolSword("sword_copper", TOOL_COPPER);
	public static final ItemSpade SHOVEL_COPPER = new ToolSpade("shovel_copper", TOOL_COPPER);
	public static final ItemPickaxe PICKAXE_COPPER = new ToolPickaxe("pickaxe_copper", TOOL_COPPER);
	public static final ItemAxe AXE_COPPER = new ToolAxe("axe_copper", TOOL_COPPER);
	public static final ItemHoe HOE_COPPER = new ToolHoe("hoe_copper", TOOL_COPPER);
	
	public static final Item HELMET_COPPER = new ArmorBase("helmet_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_COPPER = new ArmorBase("chestplate_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_COPPER = new ArmorBase("leggings_copper", ARMOR_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_COPPER = new ArmorBase("boots_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.FEET);
}
