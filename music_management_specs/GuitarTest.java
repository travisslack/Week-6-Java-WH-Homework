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
    assertEquals("Brown", guitar.getColour() );
  }

  @Test
  public void typeofMaterial(){
    assertEquals("Mahogany", guitar.getTypeOfMaterial() );
  }
}