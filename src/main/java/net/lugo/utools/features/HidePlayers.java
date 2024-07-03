package net.lugo.utools.features;

import net.lugo.utools.util.HudMessage;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class HidePlayers {
    private static boolean toggled = false;

    public static boolean get() {
        return toggled;
    }

    public static void toggle() {
        toggled = !toggled;

        MutableText message;
        if (toggled) message = Text.translatable("text.utools.message.hidePlayersToggle.on");
        else message = Text.translatable("text.utools.message.hidePlayersToggle.off");
        HudMessage.show(message, Formatting.DARK_AQUA);
    }
}
