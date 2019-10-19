package com.example.team46;

import java.util.ArrayList;

public class Members {
    private String name;
    private String location;
    private String imageURL;

    public Members(String name, String location, String imageURL) {
        this.name = name;
        this.location = location;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public ArrayList<Members> initMembers() {
        ArrayList<Members> list = new ArrayList<>();
        list.add(new Members("Wilfred Omuvwie", "Bayelsa State", "wilfredreg.png"));
        list.add(new Members ("Chika Ani", "Port Harcourt", "chika_ani.jpg"));
        list.add(new Members("Plang Dakon", "Jos", "dakon_plang_josiah.jpg"));
        list.add(new Members("Adigun Alo", "Abia", "adigun_alo.jpg"));

        return list;
    }
}
