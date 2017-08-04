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
}