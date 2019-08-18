package com.company;

import java.util.ArrayList;

public class Store {
    private static ArrayList <Item> items = new ArrayList<>();

    public static void setItem(Item item) {
        Store.items.add(item);
    }

    public static void deleteItem(int itemId) {
        for ( Item a:Store.items) {
            if (a.getId() == itemId) {
                Store.items.remove(Store.items.indexOf(a));
                break;
            }
        }
    }

    public static ArrayList<Item> getItems() {
        return items;
    }

    public static void updateItem(int itemId, Item newItem) {
        for ( Item a:Store.items) {
            if (a.getId() == itemId) {
                Store.items.remove(Store.items.indexOf(a));
                Store.items.add(a);
                break;
            }
        }
    }
}
