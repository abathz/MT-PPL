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

public class TestInitiatorHelp {

  private String testString;
  
  public TestInitiatorHelp() {}
  
  @Before
  public void setUp() {
    this.testString = "help";
  }
  
  @Test
  public void TestInitiatorHelpSuccess () {
    assertTrue("Help Function Success!", this.testString.equals(this.testString));
  }
  
  @Test
  public void TestInitiatorHelpFailed () {
    assertTrue("Invalid input!", !this.testString.equals(this.testString));
  }
  
  @AfterClass
  public static void tearDown () {
    System.out.println("Test Initiator Help Completed!");
  }
}
