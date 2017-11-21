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

public class TestAdminSelectedHelp {
  
  private String help;
  
  public TestAdminSelectedHelp () {}
  
  @Before
  public void setUp () {
    this.help = "list-user";
  }
  
  @Test
  public void TestAdminSelectedHelpSuccess () {
    assertTrue("Features Selected!", this.help.equals("list-user"));
  }
  
  @Test
  public void TestAdminSelectedHelpFailed () {
    assertTrue("Invalid Input!", !this.help.equals("list-user"));
  }
  
  @AfterClass
  public static void tearDown () {
    System.out.println("Test Admin Selected Help Completed!");
  }
}
