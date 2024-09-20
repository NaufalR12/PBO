/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Circle {  
   private double radius;
   private String color;
   
   public Circle() {  
      radius = 7.0;
      color = "red";
   } 
   
   public double getArea() {
      return radius*radius*Math.PI;
   }
}
