package exercise;

import io.javalin.Javalin;

public final class App {

    public static Javalin getApp() {
        // BEGIN
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });
        app.get("/domains", ctx -> ctx.json(Data.getDomains()));
        app.get("/phones", ctx -> ctx.json(Data.getPhones()));

        return app;
        // END
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
