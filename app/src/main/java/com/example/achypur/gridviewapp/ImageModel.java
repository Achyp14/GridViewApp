package com.example.achypur.gridviewapp;


public class ImageModel {
    private String catName;
    private String catLink;
    private String catImage;

    public ImageModel(String name, String link, String image) {
        this.catName = name;
        this.catLink = link;
        this.catImage = image;
    }

    public ImageModel() {
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatLink() {
        return catLink;
    }

    public void setCatLink(String catLink) {
        this.catLink = catLink;
    }

    public String getCatImage() {
        return catImage;
    }

    public void setCatImage(String catImage) {
        this.catImage = catImage;
    }
}
