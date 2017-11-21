/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abathz
 */
import org.junit.*;
import static org.junit.Assert.*;

public class TestInitiatorSelectedHelp {
  
  private String help;
  
  public TestInitiatorSelectedHelp () {}
  
  @Before
  public void setUp () {
    this.help = "list-meeting";
  }
  
  @Test
  public void TestInitiatorSelectedHelpSuccess () {
    assertTrue("Features Selected!", this.help.equals(this.help));
  }
  
  @Test
  public void TestInitiatorSelectedHelpFailed () {
    assertTrue("Invalid Input!", !this.help.equals(this.help));
  }
  
  @AfterClass
  public static void tearDown () {
    System.out.println("Test Initiator Selected Help Completed!");
  }
}
