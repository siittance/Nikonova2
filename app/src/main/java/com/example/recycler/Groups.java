package com.example.recycler;

import java.util.PrimitiveIterator;

public class Groups {
    private String name;
    private int image;
    private String description;

    public Groups(String name, int image, String description){

        this.name = name;
        this.image = image;
        this.description = description;
    }

    public String getName(){

        return name;
    }

    public int getImage(){
        return image;
    }

    public void setImage(int image){
        this.image = image;
    }

    public void setName(String groupName){

        this.name = groupName;
    }


    public String getDescription(){
        return description;
    }

    public void setDescription(){
        this.description = description;
    }

}
