package music_management;
import behaviours.*;

public class Saxaphone extends Instrument implements Playable{

    public Saxaphone(String colour, String material, String type, double buyingPrice, double sellingPrice) {
      super(colour, material, type, buyingPrice, sellingPrice);
    }

    public String sound() {
      return "wohhhh!";
    }
}
