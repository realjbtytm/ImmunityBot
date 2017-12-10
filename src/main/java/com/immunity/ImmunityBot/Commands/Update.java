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

public class Update implements CommandExecutor {

    @Command(aliases = {"+update"}, description = "Update Embed!", usage = "+update [text]")
    public void onCommand(Channel channel, Message message, DiscordAPI api){
        EmbedBuilder eb = new EmbedBuilder();
        Server server = message.getChannelReceiver().getServer();
        eb.setTitle("Update by the Immunity Network!");
        eb.setDescription(message.getContent().replace("+update","@everyone "));
        eb.setFooter("ImmunityNetwork © 2017");
        eb.setColor(Color.YELLOW);
        eb.setThumbnail("https://images.mysafetysign.com/img/lg/I/tourist-information-symbol-iso-sign-is-1293.png");
        if(message.getAuthor().getRoles(server).contains(server.getRoleById("362375942850609152"))){
            api.getChannelById("360588769520386050").sendMessage(null, eb);
        }
        else{
            return;
        }
    }

}
