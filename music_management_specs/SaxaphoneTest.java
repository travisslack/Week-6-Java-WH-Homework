import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;

public class SaxaphoneTest {

  Saxaphone saxaphone;

  @Before
  public void before() {
    saxaphone = new Saxaphone("Gold", "Brass", "Baritone", 30, 50);
  }

  @Test
  public void hasColour() {
    assertEquals ("Gold", saxaphone.getColourOfInstrument() );
  }

  @Test
  public void typeofMaterial(){
    assertEquals("Brass", saxaphone.getTypeOfMaterial() );
  }

  @Test
  public void typeofInstrument() {
    assertEquals("Baritone", saxaphone.getTypeOfInstrument() );
  }

  @Test
  public void sellingPrice() {
    assertEquals(50.0, saxaphone.getSellingPrice(), 0.1);
  }

  @Test
  public void buyingPrice() {
    assertEquals(30.0, saxaphone.getBuyingPrice(), 0.1 );
  }

  @Test
  public void finalPrice() {
    assertEquals(20.0, saxaphone.calculateMarkup(), 0.1);
  }


}