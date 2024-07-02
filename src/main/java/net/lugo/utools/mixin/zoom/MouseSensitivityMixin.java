package net.lugo.utools.mixin.zoom;

import net.lugo.utools.UTools;
import net.lugo.utools.features.Zoom;
import net.minecraft.client.Mouse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(Mouse.class)
public class MouseSensitivityMixin {
    @ModifyVariable(method = "updateMouse", at = @At("STORE"), ordinal = 3)
    private double updateMouse(double f) {
        if (UTools.getConfig().zoomRelativeSensitivity) return f / (double) Zoom.latestEffectiveZoom;
        return f;
    }
}
