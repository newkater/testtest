package com.company;

public class CreateItem {
    private long id;
    private String label;

    public CreateItem(long id, String text) {
        this.id = id;
        this.label = text;
    }

    public CreateItem() {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
