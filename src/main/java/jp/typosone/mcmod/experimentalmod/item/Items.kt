package jp.typosone.mcmod.experimentalmod.item

import jp.typosone.mcmod.experimentalmod.MOD_ID
import jp.typosone.mcmod.experimentalmod.Main
import net.minecraft.item.Item
import net.minecraftforge.fml.common.registry.GameRegistry
import net.minecraftforge.registries.IForgeRegistry
import kotlin.reflect.full.memberProperties

object Items {
    @GameRegistry.ObjectHolder("$MOD_ID:cheat_pickaxe")
    val cheatPickaxe: Item? = null

    fun registerItems(registry: IForgeRegistry<Item>) {
        /*
        registry.registerAll(
                CheatPickaxe(),
                SuperPickaxe()
        )
        */
        registry.register(CheatPickaxe())
        registry.register(SuperPickaxe())
    }

    fun registerItemModels() {
        this::class.memberProperties.forEach { p ->
            when (p) {
                is Item -> Main.PROXY.registerItemRenderer(p, 0, p.name)
            }
        }
    }
}