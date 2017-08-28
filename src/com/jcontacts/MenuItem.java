package com.jcontacts;

public class MenuItem {
    private String index;
    private String description;
    private Runnable runMethod;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Runnable getRunMethod() {
        return runMethod;
    }

    public void setRunMethod(Runnable runMethod) {
        this.runMethod = runMethod;
    }
}
