package net.mehvahdjukaar.supplementaries.forge;

import net.mehvahdjukaar.supplementaries.Supplementaries;
import net.mehvahdjukaar.supplementaries.common.block.blocks.IronGateBlock;
import net.mehvahdjukaar.supplementaries.reg.ClientRegistry;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.AbstractSkeleton;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterEntitySpectatorShadersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Supplementaries.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SupplementariesForgeClient {

    @SubscribeEvent
    public static void init(final FMLClientSetupEvent event) {
      //  event.enqueueWork(ClientRegistry::setup);
    }




}
