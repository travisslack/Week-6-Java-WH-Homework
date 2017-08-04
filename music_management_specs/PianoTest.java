import static org.junit.Assert.*;
import org.junit.*;
import music_management.*;

public class PianoTest {

  Piano piano;

  @Before
  public void before() {
    piano = new Piano("Black", "Hardwood", "Grand");
  }

  @Test
  public void hasColour(){
    assertEquals("Black", guitar.getColourOfInstrument() );
  }

  // @Test
  // public void typeofMaterial(){
  //   assertEquals("Hardwood", guitar.getTypeOfMaterial() );
  // }

  // @Test
  // public void typeofInstrument() {
  //   assertEquals("Acoustic", guitar.getTypeOfInstrument() );
  // }
}