package com.sbo.social;

//This class will fetch and store data
public class News_Thread {
    private String ImageLink;
    private String Detials;

    public News_Thread(){

    }

    public News_Thread(String detials, String imageLink) {
        Detials = detials;
        ImageLink = imageLink;
    }

    //Set and Get
    public void setDetials(String detials) {
        Detials = detials;
    }

    public void setImageLink(String imageLink) {
        ImageLink = imageLink;
    }

    public String getDetials() {
        return Detials;
    }

    public String getImageLink() {
        return ImageLink;
    }
}
