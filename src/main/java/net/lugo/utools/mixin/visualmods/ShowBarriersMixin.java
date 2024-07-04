package net.lugo.utools.mixin.visualmods;

import net.lugo.utools.UTools;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientWorld.class)
public class ShowBarriersMixin {
    @Inject(method = "getBlockParticle", at = @At("RETURN"), cancellable = true)
    public void getBlockParticle(CallbackInfoReturnable<Block> cir) {
        if ((UTools.getConfig().showBarriers) && (cir.getReturnValue() == null)) {
            cir.setReturnValue(Blocks.BARRIER);
        }
    }
}
