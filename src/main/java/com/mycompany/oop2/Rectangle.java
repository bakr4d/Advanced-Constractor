/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop2;

/**
 *
 * @author Lenovo
 */
public class Rectangle {
    
    private double length;//12 / 5
    private double width; // 23.5 / 4
    private double area;
    
    
    public Rectangle(){//That is the default Constructor
    }
    public Rectangle(int l,int w){
       this.length=l;
       this.width=w;

    }
    
    public void setlength(double L){
        this.length=L;
        
    }
    public double getlength(){
        return length;
        
    }
    public void setWidth(double W){
        this.width=W;
    }
    public double getWidth(){
        return width;
    }

    public double getArea(){
        return length*width;
    }
    public double getperimeter(){
        return (length+width)*2;
    }
   
    
    
    
    
    
    
}
