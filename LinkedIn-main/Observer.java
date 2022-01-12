package com.LinkedInApp;

public interface Observer extends Human{
    void update();
    void setName(String name);
    void followedPerson(Subject p);
}
