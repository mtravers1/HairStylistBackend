package com.example.hair;

public class Hair {
    private Integer id;
    private String name;
    private Double price;
    private Double time;

    public Hair(Integer id, String name, Double price, Double time){
        this.id=id;
        this.name=name;
        this.price=price;
        this.time=time;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public Integer getId(){
        return  id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return  name;
    }

    public void setPrice(Double price){
        this.price=price;
    }

    public Double getPrice(){
        return price;
    }

    public void setTime(Double time){
        this.time=time;
    }

    public Double getTime(){
        return time;
    }

}
