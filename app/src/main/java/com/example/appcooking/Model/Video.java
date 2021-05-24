package com.example.appcooking.Model;

public class Video {
    private String name;
    private String img;
    private String id;

    public Video(String name, String img, String id) {
        this.setName(name);
        this.setImg(img);
        this.setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
