/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.pavi.ocka.el_jidelni_listek.client;
import java.util.ArrayList;

/**
 *
 * @author voldy
 */
public class MealList_Waiter {
    
    private ArrayList<Meal_Waiter> meallist;
    
    public MealList_Waiter(){
        
        
        //new ArrayList<Meal>;
    
    }
    
    public void addToMealList(Meal_Waiter meal){
    
    meallist.add(meal);
    
    
    }
    public void listMealList(){
   
        //vypis celeho listu do gui
        for (int i = 0; i < meallist.size(); i++) {
           //neco (meallist.get(i);)
            //vypis polozky do gui
            
        }
       
    
    }
    
        
   
   
    
    
    
}
