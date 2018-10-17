package jp.typosone.mcmod.experimentalmod

import net.minecraft.block.Block
import net.minecraft.item.Item

private fun Block.getItem(): Item? {
    return Item.getItemFromBlock(this)
}