package net.lugo.utools.command;

import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.lugo.utools.features.FullBright;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.command.CommandRegistryAccess;
import static com.mojang.brigadier.arguments.IntegerArgumentType.*;

public class FullBrightCommand {
    public static void register(CommandDispatcher<FabricClientCommandSource> dispatcher, CommandRegistryAccess ignoredCommandRegistryAccess) {
        dispatcher.register(ClientCommandManager.literal("fullbright")
                .executes(context -> FullBright.toggleGamma())
                .then(ClientCommandManager.argument("value", integer())
                        .executes(context -> FullBright.setValue((double) getInteger(context, "value") / 100))
                )
        );
    }
}
