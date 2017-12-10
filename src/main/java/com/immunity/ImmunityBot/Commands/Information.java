package com.immunity.ImmunityBot.Commands;

import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.entities.Channel;
import de.btobastian.javacord.entities.Server;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.javacord.entities.message.embed.EmbedBuilder;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;

import java.awt.*;

/**
 * Created By RainDropInMCYT // RealJBTYTM on 9/26/2017.
 * All Rights Reserved.
 */

public class Information implements CommandExecutor {

    @Command(aliases = {"+information"}, description = "Information Embed!", usage = "+announce [text]")
    public void onCommand(Channel channel, Message message, DiscordAPI api) {
        EmbedBuilder eb = new EmbedBuilder();
        Server server = message.getChannelReceiver().getServer();
        eb.setTitle("Immunity Network Information!");
        eb.setDescription(
                "\n" +
                "***Basic Information -*** \n" +
                        "\n" +
                "**Website Link -** http://immunity.namelesshosting.com/\n" +
                "**Discord Invitation Link -** https://discord.gg/q4sWbPJ\n" +
                "**Server IP Address -** Immunity.cf:25809\n" +
                "\n" +
                "***Application Information - *** \n" +
                "If you'd like to apply you may fill out this form (Keep in mind you can only apply for Helper), once you've completed the form just wait patiently. Tagging a staff member about your application is not allowed, if you make a joke application it will be ignored. https://docs.google.com/forms/d/1LVyBm1WsLnfy5vtj6N6II3Bw0DhDx7sxD4poq0ysqGs/edit.\n" +
                "\n" +
                "***Rules - *** http://www.immunity.namelesshosting.com/rules\n" +
                "\n" +
                "***REMINDER*** - If a staff member tells you to do something please follow their orders even if it's not a stated rule\n" +
                "\n" +
                "Thanks,\n" +
                "-Immunity Staff Team");
        eb.setFooter("ImmunityNetwork © 2017");
        eb.setColor(Color.YELLOW);
        eb.setThumbnail("https://images.mysafetysign.com/img/lg/I/tourist-information-symbol-iso-sign-is-1293.png");
        if(message.getAuthor().getRoles(server).contains(server.getRoleById("362375942850609152"))){
            api.getChannelById("350922450940198913").sendMessage(null, eb);
        }
        else{
            return;
        }
    }
}
