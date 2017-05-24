/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.msgbroker.model;

/**
 *
 * @author User
 */
public class Drawing {
    
    String color;
    int x, y,z;
    
    public Drawing(){}
    public Drawing(String color,int x , int y, int z ){
       this.x = x;
       this.y = y;
       this.z = z;
       this.color = color;
    }
    
    public String getColor(){
     return color;
    }
    
    
    public int getX(){
    return x;
    }
    
    public int getY(){
    return y;
    }
     
    public int getZ(){
    return z;
    }
     
}

