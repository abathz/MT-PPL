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

public class TestParticipantSelectedHelp {
  
  private String help;
  
  public TestParticipantSelectedHelp () {}
  
  @Before
  public void setUp () {
    this.help = "list-invitation";
  }
  
  @Test
  public void TestParticipantSelectedHelpSuccess () {
    assertTrue("Features Selected!", this.help.equals(this.help));
  }
  
  @Test
  public void TestParticipantSelectedHelpFailed () {
    assertTrue("Invalid Input!", !this.help.equals(this.help));
  }
  
  @AfterClass
  public static void tearDown () {
    System.out.println("Test Participant Selected Help Completed!");
  }
}
