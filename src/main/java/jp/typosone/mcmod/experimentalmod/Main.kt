package jp.typosone.mcmod.experimentalmod

import jp.typosone.mcmod.experimentalmod.item.CheatPickaxe
import jp.typosone.mcmod.experimentalmod.item.Items
import jp.typosone.mcmod.experimentalmod.proxy.CommonProxy
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraft.util.ResourceLocation
import net.minecraftforge.client.event.ModelRegistryEvent
import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.SidedProxy
import net.minecraftforge.fml.common.event.FMLConstructionEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly
import org.apache.logging.log4j.LogManager

const val MOD_ID = "experimentalmod"
const val MOD_NAME = "Experimental Mod"
const val MOD_VERSION = "0.0.1"
val logger = LogManager.getLogger(MOD_ID)
const val SERVER_PROXY = "jp.typosone.mcmod.experimentalmod.proxy.CommonProxy"
const val CLIENT_PROXY = "jp.typosone.mcmod.experimentalmod.proxy.ClientProxy"

@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION, modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter")
object Main {
    @SidedProxy(serverSide = SERVER_PROXY, clientSide = CLIENT_PROXY)
    lateinit var PROXY: CommonProxy

    @Mod.EventHandler
    fun construction(event: FMLConstructionEvent) {
        MinecraftForge.EVENT_BUS.register(this)
    }

    @Mod.EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        PROXY.preInit()
    }

    @SubscribeEvent
    fun registerItems(event: RegistryEvent.Register<Item>) {
        Items.registerItems(event.registry)
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    fun registerModels(event: ModelRegistryEvent) {
        Items.registerItemModels()
    }
}