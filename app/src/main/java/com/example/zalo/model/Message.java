package com.example.zalo.model;

public class Message {
    private int sourceImg;
    private String title, content;
    private String hour;

    public Message() {
    }

    public Message(int sourceImg, String title, String content, String hour) {
        this.sourceImg = sourceImg;
        this.title = title;
        this.content = content;
        this.hour = hour;
    }

    public int getSourceImg() {
        return sourceImg;
    }

    public void setSourceImg(int sourceImg) {
        this.sourceImg = sourceImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
