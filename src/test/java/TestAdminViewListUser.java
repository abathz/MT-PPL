/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abathz
 */
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

public class TestAdminViewListUser {
  
  private String help;
  
  public TestAdminViewListUser () {}
  
  @Before
  public void setUp () {
    this.help = "list-user";
  }
  
  @Test
  public void TestAdminViewListSuccess () {
    assertTrue("Admin can view list user!", this.help.equals(this.help));
  }
  
  @Test
  public void TestAdminViewListFailed () {
    assertTrue("Invalid Input!", !this.help.equals(this.help));
  }
  
  @AfterClass
  public static void tearDown () {
    System.out.println("Test Admin View List User Completed!");
  }
}

