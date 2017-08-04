import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;

public class PianoTest {

  Piano piano;

  @Before
  public void before() {
    piano = new Piano("Black", "Hardwood", "Grand", 90, 120);
  }

  @Test
  public void hasColour(){
    assertEquals("Black", piano.getColourOfInstrument() );
  }

  @Test
  public void typeofMaterial(){
    assertEquals("Hardwood", piano.getTypeOfMaterial() );
  }

  @Test
  public void typeofInstrument() {
    assertEquals("Grand", piano.getTypeOfInstrument() );
  }

  @Test
  public void buyingPrice() {
    assertEquals(90.0, piano.getBuyingPrice(), 0.1 );
  }

  @Test
  public void sellingPrice() {
    assertEquals(120.0, piano.getSellingPrice(), 0.1);
  }
}