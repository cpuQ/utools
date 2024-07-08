package net.lugo.utools.registration;

import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.lugo.utools.command.ClientTimeCommand;
import net.lugo.utools.command.FullBrightCommand;
import net.lugo.utools.command.UToolsCommand;

public class Commands {
    public static void registerCommands() {
        ClientCommandRegistrationCallback.EVENT.register(FullBrightCommand::register);
        ClientCommandRegistrationCallback.EVENT.register(UToolsCommand::register);
        ClientCommandRegistrationCallback.EVENT.register(ClientTimeCommand::register);
    }
}
