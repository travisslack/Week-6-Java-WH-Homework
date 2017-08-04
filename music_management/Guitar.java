package music_management;
import behaviours.*;

public class Guitar extends Instrument implements Playable {

  public Guitar(String colour, String material, String type) {
    super(colour, material, type);
  }

  public String sound() {
    return "Waooooo!";
  }

  public String getColour() {
    return this.colour;
  }

  public String getTypeOfMaterial() {
    return this.material;
  }

}