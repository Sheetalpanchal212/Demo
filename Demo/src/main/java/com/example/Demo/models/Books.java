package com.example.Demo.models;

public class Books {
    private  int id;
    private int pages;
    private String name;
    public Books(){

    }

    public Books(int id, int pages, String name) {
        this.id = id;
        this.pages = pages;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setpages(int pages) {
        this.pages = pages;
    }

//    public void setpages(int pages) {
//        this.pages=pages;
//    }
}
