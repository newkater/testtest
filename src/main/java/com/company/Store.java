package com.company;

import java.util.ArrayList;

public class Store {
    private static ArrayList <Item> items = new ArrayList<>();

    public static void setItem(Item item) {
        Store.items.add(item);
    }

    public static void deleteItem(int itemId) {
        Store.items.remove(itemId);
    }

    public static ArrayList<Item> getItems() {
        return items;
    }

    public static void updateItem(int itemId, Item newItem) {
        Store.items.remove(itemId);
        Store.items.add(itemId, newItem);

    }
}
