package com.company;


import io.javalin.Context;
import io.javalin.apibuilder.CrudHandler;
import org.jetbrains.annotations.NotNull;

public class ItemController implements CrudHandler {

    @Override
    public void create(@NotNull Context context) {
        CreateItem createItem = context.bodyAsClass(CreateItem.class);
        Item item = new Item();
        item.setId(createItem.getId());
        item.setLabel(createItem.getLabel());
        Store.setItem(item);
        context.status(200);
        context.result("Success");
    }

    @Override
    public void delete(@NotNull Context context, @NotNull String s) {
        int itemId = Integer.valueOf(s);
        Store.deleteItem(itemId);
        context.status(200);
        context.result("Success");
    }

    @Override
    public void getAll(@NotNull Context context) {
        context.status(200);
        context.json(Store.getItems());

    }

    @Override
    public void getOne(@NotNull Context context, @NotNull String s) {
        int itemId = Integer.valueOf(s);
        context.status(200);
        context.json(Store.getItems().get(itemId));
    }

    @Override
    public void update(@NotNull Context context, @NotNull String s) {
        int itemId = Integer.valueOf(s);
        Store.updateItem(itemId, context.bodyAsClass(Item.class));
        context.status(200);
    }
}
