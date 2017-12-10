package com.immunity.ImmunityBot.Commands;

import de.btobastian.javacord.entities.Channel;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

import de.btobastian.javacord.entities.message.embed.EmbedBuilder;

import java.awt.*;

/**
 * Created By RainDropInMCYT // RealJBTYTM on 9/24/2017.
 * All Rights Reserved.
 */

public class Info implements CommandExecutor {
        @Command(aliases = {"+info", "+i" }, description = "Shows some information about the bot.", usage = "+info")
        public void onCommand(Channel channel) {
            EmbedBuilder eb = new EmbedBuilder();
            eb.setTitle("The Immunity Help Embed");
            eb.setFooter("The Immunity Network and RainDropInMC 2017.");
            eb.setDescription("The Immunity Network Bot was created by RainDropInMC on 9-24-17 to improve the Immunity Network Discord!");
            eb.setColor(Color.RED);
            channel.sendMessage(null, eb);
        }
}
