package com.example.instagram;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Person {
    String friendname;
    String friendlocation;
    String tvfavorite;
    String tvreplyname;
    String tvreply;
    Drawable ibmystory;
    Drawable ivfriendtimeline;

    public Person(String friendname, String friendlocation, String tvfavorite, String tvreplyname, String tvreply, Drawable ibmystory, Drawable ivfriendtimeline) {
        this.friendname = friendname;
        this.friendlocation = friendlocation;
        this.tvfavorite = tvfavorite;
        this.tvreplyname = tvreplyname;
        this.tvreply = tvreply;
        this.ibmystory = ibmystory;
        this.ivfriendtimeline = ivfriendtimeline;
    }

    public void setFriendname(String friendname) {
        this.friendname = friendname;
    }

    public void setFriendlocation(String friendlocation) {
        this.friendlocation = friendlocation;
    }

    public void setTvfavorite(String tvfavorite) {
        this.tvfavorite = tvfavorite;
    }

    public void setTvreplyname(String tvreplyname) {
        this.tvreplyname = tvreplyname;
    }

    public void setTvreply(String tvreply) {
        this.tvreply = tvreply;
    }

    public String getFriendname() {
        return friendname;
    }

    public String getFriendlocation() {
        return friendlocation;
    }

    public String getTvfavorite() {
        return tvfavorite;
    }

    public String getTvreplyname() {
        return tvreplyname;
    }

    public String getTvreply() {
        return tvreply;
    }

    public Drawable getIbmystory() {
        return ibmystory;
    }

    public Drawable getIvfriendtimeline() {
        return ivfriendtimeline;
    }
}
