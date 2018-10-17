package jp.typosone.mcmod.experimentalmod.proxy

import jp.typosone.mcmod.experimentalmod.MOD_NAME
import jp.typosone.mcmod.experimentalmod.logger
import net.minecraft.item.Item

open class CommonProxy {
    open fun preInit() {
        logger.info("$MOD_NAME is loaded!")
    }

    open fun registerItemRenderer(item: Item, meta: Int, id: String) {
    }
}