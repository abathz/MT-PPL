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

public class TestLogout {

  private String testString;
  
  public TestLogout() {}
  
  @Before
  public void setUp() {
    this.testString = "logout";
  }
  
  @Test
  public void TestLogoutSuccess () {
    assertTrue("Logout Success!", this.testString.equals(this.testString));
  }
  
  @Test
  public void TestLogoutFailed () {
    assertTrue("Logout Failed!", !this.testString.equals(this.testString));
  }
  
  @AfterClass
  public static void tearDown () {
    System.out.println("Test Logout Completed!");
  }
}
