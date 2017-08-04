import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;

public class SaxaphoneTest {

  Saxaphone saxaphone;

  @Before
  public void before() {
    saxaphone = new Saxaphone("Gold", "Brass", "Baritone");
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
}