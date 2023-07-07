package com.example.listviewarrayadapter.ListView.MyList;

public class State {

    private String name;
    private String surname;
    private int iconResource;

    public State(String name, String surname, int iconResoutce) {
        this.name = name;
        this.surname = surname;
        this.iconResource = iconResoutce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIconResource() {
        return iconResource;
    }

    public void setIconResource(int iconResource) {
        this.iconResource = iconResource;
    }
}
