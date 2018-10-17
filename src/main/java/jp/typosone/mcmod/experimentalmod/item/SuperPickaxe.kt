package jp.typosone.mcmod.experimentalmod.item

import jp.typosone.mcmod.experimentalmod.MOD_ID
import net.minecraft.item.ItemPickaxe
import net.minecraft.util.ResourceLocation
import net.minecraftforge.common.util.EnumHelper

val SUPER_MATERIAL = EnumHelper.addToolMaterial(
        "CHEAT_MATERIAL"
        , 4
        , 4000
        , 16.0F
        , 0.0F
        , 40)

class SuperPickaxe() : ItemPickaxe(CHEAT_MATERIAL ?: ToolMaterial.DIAMOND) {
    init {
        unlocalizedName = "super_pickaxe"
        registryName = ResourceLocation("$MOD_ID:super_pickaxe")
    }
}