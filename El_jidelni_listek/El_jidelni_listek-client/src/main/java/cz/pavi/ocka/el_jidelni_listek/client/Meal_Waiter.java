/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.pavi.ocka.el_jidelni_listek.client;

/**
 *
 * @author voldy
 */
public class Meal_Waiter {
    private String mealName;
    private int price;
    private int availability;
    
    Meal_Waiter(String mealName, int price, int availability){
    this.mealName = mealName;
    this.price = price;
    this.availability = availability;
 
    }

    public String getMealName() {
        return mealName;
    }

    public int getPrice() {
        return price;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

   
    
    
    
}
