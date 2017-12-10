package com.immunity.ImmunityBot.Commands;

import com.google.code.chatterbotapi.ChatterBot;
import com.google.code.chatterbotapi.ChatterBotFactory;
import com.google.code.chatterbotapi.ChatterBotSession;
import com.google.code.chatterbotapi.ChatterBotType;
import de.btobastian.javacord.entities.Channel;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

/**
 * Created By RainDropInMCYT // RealJBTYTM on 9/24/2017.
 * All Rights Reserved.
 */

public class CleverBot implements CommandExecutor {

    @Command(aliases = {"+chat", "+clever" }, description = "Shows some information about the bot.", usage = "+chat [text]")
    public void onCommand(Channel channel) throws Exception{
        ChatterBotFactory factory = new ChatterBotFactory();

        ChatterBot ImmunityChatterBot = factory.create(ChatterBotType.PANDORABOTS, "un87f2bc42");
        ChatterBotSession ImmunityBotSession = ImmunityChatterBot.createSession();

        while (true) {

            

        }

    }

}
