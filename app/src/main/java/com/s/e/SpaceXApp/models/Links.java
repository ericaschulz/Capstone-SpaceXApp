package com.s.e.SpaceXApp.models;

import androidx.room.Entity;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



@Entity (tableName = "Links")

public class Links {

    @SerializedName("patch")
    @Expose
    private String patch;
    @SerializedName("reddit")
    @Expose
    private String reddit;
    @SerializedName("flickr")
    @Expose
    private String flickr;
    @SerializedName("presskit")
    @Expose
    private String presskit;
    @SerializedName("webcast")
    @Expose
    private String webcast;
    @SerializedName("youtube_id")
    @Expose
    private String youtubeId;
    @SerializedName("article")
    @Expose
    private String article;
    @SerializedName("wikipedia")
    @Expose
    private String wikipedia;

    public Links(String patch, String reddit, String flickr, String presskit, String webcast, String youtubeId, String article, String wikipedia) {
        super();
        this.patch = patch;
        this.reddit = reddit;
        this.flickr = flickr;
        this.presskit = presskit;
        this.webcast = webcast;
        this.youtubeId = youtubeId;
        this.article = article;
        this.wikipedia = wikipedia;
    }

    public String getPatch() {
        return patch;
    }

    public void setPatch(String patch) {
        this.patch = patch;
    }

    public String getReddit() {
        return reddit;
    }

    public void setReddit(String reddit) {
        this.reddit = reddit;
    }

    public String getFlickr() {
        return flickr;
    }

    public void setFlickr(String flickr) {
        this.flickr = flickr;
    }

    public String getPresskit() {
        return presskit;
    }

    public void setPresskit(String presskit) {
        this.presskit = presskit;
    }

    public String getWebcast() {
        return webcast;
    }

    public void setWebcast(String webcast) {
        this.webcast = webcast;
    }

    public String getYoutubeId() {
        return youtubeId;
    }

    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }
}





