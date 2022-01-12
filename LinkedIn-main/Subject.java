package com.LinkedInApp;

public interface Subject extends Human{
    void follow(Observer flr);

    void unfollow(Observer flr);

    void notifyFollowers();

    void uploadPost(String post_title);

    String getName();
    void setName(String name);
    //void setRole(String role);

    String getPost_title();
}
