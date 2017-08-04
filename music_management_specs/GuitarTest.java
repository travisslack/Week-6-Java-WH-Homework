import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before() {
    guitar = new Guitar("Brown", "Mahogany", "Acoustic", 80, 150);
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
  @Test
  public void buyingPrice() {
    assertEquals(80.0, guitar.getBuyingPrice(), 0.1 );
  }

  @Test
  public void sellingPrice() {
    assertEquals(150.0, guitar.getSellingPrice(), 0.1);
  }
}

