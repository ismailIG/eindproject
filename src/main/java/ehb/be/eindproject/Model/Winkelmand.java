package ehb.be.eindproject.Model;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Winkelmand {
    List<String> producten;
    float total;

    public Winkelmand() {
        producten = new ArrayList<String>();
    }
    public void addProducten(String producten){
        producten.addProducten();
    }
    public void removeProducten(String producten){
        producten.removeProducten();
    }

    public void getNumberOfProducten(){
        System.out.println(producten.size());
    }

    public String getItemName(int index){
        return producten.get(bestel);
    }

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
