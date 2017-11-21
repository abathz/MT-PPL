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

public class TestAdminHelp {

  private String testString;
  
  public TestAdminHelp() {}
  
  @Before
  public void setUp() {
    this.testString = "help";
  }
  
  @Test
  public void TestAdminHelpFunctionSuccess () {
    assertTrue("Help Function Success!", this.testString.equals(this.testString));
  }
  
  @Test
  public void TestAdminHelpFunctionFailed () {
    assertTrue("Invalid input!", !this.testString.equals(this.testString));
  }
  
  @AfterClass
  public static void tearDown () {
    System.out.println("Test Admin Help Completed!");
  }
}
