package ehb.be.eindproject.Model;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Winkelmand {
    //singleton pattern
    private static Winkelmand instance = new Winkelmand();

    private Winkelmand() {
        producten = new ArrayList<Product>();
    }

    public static Winkelmand getInstance() {
        return instance;
    }

    //Own variables/methods
    ArrayList<Product> producten;
    float total;

    public void addProducten(Product p){
        producten.add(p);
    }
    public void removeProducten(Product p){
        producten.remove(p);
    }

    public ArrayList<Product> getProducten() {
        return producten;
    }


    public float getTotalOfWinkelmand(){
       float total = 0;

        for (Product p: producten) {
            total += p.getPrijs();
        }

       return total;
    }





    //private static Winkelmand ourInstance = new Winkelmand();

    //public static Winkelmand getInstance() {
        //return ourInstance;
    //}

    //private Winkelmand() {
    //}

    //public HashSet<Product> getCart() {
        //return cart;
    //}
}
