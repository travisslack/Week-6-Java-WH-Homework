package music_management;

public abstract class Instrument {
  
  protected String colour;
  protected String material;
  protected String type;
  protected double buyingPrice;
  protected double sellingPrice;

  public Instrument(String colour, String material, String type, double buyingPrice, double sellingPrice) {
    this.colour = colour;
    this.material = material;
    this.type = type;
    this.sellingPrice = sellingPrice;
    this.buyingPrice = buyingPrice;
  }

  public String getColourOfInstrument() {
    return this.colour;
  }

  public String getTypeOfMaterial() {
    return this.material;
  }

  public String getTypeOfInstrument() {
    return this.type;
  }

  public double getBuyingPrice() {
    return this.buyingPrice;
  }

  public double getSellingPrice() {
    return this.sellingPrice;
  }

  public double calculateMarkup() {
    return this.sellingPrice - this.buyingPrice;
  }
  
}