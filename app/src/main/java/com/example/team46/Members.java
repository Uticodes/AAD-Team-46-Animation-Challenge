package com.example.team46;

public class Members {
    private String name;
    private String location;
    private String imageURL;

    Members(String name, String location, String imageURL) {
        this.name = name;
        this.location = location;
        this.imageURL = imageURL;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getLocation() {
        return location;
    }

    public void setLocation() {
        setLocation();
    }

    public void setLocation(String location) {
        this.location = location;
    }

    String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
