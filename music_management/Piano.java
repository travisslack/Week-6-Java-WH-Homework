package music_management;
import behaviours.*;

public class Piano extends Instrument implements Playable {

    public Piano(String colour, String material, String type) {
      super(colour, material, type);
    }

    public String sound() {
      return "duhmmmmmm!";
    }

  }