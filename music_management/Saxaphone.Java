package music_management;
import behaviours.*;

public class Saxaphone extends Instrument implements Playable {

    public Saxaphone(String colour, String material, String type) {
      super(colour, material, type);
    }

    public String sound() {
      return "wohhhh!";
    }

  }
