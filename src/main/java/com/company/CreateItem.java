package com.company;

public class CreateItem {
    private long id;
    private String text;

    public CreateItem(long id, String text) {
        this.id = id;
        this.text = text;
    }

    public CreateItem() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
