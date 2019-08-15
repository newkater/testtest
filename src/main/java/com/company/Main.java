package com.company;

import io.javalin.Javalin;

import static io.javalin.apibuilder.ApiBuilder.crud;

public class Main {

    public static void main(String[] args) {
        Javalin app = Javalin.create()
                .enableDebugLogging()
                .enableCorsForAllOrigins();  //for debug

        app.start(7000);

        app.routes(() -> {
            crud("/item/:id", new ItemController());
        });

    }
}
