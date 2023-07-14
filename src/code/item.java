/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.text.NumberFormat;

/**
 *
 * @author Ishini
 */
public class item implements Comparable<item>{
    private int itemid;
    private String itemname;
    private int quantity;
    private double price;
    private int preference;

public item(int itemid,String itemname,int quantity,float price,int preference){
    this.itemid = itemid;
    this.itemname = itemname;
    this.quantity = quantity;
    this.price = price;
    this.preference = preference;

}

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPreference() {
        return preference;
    }

    public void setPreference(int preference) {
        this.preference = preference;
    }

    @Override
    public String toString() {
        NumberFormat nf =NumberFormat.getNumberInstance();
        return itemname + ", Qty: " + quantity + ", " + nf.format(price)+"LKR,"+preference;
    }

    @Override
    public int compareTo(item o) {
        if (quantity > o.getQuantity()) {
            return 1;
        } else if (quantity < o.getQuantity()) {
            return -1;
        } else {
            return 0;
        }
        
        
        
        
        
        
        
        
      
        
        
        
        
        
        
        
        
        
        //To change body of generated methods, choose Tools | Templates.
    }




}