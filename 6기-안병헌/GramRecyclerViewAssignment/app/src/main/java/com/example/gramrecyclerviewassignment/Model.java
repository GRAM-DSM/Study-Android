package com.example.gramrecyclerviewassignment;

public class Model {
    String name;
    String year;
    String mobile;

    public Model(String name, String year, String moblie){
        this.name = name;
        this.year = year;
        this.mobile = moblie;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getYear(){
        return year;
    }
    public void setYear(String year){
        this.year = year;
    }

    public String getMobile(){
        return mobile;
    }
    public void setMobile(){
        this.mobile = mobile;
    }

}

