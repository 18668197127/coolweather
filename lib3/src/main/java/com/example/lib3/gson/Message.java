package com.example.lib3.gson;

import java.util.List;

public class Message {

    private  int id;
    private  String text;
    private List<Double> geo;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Double> getGeo() {
        return geo;
    }

    public void setGeo(List<Double> geo) {
        this.geo = geo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Message(int id, String text, List<Double> geo, User user) {
        this.id = id;
        this.text = text;
        this.geo = geo;
        this.user = user;
    }
    public Message(){}

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", geo=" + geo +
                ", user=" + user +
                '}';
    }
}
