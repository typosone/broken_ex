package jp.typosone.mcmod.experimentalmod.item

import jp.typosone.mcmod.experimentalmod.MOD_ID
import net.minecraft.item.Item

abstract class ItemBase(protected val name: String) : Item() {
    init {
        require(name.isNotBlank()) { "name must not be blank" }
        unlocalizedName = name
        setRegistryName(MOD_ID, name)
    }
}