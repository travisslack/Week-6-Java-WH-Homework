import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before() {
    guitar = new Guitar("Brown", "Mahogany", "Acoustic");
  }

  @Test
  public void hasColour(){
    assertEquals("Brown", guitar.getColourOfInstrument() );
  }

  @Test
  public void typeofMaterial(){
    assertEquals("Mahogany", guitar.getTypeOfMaterial() );
  }

  @Test
  public void typeofInstrument() {
    assertEquals("Acoustic", guitar.getTypeOfInstrument() );
  }

  // public void sellingPrice() {
  //   assertEquals("12", guitar.getBuyingPrice() ;)
  // }
}

// public String screenMessage(){
// String output = "£"
// return output + this.cost;
// 