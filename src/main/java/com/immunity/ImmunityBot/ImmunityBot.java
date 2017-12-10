package com.immunity.ImmunityBot;

        import com.google.common.util.concurrent.FutureCallback;
        import com.immunity.ImmunityBot.Commands.Announcement;
        import com.immunity.ImmunityBot.Commands.Info;
        import com.immunity.ImmunityBot.Commands.Information;
        import com.immunity.ImmunityBot.Commands.Update;
        import de.btobastian.javacord.DiscordAPI;
        import de.btobastian.javacord.Javacord;
        import de.btobastian.sdcf4j.CommandHandler;
        import de.btobastian.sdcf4j.handler.JavacordHandler;

public class ImmunityBot {

    public static void main(String[] args) {
        ImmunityBot("MzYwNTQ3NTE5NDU5MDk4NjI0.DKmjLw.419ENhtP_nMTmW2ee6pTzmGeN1g");
    }

    public static void ImmunityBot(String token) {
        DiscordAPI api = Javacord.getApi("MzYwNTQ3NTE5NDU5MDk4NjI0.DKmjLw.419ENhtP_nMTmW2ee6pTzmGeN1g", true);
        // connect
        api.connect(new FutureCallback<DiscordAPI>() {
            @Override
            public void onSuccess(DiscordAPI api) {
                final CommandHandler handler = new JavacordHandler(api);
                handler.registerCommand(new Info());
                handler.registerCommand(new Announcement());
                handler.registerCommand(new Information());
                handler.registerCommand(new Update());
            }

            @Override
            public void onFailure(Throwable t) {
                t.printStackTrace();
            }
        });
    }

}