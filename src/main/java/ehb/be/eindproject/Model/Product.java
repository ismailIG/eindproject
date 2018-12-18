package ehb.be.eindproject.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String naam;
    private  float prijs;
    private  String  voedsel;
    private  String  speelGoed;
    private  String   habitat;
    private  String beschrijving;

    // hier komt een constrctur

    public Product() {
    }

    // getters en setters

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public float getPrijs() {
        return prijs;
    }

    public void setPrijs(float prijs) {
        this.prijs = prijs;
    }

    public String getVoedsel() {
        return voedsel;
    }

    public void setVoedsel(String voedsel) {
        this.voedsel = voedsel;
    }

    public String getSpeelGoed() {
        return speelGoed;
    }

    public void setSpeelGoed(String speelGoed) {
        this.speelGoed = speelGoed;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
