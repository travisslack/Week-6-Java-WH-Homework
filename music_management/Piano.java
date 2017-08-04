package music_management;
import behaviours.*;

public class Piano extends Instrument implements Playable{

    public Piano(String colour, String material, String type, double buyingPrice, double sellingPrice) {
      super(colour, material, type, buyingPrice, sellingPrice);
    }

    public String sound() {
      return "duhmmmmmm!";
    }

    

  }