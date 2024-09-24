/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop2;

/**
 *
 * @author Lenovo
 */
public class Car {
    private String model;
    private int price;

    public Car() {
        model="Toyta";
        price=12000;
    }
    public Car (String m,int p){
        this.model=m;
        this.price=p;
    }
    
    
    
    public void setModel(String M){
      this.model=M;
     
    }
    public String getModel(){
      return model ;
    }
    public void setPrice(int P){
     this.price=P;
    }
    public int getPrice(){
        return price;
    }
}
