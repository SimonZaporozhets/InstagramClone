package ru.startandroid.develop.instagramclone;

public class Post {

    private String imageUrl;
    private String username;

    public Post() {
    }

    public Post(String imageUrl, String username) {
        this.imageUrl = imageUrl;
        this.username = username;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
