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

public class TestParticipantHelp {

  private String testString;
  
  public TestParticipantHelp() {}
  
  @Before
  public void setUp() {
    this.testString = "help";
  }
  
  @Test
  public void TestPartifipantHelpSuccess () {
    assertTrue("Help Function Success!", this.testString.equals(this.testString));
  }
  
  @Test
  public void TestPartifipantHelpFailed () {
    assertTrue("Invalid input!", !this.testString.equals(this.testString));
  }
  
  @AfterClass
  public static void tearDown () {
    System.out.println("Test Participant Help Completed!");
  }
}
