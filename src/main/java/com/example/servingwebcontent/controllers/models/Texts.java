package com.example.servingwebcontent.controllers.models;

import jakarta.persistence.*;


@Entity
public class Texts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private Long id;
    private String title;
    @Column(length = 65535, columnDefinition = "text")
    private  String text;

    private String photo;
    private int views;

    public Texts() {
    }

    public Texts(String title, String text, String photo) {
        this.title = title;
        this.text = text;
        this.photo = photo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
