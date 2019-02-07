package com.example.qq.qpp;


public class Tools {

    private int ColorLayout;
    private String title;
    private int EmojiImage;

    public Tools(int ColorLayout, String title, int EmojiImage){
        this.ColorLayout = ColorLayout;
        this.title = title;
        this.EmojiImage = EmojiImage;
    }

    public int getColorLayout() {
        return ColorLayout;
    }

    public int getEmojiImage() {
        return EmojiImage;
    }

    public String getTitle() {
        return title;
    }
}
