package music_management;

public abstract class Instrument {
  
  protected String colour;
  protected String material;
  protected String type;
}

public Instrument(String colour, String material, String type) {
  this.colour = colour;
  this.material = material;
  this.type = type;
}

public String getColourOfInstrument() {
  return this.colour;
}

public String getMaterialOfInstrument() {
  return this.material;
}

public String getTypeOfInstrument() {
  return this.type;
}