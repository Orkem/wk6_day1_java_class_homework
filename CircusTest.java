import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CircusTest{
  Circus circus;
  Person person;
  CircusQueue queue;

  @Before
  public void before(){
    circus = new Circus();
    person = new Person();
    queue = new CircusQueue();
  }

  @Test
  public void testGetNamePerson(){
    assertEquals("Chris", person.getName());
  }

  @Test
  public void testGetNameCircus(){
    assertEquals("Zippos Circus", circus.getName());
  }

  @Test 
  public void testNoPeopleInCircus(){
    assertEquals(0, circus.countPeople());
  }
  @Test
  public void testAddPeopleToCircus(){
    circus.addPerson();
    assertEquals(1, circus.countPeople());
  }
  @Test
  public void testCheckCircusIsFull(){
    for(int i = 0; i < 5; i++){
      circus.addPerson(); 
    }
    System.out.println(circus.countPeople());
    assertEquals(true, circus.isFull());
  }
}