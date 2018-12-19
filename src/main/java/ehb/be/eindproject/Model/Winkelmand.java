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

    /*
    public void getTotalOfWinkelmand(){
        total = 0;
        for(String x: producten){
            if (x.equals("A")){
                total += 0.0;
            }else if (x.equals("B")){
                total += 0.0;
            }else if (x.equals("C")){
                total += 0.00;
            }
        }
        System.out.println(total);
    }

*/



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
